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
class GetQuestion {
    
    private final String QUESTION1 = "\n"
            +"\n---------------------------------------------------"
            +"\n| What is the verse of the scripture that reads:                                  |"
            +"\n---------------------------------------------------"
            +"\nAnd it came to pass that I, Nephi, said unto my    "
            +"\nfather: I will go and do the things which the      "
            +"\nLord hath commanded, for I know that the Lord      "
            +"\ngiveth no commandments unto the children of men,   "
            + "\nsave he shall prepare a way for them that they    "
            + "\nmay accomplish the thing which he commandeth them "
            + "\n                                                  "
            + "\nS - skip this question                            "
            + "\nE - Exit Questions                                "
            +"\n---------------------------------------------------"; 
    
        void displayQuestion() {
       char selection = ' ';
       do {
           System.out.println(QUESTION1);
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
            System.out.println("Type your answer here: ");
            
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
            case '7':System.out.println("\n Great Job! That is the right answer.");
                break;    
            case 'S':skipQuestion();
                break;
            case 'E':
                return;
            default:
                System.out.println("\nThat isnt the answer I was Looking for.");
                break;
            }  
        }

    void skipQuestion() {
        System.out.println("function was called Skip question");
    }

   
}

