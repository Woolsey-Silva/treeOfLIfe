package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ENTELLiJENSE
 */
public enum Scene implements Serializable{
   // Reference by Scene.Riverside = Scene[0]
   Riverside("This is the fountain of all righteousness, as you follow it you will come to find happiness."),
   Field("Your joureny has begun, and as you look out over the field you see all the many perils that await you."),
   SpaciousBuilding("This mansion has every thing you need why would you ever want to go elsewhere"),
   IronRodPath("If you want to reach the tree of life, the only way to do it is holding strong to this rod"),
   TreeOfLife("Finally you made it, Experience the joy of the fruit in each bite");

   
   private final String description;
   
    Scene(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
