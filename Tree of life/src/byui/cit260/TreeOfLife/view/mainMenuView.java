/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import java.util.Scanner;
import tree.of.life.TreeOfLife;


/**
 *
 * @author ENTELLiJENSE
 */
public class mainMenuView {
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Main Menu                                  |"
            +"\n----------------------------------------------"
            +"\nG - Start game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save"
            +"\nE - Exit"
            +"\n----------------------------------------------";
    
    void displayMenu() {
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
            
            input =keyboard.nextLine();
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
        System.out.println("function was called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("function was called");
    }

    private void startNewgame() {
        GameControl.createNewGame(TreeOfLife.getPlayer());
    
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.dispayMenu();
    }
    
}
