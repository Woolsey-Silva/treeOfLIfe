package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.control.InventoryControl;
import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.control.forgeArmor;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Question;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import tree.of.life.TreeOfLife;

public class GameMenuView extends View {
    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Game Menu                                  |"
            +"\n|--------------------------------------------|"
            +"\n|H - Get help on how to play the game        |"
            +"\n|V - View Inventory                          |"
            +"\n|G - View all game items                     |"
            +"\n|X - Show Map                                |"
            +"\n|M - Move Location on Map (Begin Game)       |"
            +"\n|F - Set up the forge                        |"
            +"\n|P - To view current progress                |"
            +"\n|A - Answer question in current location     |"
            +"\n|S - Save Game                               |"
            +"\n|E - Exit Game                               |"
            +"\n----------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "H":
                this.displayHelpMenu();
                break;
            case "V":
                this.viewInventory();
                break;
            case "G":
                this.viewGameItems();
                break;
            case "X":
                this.showMap();
                break;
            case "M":
                this.move();
                break;
            case "F":
                this.setUpForge();
                break;
            case "A":
                this.answer();
                break;
            case "S":
                this.saveGame();
                break;
            case "P":
                this.progress();
                break;
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\nINVALID SELECTION! Try again!");
                break;
        }
    }

    private void displayHelpMenu() {
        String choice = ""; 
        while (!(choice.equals("E"))) {
            HelpMenuView helpMenu = new HelpMenuView();
            helpMenu.display();
            choice = helpMenu.getInput();
            helpMenu.doAction(choice);
        }
    }
    
    private void viewInventory() {
        String choice = "";
        InventoryItemView inventoryItemView = new InventoryItemView();
        while (!(choice.equals("E"))) {
            Game game = TreeOfLife.getGame();
            ArrayList<Item> inventory = game.getBackpack();
            inventoryItemView.display();
            
            for (Item i : inventory) {
                this.console.printf(i.getItemDescription());
                this.console.println("\t\t\t" + i.getName());
            }
            this.console.println("Press 'E' to exit");
            
            choice = inventoryItemView.getInput();
            inventoryItemView.doAction(choice);
        }
    }
    
    private void viewGameItems() {
        String choice = "";
        GameItemListView gameItemList = new GameItemListView();
        while (!(choice.equals("E"))) {
            Game game = TreeOfLife.getGame();
            
            gameItemList.display();
            this.console.println("\nList of Inventory Items");
            this.console.println("Description\t\tName");
      
            // for loop for the size of the Item enum
            for (Item item :Item.values()) {
                this.console.println(item);
            }
            this.console.println("Press 'E' to exit");
            choice = gameItemList.getInput();
            gameItemList.doAction(choice);
        }
    }

    private void showMap() {
        MapView mapView = new MapView();
        mapView.display();
        mapView.displayMap();    
    }
    
    private void move() {
        MapControl mapControl = new MapControl();
        
        // Prompt the user for col location to move to and parseInt from String
        this.console.println("Enter the col you would like to move to!");
        String colStr = this.getInput();
        int col = Integer.parseInt(colStr);
        
        this.console.println("Enter the row you would like to move to!");
        String rowStr = this.getInput();
        int row = Integer.parseInt(rowStr);
        
        try {
            mapControl.move(row, col);
        }
        catch (Exception e) {    
        }
    }

    private void saveGame() {
        //Prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the filepath for file where the game"
                + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(TreeOfLife.getGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void printLoc() {
        try {
            // open loc file
            String filePath = "C:/Users/Caleb/Desktop/location.txt";
            PrintWriter locFile = TreeOfLife.getLocFile();
            locFile = new PrintWriter(filePath);
            
            // print location of player to the file.
            Player player = TreeOfLife.getPlayer();
            int colCount = player.getColCount();
            int rowCount = player.getRowCount();
            locFile.println("Row Count of Player: " + rowCount);
            locFile.println("Column Count of Player: " + colCount);
            
            // save the loc file
            TreeOfLife.setLocFile(locFile);
            return;
        } catch (Throwable e) {
            ErrorView.display(this.getClass().getName(), ("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage()));
            e.printStackTrace();;
        }
    }

    private void printChar() {
        try {
            // open charFile
            String filePath = "C:/Users/Caleb/Desktop/character.txt";
            PrintWriter charFile = TreeOfLife.getCharFile();
            charFile = new PrintWriter(filePath);
            
            // print the character to the file
            Player player = TreeOfLife.getPlayer();
            byui.cit260.TreeOfLife.model.Character character = player.getCharacter();
            charFile.println("Character: " + character);
            
            // Reset the charFile
            TreeOfLife.setCharFile(charFile);
            
            return;
        } catch (Throwable e) {
            ErrorView.display(this.getClass().getName(), ("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage()));
            e.printStackTrace();;
        }
    }

    private void answer() {
        // Obtain the games locations
        Game game = TreeOfLife.getGame();
        Map map = game.getMap();
        Location[][] location = map.getLocations();
        
        // Obtain the players current location
        Player player = game.getPlayer();
        int playerCol = player.getColCount();
        int playerRow = player.getRowCount();
        
        // Get the question from the current location of the player
        Question questionWhole = location[playerRow][playerCol].getQuestionInLocation();
        
        // Get the question from the question object
        String question = questionWhole.getQuestion();
        
        // Ask the question to the user
        System.out.println(question);   
        
        // Get the actual answer from the question object
        String actualAnswer = questionWhole.getAnswer();
        
        // Prompt the user for the answer
        String userAnswer = this.getInput();
          
        // Test userAnswer vs actualAnswer
        if (userAnswer.equals(actualAnswer)) {
        
        // Get the item located in that location
        Item item = location[playerRow][playerCol].getItemInLocation();
                
        // Award the user the item
        InventoryControl inventoryControl = new InventoryControl();
        inventoryControl.addItem(item);
        
        // Display which item was added to the user!
        System.out.println("Correct! " + item + " was added to your"
               + "\ninventory!");
        }
        // Otherwise tell them the answer was wrong
        else {
             this.console.println("Sorry the answer is incorrect! Try again!");
        }
    }

    private void setUpForge() {
        ForgeView forge = new ForgeView();
        forge.display();
        String choice = forge.getInput();
        forge.doAction(choice);
    }

    private void progress() {
        // Obtain the users current game
        Game game = TreeOfLife.getGame();
        
        // From the game, obtain the users attributes
        int IngotOfFaith = game.getFaith();
        int IngotOfObedience = game.getObedience();
        int IngotOfKnowledge = game.getKnowledge();
        int IngotOfHonesty = game.getHonesty();
        int IngotOfRighteousness = game.getRighteousness();
        int IngotOfVirtue = game.getVirtue();
        
        // Tell the user how many Ingots they currently have
        this.console.println("You now currently have:"
                + "\nIngots of Faith: " + IngotOfFaith + ""
                + "\nIngots of Obedience: " + IngotOfObedience + "" 
                + "\nIngots of Knowledge: " + IngotOfKnowledge + ""
                + "\nIngots of Honesty: " + IngotOfHonesty + ""
                + "\nIngots of Righteousness: " + IngotOfRighteousness + ""
                + "\nIngots of Virtue: " + IngotOfVirtue + "");
        
    }
}
