/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.control.forgeArmor;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
public class MapView extends View{
    

public void displayMap(rowCount, colCount) {
 //get the map locations from the current game
Location = Location[][] getLocations();

         
 //DISPLAY title
 
 super("\n"
            +"\n----------------------------------------------"
            +"\n|                 Map View                   |"
            +"\n|--------------------------------------------|");
         
 //DISPLAY row of column numbers
        
 //FOR every row in map
    for(int r=1; Map.rowCount > r; r++){
        //DISPLAY row divider
        System.out.println("--------------------------------------------");
        //DISPLAY row number
        System.out.println(r + " [] ");
    
        //FOR every column in row
        for(int m=1; Map.colCount > m; m++) {
            //DISPLAY column divider 
            System.out.println("|");
            //location = location[row][column]
            locations[row][column] = location;
            //IF location has been visited
            if() {
            //DISPLAY the map symbol for location
        
            //ELSE
            else {
            //DISPLAY " ?? "
            }
            //ENDIF
            }
        
        //DISPLAY ending column divider
        
        //ENDFOR
        }
        
    //DISPLAY ending row divider
    }   
//END
    
}



/*public class MapView extends View{
    public MapView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n|                 Map View                   |"
            +"\n|--------------------------------------------|"
            +"\n|  Row -| 5 [ ] [ ] [ ] [ ] [ ]              |"
            +"\n|       V 4 [ ] [ ] [ ] [ ] [ ]              |"
            +"\n|         3 [ ] [ ] [X] [ ] [ ]              |"
            +"\n|         2 [ ] [ ] [ ] [ ] [ ]              |"
            +"\n|         1 [ ] [ ] [ ] [ ] [ ]              |"
            +"\n|   Col-->   1   2   3   4   5               |"  
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
