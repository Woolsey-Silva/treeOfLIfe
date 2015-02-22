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
public class HelpMenuView {
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Help Menu                                  |"
            +"\n----------------------------------------------"
            +"\nG - What is the goal of the Game"
            +"\nM - How to move"
            +"\nF- How to forge armor"
            +"\nT- What are Temple Menu questions"
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
            case 'G':
                this.goalHelp();
                break;
            case 'M':
                this.moveHelp();
                break;
            case 'F':
                this.forgeHelp();
                break;
            case 'T':
                this.templeHelp();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n**** invalid selection ***** try again");
                break;
                
            
                
        }
    }  

    private void goalHelp() {
        System.out.println("function was called");
    }

    private void moveHelp() {
        System.out.println("function was called");
    }

    private void forgeHelp() {
        System.out.println("function was called");
    }

    private void templeHelp() {
        System.out.println("function was called");
    }
    
}


