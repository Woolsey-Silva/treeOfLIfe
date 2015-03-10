/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Caleb
 */

// To make a JavaBean
// 1) Implements Serializable
// 2) Has a default zero arg constructor
// 3) Has getters and setters for every attribute
// These make a Javabean
// 3 Recommended functions are toString, hashCode, and equals
// toString outs the information of the attributes in a user friendly way
// hashCode is used to create a single 32 bit signed int to create data structures
// equals is used to test to see if one object is equal to another

public enum Armor implements Serializable{
    
    helmetOfKnoweldge(""),
    shieldOfFaith(""),
    beltOfVirtue(""),
    bootsOfObedinece(""),
    swordOfHonesty(""),
    BreastPlateOfRighteousness("");
    
    
    private final String description;
    //private final String category; 
    
    private Game game;
    private Character character;

    Armor(String description) {
    this.description = description;
    //Category = new Category;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getDescription() {
        return description;
    }

    /*public String getCategory() {
        return category;
    }*/
    
    
}
