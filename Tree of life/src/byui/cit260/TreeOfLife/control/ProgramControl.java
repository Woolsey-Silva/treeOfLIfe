/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Player;
import tree.of.life.TreeOfLife;
/**
 *
 * @author ENTELLiJENSE
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        TreeOfLife.setPlayer(player);
        
        return player;
    }
    
}
