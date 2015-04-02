/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.of.life;

import byui.cit260.TreeOfLife.view.startProgramView;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 *
 * @author ENTELLiJENSE
 */
public class TreeOfLife {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    private static PrintWriter locFile = null;
    private static PrintWriter charFile = null;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            //open character stream file for end user input and output
            TreeOfLife.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            TreeOfLife.outFile =
                    new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "C:/Users/Caleb/Desktop/log.txt";
            TreeOfLife.logFile = new PrintWriter(filePath);
        
            // create StartProgramView and start the program
            Player player = TreeOfLife.getPlayer();
            int col = player.getColCount();
            int row = player.getRowCount();
            System.out.println("RowCount: " + row);
            System.out.println("ColCount: " + col);
            startProgramView startProgramView = new startProgramView();
            startProgramView.display();
            startProgramView.startProgram();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        
        finally {
            try {
                if (TreeOfLife.inFile != null)
                    TreeOfLife.inFile.close();
                
                if (TreeOfLife.outFile != null)
                    TreeOfLife.outFile.close();
                
                if (TreeOfLife.logFile != null)
                    TreeOfLife.logFile.close();
                
                if (TreeOfLife.locFile != null)
                    TreeOfLife.locFile.close();
                
                if (TreeOfLife.charFile != null)
                    TreeOfLife.charFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files!");
                return;
            }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TreeOfLife.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TreeOfLife.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TreeOfLife.logFile = logFile;
    }

    public static PrintWriter getLocFile() {
        return locFile;
    }

    public static void setLocFile(PrintWriter locFile) {
        TreeOfLife.locFile = locFile;
    }

    public static PrintWriter getCharFile() {
        return charFile;
    }

    public static void setCharFile(PrintWriter charFile) {
        TreeOfLife.charFile = charFile;
    }
    
    
    
    
}
