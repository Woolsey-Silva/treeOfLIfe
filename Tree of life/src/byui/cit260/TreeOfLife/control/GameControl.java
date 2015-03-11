package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Armor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Character;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Scene;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;

/**
 *
 * @author Caleb
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        TreeOfLife.setCurrentGame(game);
        
        player.setCharacter(character);
        game.setPlayer(player);
        TreeOfLife.setPlayer(player);
        
        ArrayList<Item> inventory = new ArrayList<Item>();
        game.setBackpack(inventory);
      
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Armor[] armor = GameControl.armorList();
        game.setArmor(armor); 
    }

    private static Character[] createCharacterList() {
        System.out.println("character list was called ");
        return null;
    }

    private static Armor[] armorList() {
        System.out.println("armor list was called ");
        return null;
    }

    static void assignScenesToLocation(Map map) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(Scene.Field);
        locations[0][1].setScene(Scene.Field);
        locations[0][2].setScene(Scene.Field);
        locations[0][3].setScene(Scene.Field);
        locations[0][4].setScene(Scene.Field);
        locations[1][0].setScene(Scene.Field);
        locations[1][1].setScene(Scene.Field);
        locations[1][2].setScene(Scene.Field);
        locations[1][3].setScene(Scene.Field);
        locations[1][4].setScene(Scene.Field);
        locations[2][0].setScene(Scene.Field);
        locations[2][1].setScene(Scene.Field);
        locations[2][2].setScene(Scene.Field);
        locations[2][3].setScene(Scene.Field);
        locations[2][4].setScene(Scene.Field);
        locations[3][0].setScene(Scene.Field);
        locations[3][1].setScene(Scene.Field);
        locations[3][2].setScene(Scene.Field);
        locations[3][3].setScene(Scene.Field);
        locations[3][4].setScene(Scene.Field);
        locations[4][0].setScene(Scene.Field);
        locations[4][1].setScene(Scene.Field);
        locations[4][2].setScene(Scene.Field);
        locations[4][3].setScene(Scene.Field);
        locations[4][4].setScene(Scene.Field); 
    }

    
    
}
