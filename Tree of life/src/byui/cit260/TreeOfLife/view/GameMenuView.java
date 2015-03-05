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
class GameMenuView {
    private final String INTRO = "\n\n\nYou awake in a large, dark, and dreary"
            + "\nwilderness. You see a group of people holding onto a rod made of"
            + "\niron heading towards a great source of light on the horizon. You"
            + "\nsee a sign in front of you. It reads:"
            + "\n'Use the books in your hand to help guide your way and avoid"
            + "\nthe pitfall along the way. Remember: DON'T LET GO OF THE ROD!'"
            + "\nYou look in your hand and see a book entitled 'The Book of"
            + "\nMormon'.";
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Game Menu                                  |"
            +"\n|--------------------------------------------|"
            +"\n|H - Get help on how to play the game        |"
            +"\n|M - Show Map (Begin Game)                   |"
            +"\n|S - Save Game                               |"
            +"\n|Q - Quit Game                               |"
            +"\n|E - Exit Game Menu                          |"
            +"\n----------------------------------------------";
    
    public void displayIntro() {
        System.out.println(INTRO);
    }
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
        }while (selection != 'E');
    }

    public String getInput() {
        boolean valid = false;
         String input = null;
         Scanner keyboard = new Scanner(System.in);
         
         while(!valid) {
            System.out.println("What would you like to do?: ");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length()<1) {
             System.out.println("invalid Input - The input must not be blank");
            }
            break;
        }
         return input;
    }

    public void doAction(char choice) {
        switch (choice){
            case 'H':
                this.displayHelpMenu();
                break;
            case 'M':
                this.showMap();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'Q':
                this.exitGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void showMap() {
        System.out.println("showMap function was called");
    }

    private void saveGame() {
        System.out.println("saveGame function was called");
    }

    private void exitGame() {
        System.out.println("exitGame function was called");
    }

}
