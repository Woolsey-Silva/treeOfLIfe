/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.control.ProgramControl;
import byui.cit260.TreeOfLife.model.Player;
import java.util.Scanner;

/**
 *
 * @author ENTELLiJENSE
 */
public class startProgramView {

    public startProgramView() {
    }
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        //Promt play to enter the name and retrive the name of the player
        String playersName = this.getPlayersName();
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        //Display personalized welcome message
        this.displayWelcomeMessage(player);
        //Display main menu
        mainMenuView mainMenu = new mainMenuView();
        mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n\n\n\n*****************************************");
        System.out.println("*This is the Tree of Life               *");
        System.out.println("*In this game you will try to hold on to*");
        System.out.println("*the iron rod long enought o get to the *");
        System.out.println("*Tree of Live.                          *");
        System.out.println("*There are pitfalls along the way but   *");
        System.out.println("*you can earn armor to protect you from *");
        System.out.println("*the firey darts of the adversary.      *");
        System.out.println("*****************************************");
    }

    public String getPlayersName() {
         boolean valid = false;
         String playerName = null;
         Scanner keyboard = new Scanner(System.in);
         
         while(!valid) {
            System.out.println("Enter the player's name below");
            
            playerName =keyboard.nextLine();
            playerName = playerName.trim();
            
            if(playerName.length()<2) {
             System.out.println("invalid name - The name must not be blank");
            }
            break;
        }
         return playerName;
    }

    public void displayWelcomeMessage(Player player) {
     System.out.println("\n\n======================================");
     System.out.println("    Welcome to the game " + player.getName());
     System.out.println("    We hope you have a lot of fun!");
     System.out.println("======================================");
    }
}  
