package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Map;
import java.util.Scanner;

public class GameMenuView extends View {
    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Game Menu                                  |"
            +"\n|--------------------------------------------|"
            +"\n|H - Get help on how to play the game        |"
            +"\n|V - View Inventory                          |"
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
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void viewInventory() {
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Name");
        
        // for loop for the size of the Item enum
        
        for (Item item : Item.values()) {
            System.out.println(item);
        }
    }

    private void showMap() {
        MapView mapView = new MapView();
        mapView.display();
    }

    private void saveGame() {
        System.out.println("saveGame function was called");
    }
}
