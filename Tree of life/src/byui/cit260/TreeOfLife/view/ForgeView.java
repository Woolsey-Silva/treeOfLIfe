/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.InventoryControl;
import byui.cit260.TreeOfLife.control.forgeArmor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;

/**
 *
 * @author Caleb
 */
public class ForgeView extends View{
    public ForgeView() {
        super("----------------------------------------------------------"
           +"\n|You roll out the forge kit, and start up the fire. After|"
           +"\n|a few minutes the fire is roaring hot enough to smelt   |"
           +"\n|your small items down into ingots!                      |"
           +"\n|WARNING! SMELTING ITEMS REMOVES THEM FROM THE INVENTORY!|"
           +"\n----------------------------------------------------------"
           +"\n|F - Begin forging armor!                                |"
           +"\n|S - Smelt all small items into ingots!                  |"
           +"\n|E - Exit the forge menu!                                |"
           +"\n----------------------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "F":
                forgeArmor forge = new forgeArmor();
                String input = " ";
                
                while (!(input.equals("E"))) {
                    this.console.println(""
                    + "\n----------------------------------------------------------"
                    + "\n|You will need 10 ingots of the appropriate type in order|"
                    + "\n|to forge a peice of armor! If you have the right number |"
                    + "\n|of ingots, select that armor peice to create it!        |"
                    + "\n----------------------------------------------------------"
                    + "\n|R - To forge the Breastplate of Righteousness           |"
                    + "\n|K - To forge the Helmet of Knowledge                    |"
                    + "\n|F - To forge the Shield of Faith                        |"
                    + "\n|K - To forge the Boots of Obedience                     |"
                    + "\n|V - To forge the Belt of Virtue                         |"
                    + "\n|H - To forge the Sword of Honesty                       |"
                    + "\n|E - To Exit the forge menu                              |"
                    + "\n----------------------------------------------------------");
                
                    input = this.getInput();
                    forge.forge(input);
                }
                break;
            case "S":
                this.smelt();
                break;
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\nINVALID SELECTION! Try again!");
                break;
        }
    }   

    private void smelt() {
        forgeArmor forge = new forgeArmor();
        forge.smelt();
    }
    
    
}
