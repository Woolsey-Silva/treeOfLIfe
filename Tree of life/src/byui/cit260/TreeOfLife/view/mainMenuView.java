
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import tree.of.life.TreeOfLife;

public class mainMenuView extends View {
    
    public mainMenuView(String promptMessage) {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Main Menu                                  |"
            +"\n----------------------------------------------"
            +"\nN - Start a new game"
            +"\nG - Start an existing game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save"
            +"\nE - Exit"
            +"\n----------------------------------------------");
    }

    
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'N':
                this.startNewgame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n**** invalid selection ***** try again");
                break;
        }
        return false;
    }  

    private void saveGame() {
        System.out.println("saveGame() FUNCTION WAS CALLED! THIS FUNCTION NEEDS"
                + "\nTO BE FINISHED!");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() FUNCTION WAS CALLED! THIS"
                + "\nFUNCTION NEEDS TO BE FINISHED!");
    }

    private void startNewgame() {
        GameControl.createNewGame(TreeOfLife.getPlayer());
        
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayIntro();
        gameMenu.displayMenu();
    }
}
