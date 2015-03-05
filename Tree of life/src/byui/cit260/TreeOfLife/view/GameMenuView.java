/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author ENTELLiJENSE
 */
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
        System.out.println("showMap function was called");
    }

    private void saveGame() {
        System.out.println("saveGame function was called");
    }
}
