package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Map;
import java.util.Scanner;

public class GameMenuView extends View {
    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Game Menu                                  |"
            +"\n|--------------------------------------------|"
            +"\n|H - Get help on how to play the game        |"
            +"\n|M - Show Map (Begin Game)                   |"
            +"\n|S - Save Game                               |"
            +"\n|E - Exit Game                               |"
            +"\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String choice = (String)obj;
        switch (choice){
            case "H":
                this.displayHelpMenu();
                break;
            case "M":
                this.showMap();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                return true;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
        return false;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void showMap() {
        Map map = new Map();
        map.setColCount(3);
        map.setRowCount(3);
        
        MapView mapView = new MapView();
        mapView.display();
    }

    private void saveGame() {
        System.out.println("saveGame function was called");
    }
}
