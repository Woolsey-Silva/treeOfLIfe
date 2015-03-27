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
public class TempleMenuView extends View{
    public TempleMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Temple Menu Questions                      |"
            +"\n|---------------------------------------------"
            +"\n|G - Get Question                            |"
            +"\n|S - Skip Question                           |"
            +"\n|E - Exit                                    |"
            +"\n----------------------------------------------");
    } 
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "G":
                this.askQuestionView();
                break;
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n**** invalid selection ***** try again");
                break;        
        }
    }

    private void askQuestionView() {
        askQuestionView askQuestion = new askQuestionView();
        askQuestion.display();
    }
}
