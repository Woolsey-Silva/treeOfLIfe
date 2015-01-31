/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.util.Objects;

/**
 *
 * @author Caleb
 */
public class Character {
    private String name;
    private String description;
    private int bonusAmount;
    private String bonusCategory;

    public Character() {
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", bonusAmount=" + bonusAmount + ", bonusCategory=" + bonusCategory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.bonusAmount;
        hash = 17 * hash + Objects.hashCode(this.bonusCategory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.bonusAmount != other.bonusAmount) {
            return false;
        }
        if (!Objects.equals(this.bonusCategory, other.bonusCategory)) {
            return false;
        }
        return true;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public String getBonusCategory() {
        return bonusCategory;
    }

    public void setBonusCategory(String bonusCategory) {
        this.bonusCategory = bonusCategory;
    }
    
    

    }
   
