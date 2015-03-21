/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.of.life;

import byui.cit260.TreeOfLife.view.startProgramView;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Game;
/**
 *
 * @author ENTELLiJENSE
 */
public class TreeOfLife {

    private static Game currentGame = null;
    private static Player player = null;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startProgramView startProgramView = new startProgramView();
        try {
            startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
        }
    }

    public static Game getGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TreeOfLife.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TreeOfLife.player = player;
    }
    
}
