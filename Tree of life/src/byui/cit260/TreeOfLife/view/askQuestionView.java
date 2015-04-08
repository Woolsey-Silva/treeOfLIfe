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
    
    public askQuestionView(String question) {
        super (question);
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
