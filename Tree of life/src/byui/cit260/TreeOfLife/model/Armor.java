package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

public enum Armor implements Serializable{
    // Reference by Armor.shieldOfFaith = Armor[1];
    helmetOfKnoweldge("***Type description here!****"),
    shieldOfFaith("NEEDS TO BE FIXED"),
    beltOfVirtue("NEEDS TO BE FIXED"),
    bootsOfObedinece("NEEDS TO BE FIXED"),
    swordOfHonesty("NEEDS TO BE FIXED"),
    BreastPlateOfRighteousness("NEEDS TO BE FIXED");
    
    
    private final String description;

    Armor(String description) {
    this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
