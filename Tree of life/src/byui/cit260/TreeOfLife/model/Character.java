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
    // Reference by Character.Nephi = Character[0]
    Nephi("He is obedient and deterrmined to do what God has asked.", "Obediance"),
    Jacob("Nephi's Faithful brother, Prophet and successor to Nephi.","NEEDS TO BE FIXED"),
    Sam("He was the youngest of the lehis children, he sought after virture", "NEEDS TO BE FIXED"),
    Laman("He is the oldest of Lehi's family and valued his knowledge above all else.", "NEEDS TO BE FIXED"),
    Zoram("He fled Jerusalem with Nephi and his brother and was honest to his word to follow Nephi", "NEEDS TO BE FIXED"),
    Lehi("He is a prophet of the Lord and called people to be Righteous Before he feld Jerusalem", "NEEDS TO BE FIXED");
    
    private final String description;
    private  final Contribution bonusCategory;

    Character(String description, String category) {
        this.description = description;
        bonusCategory = new Contribution(3, category);
    }
  
    public String getDescription() {
        return description;
    }

    public Contribution getBonusCategory() {
        return bonusCategory;
    } 
}
