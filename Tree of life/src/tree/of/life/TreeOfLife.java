/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.of.life;

import byui.cit260.TreeOfLife.model.Game;

/**
 *
 * @author ENTELLiJENSE
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.setGameTime(5);
        game1.setRecordTime(10);
        String test = game1.toString();
        System.out.println(test);
    }
    
}
