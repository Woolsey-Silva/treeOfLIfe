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
public enum Character implements Serializable{
    //fatih -
    //obedience -
    //knowledge -
    //honesty -
    //righteousness
    //virtue -
    Nephi("He is obedient and deterrmined to do what God has asked."),
    Jacob("Nephi's Faithful brother, Prophet and successor to Nephi."),
    Sam("He was the youngest of the lehis children, he sought after virture"),
    Laman("He is the oldest of Lehi's family and valued his knowledge above all else."),
    Zoram("He fled Jerusalem with Nephi and his brother and was honest to his word to follow Nephi"),
    Lehi("He is a prophet of the Lord and called people to be Righteous Before he feld Jerusalem");
    
    private final String description;
    private final Point coordinates;
    private  final int bonusAmount;
    //private  final String bonusCategory;
    
    
    private Game game;
    private Location[] location;
    private Armor armor;
    


    Character(String description) {
    this.description = description;
    coordinates = new Point(3,3);
    bonusAmount = 3;
    //bonusCategory = new Category;
    }
  
    public String getDescription() {
        return description;
    }

    
    public Point getcoordinates() {
        return coordinates;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    /*public String getBonusCategory() {
        return bonusCategory;
    }*/

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    } 
    
    
}
