
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Character;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            +"\nC - Print Characters to a file"
            +"\nL - Print Location of player to a file"
            +"\n----------------------------------------------");
    }

    
    
    @Override
    public void doAction(String value) {

        switch (value){
            case "N":
        {
            try {
                this.startNewgame();
            } catch (MapControlException ex) {
                Logger.getLogger(mainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n**** invalid selection ***** try again");
                break;
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

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                + "is to be pulled from.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("Main MenuView", filePath);
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void startNewgame() throws MapControlException {
        
        // IMPLEMENT THE CHOOSECHARACTERVIEW()
        
        GameControl.createNewGame(TreeOfLife.getPlayer());
        
        
        this.console.println("\n\n\nYou awake in a large, dark, and dreary"
            + "\nwilderness. You see a group of people holding onto a rod made of"
            + "\niron heading towards a great source of light on the horizon. You"
            + "\nsee a sign in front of you. It reads:"
            + "\n'Use the books in your hand to help guide your way and avoid"
            + "\nthe pitfall along the way. Remember: DON'T LET GO OF THE ROD!'"
            + "\nYou look in your hand and see a book entitled 'The Book of"
            + "\nMormon'.");
        String choice = "";
        while (!(choice.equals("E"))){
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            choice = gameMenu.getInput();
            gameMenu.doAction(choice);
        }
    }
}
