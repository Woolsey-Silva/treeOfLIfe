
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import tree.of.life.TreeOfLife;

public class mainMenuView extends View {
    
    public mainMenuView() {
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
    public void doAction(String value) {
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
                return;
            default:
                System.out.println("\n**** invalid selection ***** try again");
                break;
        }
    }  

    private void saveGame() {
        System.out.println("saveGame() FUNCTION WAS CALLED! THIS FUNCTION NEEDS"
                + "\nTO BE FINISHED!");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() FUNCTION WAS CALLED! THIS"
                + "\nFUNCTION NEEDS TO BE FINISHED!");
    }

    private void startNewgame() {
        
        // IMPLEMENT THE CHOOSECHARACTERVIEW()
        
        GameControl.createNewGame(TreeOfLife.getPlayer());
        
        
        System.out.println("\n\n\nYou awake in a large, dark, and dreary"
            + "\nwilderness. You see a group of people holding onto a rod made of"
            + "\niron heading towards a great source of light on the horizon. You"
            + "\nsee a sign in front of you. It reads:"
            + "\n'Use the books in your hand to help guide your way and avoid"
            + "\nthe pitfall along the way. Remember: DON'T LET GO OF THE ROD!'"
            + "\nYou look in your hand and see a book entitled 'The Book of"
            + "\nMormon'.");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
