package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Map;
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
            +"\n|M - Show Map (Begin Game)                   |"
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
            case "M":
                this.showMap();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                return;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
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
            
            inventory.add(Item.IngotOfFaith);
            
            inventoryItemView.display();
            
            for (Item i : inventory) {
                System.out.printf(i.getItemDescription());
                System.out.println("\t\t\t" + i.getName());
            }
            System.out.println("Press 'E' to exit");
            
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
            System.out.println("\nList of Inventory Items");
            System.out.println("Description\t\tName");
      
            // for loop for the size of the Item enum
            for (Item item :Item.values()) {
                System.out.println(item);
            }
            System.out.println("Press 'E' to exit");
            choice = gameItemList.getInput();
            gameItemList.doAction(choice);
        }
    }

    private void showMap() {
        MapView mapView = new MapView();
        mapView.display();
        mapView.displayMap();
        
        
    }

    private void saveGame() {
        System.out.println("saveGame function was called");
    }
}
