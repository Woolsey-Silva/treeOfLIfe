/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.control.forgeArmor;

/**
 *
 * @author Caleb
 */
public class MapView extends View{
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
    public boolean doAction(Object obj) {
        String choice = (String)obj;
        switch (choice){
            case "M":
                MapControl mapControl = new MapControl();
                mapControl.move();
                break;
            case "F":
                forgeArmor forgeArmor = new forgeArmor();
                break;
            case "E":
                return true;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
        return false;
    }
}
