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
public class TempleMenuView {
    
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Temple Menu Questions                                  |"
            +"\n----------------------------------------------"
            +"\nG - Get Question"
            +"\nS - Skip Question"
            +"\nH - Help"
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
                this.GetQuestion();
                break;
            case 'H':
                this.TempleHelp();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n**** invalid selection ***** try again");
                break;
                
            
                
        }
    }  

        private void GetQuestion() {
           GetQuestion getQuestion = new GetQuestion();
           getQuestion.displayQuestion();
        }

        private void TempleHelp() {
           TempleHelp templeHelp = new TempleHelp();
           templeHelp.displayMenu();
        }
    
   
    }
    

    

