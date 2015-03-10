/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Armor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Character;
import byui.cit260.TreeOfLife.model.InventoryItem;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import tree.of.life.TreeOfLife;

/**
 *
 * @author Caleb
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        TreeOfLife.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventoryItem(inventoryList);
        
        Character[] character = GameControl.createCharacterList();
        game.setCharacter(character);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Armor[] armor = GameControl.armorList();
        game.setArmor(armor); 
        
        
        
    }

    private static InventoryItem[] createInventoryList() {
        /*InventoryItem[] inventory =
                new InventoryItem[30]*/
        
        //ask bro jackson about the items 
        
                System.out.println("character list was called ");
        return null;
        
    }

    private static Character[] createCharacterList() {
        System.out.println("character list was called ");
        return null;
    }

    private static Armor[] armorList() {
        System.out.println("armor list was called ");
        return null;
    }

    
    
}
