/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.of.life;

import byui.cit260.TreeOfLife.model.Armor;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.Character;
import byui.cit260.TreeOfLife.model.Contribution;
import byui.cit260.TreeOfLife.model.InventoryItem;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Scene;
import byui.cit260.TreeOfLife.model.TempleMenuQuestions;

/**
 *
 * @author ENTELLiJENSE
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.setGameTime(10);
        game1.setFaith(10);
        game1.setObedience(10);
        game1.setKnowledge(10);
        game1.setHonesty(10);
        game1.setRighteousness(10);
        game1.setVirtue(10);
        String testing = game1.toString();
        System.out.println(testing);
        
        
        Player player1 = new Player();
        player1.setName("test");
        player1.setRecordTime(10);
        testing = player1.toString();
        System.out.println(testing);
        
        Armor armor1 = new Armor();
        armor1.setType("Mail");
        armor1.setDescription("Mail Armor");
        armor1.setName("Thornmail");
        armor1.setCategory("Chest");
        testing = armor1.toString();
        System.out.println(testing);
        
        Character char1 = new Character();
        char1.setName("Nephi");
        char1.setDescription("Valient son of Lehi");
        char1.setBonusAmount(3);
        char1.setBonusCategory("Obedience");
        testing = char1.toString();
        System.out.println(testing);
        
        InventoryItem inv1 = new InventoryItem();
        inv1.setItemDescription("A sharp dagger, with a shiny point!");
        inv1.setName("Dagger");
        testing = inv1.toString();
        System.out.println(testing);
        
        Map map1 = new Map();
        map1.setColCount(5);
        map1.setRowCount(5);
        testing = map1.toString();
        System.out.println(testing);
        
        Contribution contribution1 = new Contribution();
        contribution1.setAmount(1.1);
        contribution1.setCategory("Faith");
        testing = contribution1.toString();
        System.out.println(testing);
        
        Location location1 = new Location();
        location1.setRow(2);
        location1.setColumn(3);
        testing = location1.toString();
        System.out.println(testing);
        
        Scene scene1 = new Scene();
        scene1.setType("in the swamp");
        scene1.setDescription("dark and stinky");
        scene1.setVisted(true);
        scene1.setBlocked(true);
        testing = scene1.toString();
        System.out.println(testing);
        
        TempleMenuQuestions templeMenuQuestions1 = new TempleMenuQuestions();
        templeMenuQuestions1.setQuestion("what comes after 2?");
        templeMenuQuestions1.setAnswer("3");
        testing = templeMenuQuestions1.toString();
        System.out.println(testing);
        
        
    }
    
}
