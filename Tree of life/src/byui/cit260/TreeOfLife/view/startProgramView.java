/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.ProgramControl;
import byui.cit260.TreeOfLife.model.Player;
import java.util.Scanner;
import tree.of.life.TreeOfLife;

public class startProgramView extends View{
    public startProgramView() {
        super("*****************************************"
          + "\n*This is the Tree of Life               *"
          + "\n*In this game you will try to hold on to*"
          + "\n*the iron rod long enought o get to the *"
          + "\n*Tree of Live.                          *"
          + "\n*There are pitfalls along the way but   *"
          + "\n*you can earn armor to protect you from *"
          + "\n*the firey darts of the adversary.      *"
          + "\n*****************************************"
          + "\n\n======================================"
          + "\n    Welcome to the game!"
          + "\n    We hope you have a lot of fun!"
          + "\n======================================"
          + "\nPlease select a name!");
    }
    
    @Override
    public void doAction(String choice) {
    }
    
    public void startProgram() {
        //Promt play to enter the name and retrive the name of the player
        String playersName = this.getInput();
        
        //Create and save the player object
        ProgramControl.createPlayer(playersName);
        
        //Display main menu
        mainMenuView mainMenu = new mainMenuView();
        mainMenu.display();
        String choice = mainMenu.getInput();
        mainMenu.doAction(choice);
    }
}  
