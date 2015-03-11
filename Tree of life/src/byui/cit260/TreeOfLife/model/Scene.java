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
 * @author ENTELLiJENSE
 */
public enum Scene implements Serializable{
   // Reference by Scene.Riverside = Scene[0]
   Riverside("NEEDS TO BE FIXED"),
   Field("NEEDS TO BE FIXED"),
   SpaciousBuilding("NEEDS TO BE FIXED"),
   IronRodPath("NEEDS TO BE FIXED"),
   TreeOfLife("NEEDS TO BE FIXED");
   
   private final String description;
   
    Scene(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
