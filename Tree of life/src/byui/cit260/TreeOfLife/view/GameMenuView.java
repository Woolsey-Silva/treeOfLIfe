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
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Game Menu                                  |"
            +"\n----------------------------------------------"
            +"\nT - Temple Menu Questions explained"
            +"\nH - Get help on how to play the game"
            +"\nF - Forging Armor Explained"
            +"\nM - Show Map"
            +"\nS - Save Game"
            +"\nQ - Quit Game"
            +"\nE - Exit Game Menu"
            +"\n----------------------------------------------";
    
    public void dispayMenu() {
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
            case 'T':
                this.explainTempleQuestions();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'F':
                this.explainForge();
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

    private void explainTempleQuestions() {
        System.out.println("explainTempleQuestions function was called");
    }

    private void displayHelpMenu() {
        System.out.println("displayHelpMenu function was called");
    }

    private void explainForge() {
        System.out.println("explainForge function was called");
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
