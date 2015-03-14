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
import tree.of.life.TreeOfLife;
public class MapView extends View{

    public MapView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n|                 Map View                   |"
            +"\n|--------------------------------------------|");
    }
    
    @Override
    public void doAction(String choice) {
    }
    
    public void displayMap(int rowCount, int colCount) {
        //get the map locations from the current game   
        Game game = TreeOfLife.getGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        //DISPLAY row of column numbers
        
        
        //FOR every row in map
        int rowNum = map.getRowCount();
        int colNum = map.getColCount();
        
        System.out.println("   Col      1   2   3   4   5               ");
        
        for(int i = 0; rowNum > i; i++){
            
            // If it is the last row in the map
            if(i == (rowNum - 1)){
                System.out.println("   Row   " + (i + 1));
            }
            
            // Otherwise
            else {
                System.out.println("         " + (i + 1));
            }
            
            for(int j = 0; colNum > j; j++) {
            
                //DISPLAY column divider 
                System.out.println(" ");
            
                //location = location[row][column]
                Location location = locations[i][j];
                boolean isVisited = location.isVisited();
                
                //IF location has been visited
                if(isVisited) {
                    //DISPLAY the map symbol for visited location
                    System.out.println("[*]");
                }
        
                //ELSE
                else {
                    //DISPLAY the map symbol for default location
                    System.out.println("[ ]");
                }
            }
        }
        // Display ending row divider
        System.out.println("--------------------------------------------");
    }        
}


 //DISPLAY row divider
            //System.out.println("--------------------------------------------");


/*public class MapView extends View{
    public MapView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n|                 Map View                   |"
            +"\n|--------------------------------------------|"
            +"\n   Col      1   2   3   4   5                 "
            +"\n         1 [ ] [ ] [ ] [ ] [ ]                "
            +"\n         2 [ ] [ ] [ ] [ ] [ ]                "
            +"\n         3 [ ] [ ] [X] [ ] [ ]                "
            +"\n         4 [ ] [ ] [ ] [ ] [ ]                "
            +"\n   Row   5 [ ] [ ] [ ] [ ] [ ]                "  
            +"\n----------------------------------------------"
            +"\n| What would you like to do?                 |"
            +"\n----------------------------------------------"
            +"\n|M - Move to new location                    |"
            +"\n|F - Set up the forge                        |"
            +"\n|E - Exit the Map View                        |"
            +"\n----------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "M":
                MapControl mapControl = new MapControl();
                mapControl.move();
                break;
            case "F":
                forgeArmor forgeArmor = new forgeArmor();
                break;
            case "E":
                return;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
    }
}*/
