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
public class HelpMenuView extends View {
    public HelpMenuView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Help Menu                                  |"
            +"\n----------------------------------------------"
            +"\nG - What is the goal of the Game"
            +"\nM - How to move"
            +"\nF- How to forge armor"
            +"\nT- What are Temple Menu questions"
            +"\nE - Exit"
            +"\n----------------------------------------------");
    }
    
    
   
    @Override
    public boolean doAction(Object obj) {
        String choice = (String)obj;
        switch (choice){
            case "G":
                this.goalHelp();
                break;
            case "M":
                this.moveHelp();
                break;
            case "F":
                this.forgeHelp();
                break;
            case "T":
                this.templeHelp();
                break;
            case "E":
                return true;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
        return false;
    }

    private void goalHelp() {
        System.out.println("\n\nThe goal of the game is to answer the questions"
                + "\ncorrectly. When you answer a question correctly,"
                + "\nyou will get a small item. This item will have"
                + "\ncertain attributes. You can then combine small items"
                + "\nat the forge to make a peice of armor (given that"
                + "\nyou have  the appropriate items). Once you obtain"
                + "\n6 peices of armor and have the full Armor of God,"
                + "\nyou win the game.\n\n");
    }

    private void moveHelp() {
        System.out.println("\n\nAt the end of each question answered, it will"
                + "\ndisplay whether or not you got the answer correct. If you"
                + "\nget the answer correct, you will get a small item. After"
                + "\nthe scenario is finished you will get the option to move."
                + "\nWhich location you move to then determines which question"
                + "\nwill be asked in the next scenario, so choose wisely.\n\n");
    }

    private void forgeHelp() {
        System.out.println("\n\nObtaining small items from each correctly answered"
                + "\nquestion will give you the opportunity to progress and make"
                + "\npeices of armor. You can smelt these small items down into"
                + "\ningots of an attribute. When you have 10 ingots of a given"
                + "\nattribute, you can then make the armor that matches that"
                + "\nattribute. For example, having 10 ingots of faith will give"
                + "\nyou the ability to make the Shield of Faith!\n\n");
    }

    private void templeHelp() {
        System.out.println("\n\nAlong the way, you will have the opportunity to go"
                + "\nto the temple. The temple has bonus questions that are either"
                + "\nmoral in nature or could be mathematically complex. If you"
                + "\nanswer a temple question correctly, the rewards will be"
                + "\ngreat!\n\n");
    }
    
}


