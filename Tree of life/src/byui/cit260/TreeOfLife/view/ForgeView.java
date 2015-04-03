/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.InventoryControl;
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
           +"\n|F - Begin forging!                                      |"
           +"\n|E - Exit the forge menu!                                |"
           +"\n----------------------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "H":
                this.forge();
                break;
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\nINVALID SELECTION! Try again!");
                break;
        }
    }   

    private void forge() {
        InventoryControl inventoryControl = new InventoryControl();
        
        String choice = "";
        InventoryItemView inventoryItemView = new InventoryItemView();
        while (!(choice.equals("E"))) {
            Game game = TreeOfLife.getGame();
            ArrayList<Item> inventory = game.getBackpack();
            inventoryItemView.display();
            
            for (Item i : inventory) {
                this.console.printf(i.getItemDescription());
                this.console.println("\t\t\t" + i.getName());
            }
            this.console.println("Press 'E' to exit");
            
            choice = inventoryItemView.getInput();
            inventoryItemView.doAction(choice);
        }
    }
    
    
}
