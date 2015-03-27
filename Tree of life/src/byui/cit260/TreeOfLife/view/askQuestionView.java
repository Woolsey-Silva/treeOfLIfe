/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author Caleb
 */
public class askQuestionView extends View {
    public askQuestionView() {
        super("\n"
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
            +"\n---------------------------------------------------");
    }
    
      
    @Override
    public void doAction(String choice) {
            switch (choice){
            case "7":
                this.console.println("\n Great Job! That is the right answer.");
                break;    
            case "S":
                skipQuestion();
                break;
            case "E":
                return;
            default:
                this.console.println("\nThat isnt the answer I was Looking for.");
                break;
            }
        }

    void skipQuestion() {
        this.console.println("function was called Skip question");
    }

}
