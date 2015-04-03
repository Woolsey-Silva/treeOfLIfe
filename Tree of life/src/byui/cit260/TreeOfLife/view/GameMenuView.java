package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.control.InventoryControl;
import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.control.forgeArmor;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
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
        this.console.println("Finish this function!");
    }

    private void setUpForge() {
        this.console.println("FINISH THIS FUNCTION!");
    }
}
