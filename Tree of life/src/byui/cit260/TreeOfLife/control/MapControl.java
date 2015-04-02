/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import tree.of.life.TreeOfLife;

/**
 *
 * @author Caleb
 */
public class MapControl {

    public static Map createMap() {
       Map map = new Map(5,5);
       GameControl.assignScenesToLocation(map);
       GameControl.assignQuestionsToLocation(map);
       GameControl.assignItemsToLocation(map);
       return map;
    }
    
    public void move(int rowNum, int colNum) throws MapControlException {
        try {
            if (rowNum < 1 || rowNum > 5 || colNum < 1 || colNum > 5) {
                throw new MapControlException("The input location on the map"
                        + "\nis not valid! Please re-enter location and try again!");
            }
            else {
                Player player = TreeOfLife.getPlayer();
                player.setColCount(colNum - 1);
                player.setRowCount(rowNum - 1);
                
                Game game = TreeOfLife.getGame();
                Map map = game.getMap();
                Location[][] location = map.getLocations();
                location[rowNum - 1][colNum - 1].setVisited(true);
            }
        }
        catch (Exception e) {
               throw new MapControlException (e.getMessage()); 
        }
    }
}
