package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Armor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Character;
import byui.cit260.TreeOfLife.model.Item;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Question;
import byui.cit260.TreeOfLife.model.Scene;
import byui.cit260.TreeOfLife.view.CharacterSelectView;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;

/**
 *
 * @author Caleb
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException{
        Game game = new Game();
        TreeOfLife.setCurrentGame(game);
        
        CharacterSelectView charView = new CharacterSelectView();
        charView.display();
        String choice = charView.getInput();
        charView.doAction(choice);
        
        // player.setCharacter(character);
        game.setPlayer(player);
        TreeOfLife.setPlayer(player);
        
        ArrayList<Item> inventory = new ArrayList<Item>();
        game.setBackpack(inventory);
      
        
        Map map = MapControl.createMap();
        game.setMap(map); 
    }
    
    // finished first
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

    static void assignQuestionsToLocation(Map map) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setQuestionInLocation(Question.question1);
        locations[0][1].setQuestionInLocation(Question.question1);
        locations[0][2].setQuestionInLocation(Question.question1);
        locations[0][3].setQuestionInLocation(Question.question1);
        locations[0][4].setQuestionInLocation(Question.question1);
        locations[1][0].setQuestionInLocation(Question.question1);
        locations[1][1].setQuestionInLocation(Question.question1);
        locations[1][2].setQuestionInLocation(Question.question1);
        locations[1][3].setQuestionInLocation(Question.question1);
        locations[1][4].setQuestionInLocation(Question.question1);
        locations[2][0].setQuestionInLocation(Question.question1);
        locations[2][1].setQuestionInLocation(Question.question1);
        locations[2][2].setQuestionInLocation(Question.question1);
        locations[2][3].setQuestionInLocation(Question.question1);
        locations[2][4].setQuestionInLocation(Question.question1);
        locations[3][0].setQuestionInLocation(Question.question1);
        locations[3][1].setQuestionInLocation(Question.question1);
        locations[3][2].setQuestionInLocation(Question.question1);
        locations[3][3].setQuestionInLocation(Question.question1);
        locations[3][4].setQuestionInLocation(Question.question1);
        locations[4][0].setQuestionInLocation(Question.question1);
        locations[4][1].setQuestionInLocation(Question.question1);
        locations[4][2].setQuestionInLocation(Question.question1);
        locations[4][3].setQuestionInLocation(Question.question1);
        locations[4][4].setQuestionInLocation(Question.question1);
    }

    static void assignItemsToLocation(Map map) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setItemInLocation(Item.IngotOfFaith);
        locations[0][1].setItemInLocation(Item.IngotOfFaith);
        locations[0][2].setItemInLocation(Item.IngotOfFaith);
        locations[0][3].setItemInLocation(Item.IngotOfFaith);
        locations[0][4].setItemInLocation(Item.IngotOfFaith);
        locations[1][0].setItemInLocation(Item.IngotOfFaith);
        locations[1][1].setItemInLocation(Item.IngotOfFaith);
        locations[1][2].setItemInLocation(Item.IngotOfFaith);
        locations[1][3].setItemInLocation(Item.IngotOfFaith);
        locations[1][4].setItemInLocation(Item.IngotOfFaith);
        locations[2][0].setItemInLocation(Item.IngotOfFaith);
        locations[2][1].setItemInLocation(Item.IngotOfFaith);
        locations[2][2].setItemInLocation(Item.IngotOfFaith);
        locations[2][3].setItemInLocation(Item.IngotOfFaith);
        locations[2][4].setItemInLocation(Item.IngotOfFaith);
        locations[3][0].setItemInLocation(Item.IngotOfFaith);
        locations[3][1].setItemInLocation(Item.IngotOfFaith);
        locations[3][2].setItemInLocation(Item.IngotOfFaith);
        locations[3][3].setItemInLocation(Item.IngotOfFaith);
        locations[3][4].setItemInLocation(Item.IngotOfFaith);
        locations[4][0].setItemInLocation(Item.IngotOfFaith);
        locations[4][1].setItemInLocation(Item.IngotOfFaith);
        locations[4][2].setItemInLocation(Item.IngotOfFaith);
        locations[4][3].setItemInLocation(Item.IngotOfFaith);
        locations[4][4].setItemInLocation(Item.IngotOfFaith);
    }

    
    
}
















