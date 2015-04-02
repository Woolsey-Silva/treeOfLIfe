package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Contribution;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;


// Set up the forge
// Display Items the user has
// Display the outcome of forging each item


public class forgeArmor {
    public void setUp() {
        // Requires for Us to write a forgearmorview (DISPLAY THE MENU)
        Game game = TreeOfLife.getGame();
        ArrayList<Item> backpack = game.getBackpack();
        int count = 1;
        
        for (Item i : backpack) {
            Contribution contribution = i.getContribution();
            double itemAmount = contribution.getAmount();
            String itemCat = contribution.getCategory();
            
            System.out.println(count + ")\t" + i + "\t+" + itemAmount + " " +itemCat);
             
            // Create the forgeArmorView class to get input from the user
            
            // After above class has been created, get input from the user of
            // which item to smelt down
            
            // Create the remove item function within the InventoryControl class
            
            // Prompt the user to delete the item and add given number of ingots
            // to inventory
            
            // if user inputs yes, go ahead and run the remove item and additem
            // functions to perform the smelt
            
            
            int itemsToAdd = 0;
            InventoryControl inventoryControl = new InventoryControl();
            switch (itemCat.charAt(0)) {
                case 'F':
                    while (itemsToAdd < itemAmount){
                        inventoryControl.addItem(Item.CTRRING);
                        itemsToAdd++;
                    }
                    System.out.println("Ingot of Faith x" + itemAmount 
                            + " was added to inventory");
                    break;
                case 'R':
                    while (itemsToAdd < itemAmount){
                        inventoryControl.addItem(Item.CTRRING);
                        itemsToAdd++;
                    }
                    System.out.println("Ingot of Righteousness x" + itemAmount 
                            +  " was added to inventory");
                    break;
                default:
                    System.out.println("MAJOR SYSTEM ERROR! FIX THIS BUG!");
                    break;
            }  
        }
    }
}