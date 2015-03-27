package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Player;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;

public class InventoryControl {
    public void addItem(Item item){
        Game game = TreeOfLife.getGame();
        ArrayList<Item> backpack = game.getBackpack();
        boolean haveRoom = this.backpackRoom(backpack);
        if (haveRoom) {
            backpack.add(item);
        }
        else {
            System.out.println("SORRY! The item was not added to your backpack"
                    + "\nbecause there is no more room in your backpack! Please"
                    + "\nempty/forge some items and try again!");
        }
        
    }
    
    public void searchItem(Item item) {
        Game game = TreeOfLife.getGame();
        ArrayList<Item> backpack = game.getBackpack();
        int count = 0;
        boolean found = false;
        for (Item i : backpack) {
            count++;
            if (i == item) {
                System.out.println("Found! You have a " + item + "!");
                System.out.println("The item is found at index: " + count);
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("Not Found! You do not have a " + item + "!");
        }
    }

    private boolean backpackRoom(ArrayList<Item> backpack) {
        int count = 0;
        
        for (Item item : backpack) {
            count++;
        }
        
        if (count <= 15) {
            return true;
        }
        
        else {
           return false;
        } 
    }
}
