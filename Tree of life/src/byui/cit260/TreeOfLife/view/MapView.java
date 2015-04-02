/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.control.forgeArmor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import tree.of.life.TreeOfLife;

public class MapView extends View{

    public MapView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n|                 Map View                   |"
            +"\n----------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
    }
    
    public void displayMap() {
        //get the map locations from the current game   
        Game game = TreeOfLife.getGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        //DISPLAY row of column numbers
        
        
        //FOR every row in map
        int rowNum = map.getRowCount();
        int colNum = map.getColCount();
        
        this.console.println("   Col      1   2   3   4   5               ");
        
        for(int i = 0; rowNum > i; i++){
            
            // If it is the last row in the map
            if(i == (rowNum - 1)){
                this.console.printf("   Row   " + (i + 1));
            }
            
            // Otherwise
            else {
                this.console.printf("         " + (i + 1));
            }
            
            for(int j = 0; colNum > j; j++) {
            
                //DISPLAY column divider 
                this.console.printf(" ");
            
                //location = location[row][column]
                Location location = locations[i][j];
                boolean isVisited = location.isVisited();
                
                Player player = TreeOfLife.getPlayer();
                int playerCol = player.getColCount();
                int playerRow = player.getRowCount();
                
                //IF the player is in the location
                if (playerRow == i && playerCol == j && j == 4) {
                    this.console.println("[X]");
                }
                
                else if (playerRow == i && playerCol == j) {
                    this.console.printf("[X]");
                }
               
                //IF location has been visited
                else if (isVisited) {
                    if (j == 4){
                        this.console.println("[*]");
                    }
                    else {
                    //DISPLAY the map symbol for visited location
                    this.console.printf("[*]");
                    }
                }
        
                //ELSE
                else {
                    if (j == 4) {
                        this.console.println("[ ]");
                    }
                    else {
                    //DISPLAY the map symbol for default location
                    this.console.printf("[ ]");
                    }
                }
            }
        }
        // Display ending row divider
        this.console.println("--------------------------------------------");
    }        
}

/*


*/