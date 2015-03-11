package byui.cit260.TreeOfLife.model;

import java.io.Serializable;


public enum Item implements Serializable{
    // Reference: Item.GoldIngots = Item[0]
    GoldIngots("Gold Ingots","A golden Ingot", 3, "Contr-Category"),
    SilverIngots("Silver Ingots", "A silver Ingot", 3, "Contr-Category");
    
    private final String name;
    private final String itemDescription;
    private final Contribution contribution;
    
    Item(String name, String itemDescription, int amount, String category) {
        this.name = name;
        this.itemDescription = itemDescription;
        Contribution contribution = new Contribution(amount, category);
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public String getItemDescription() {
        return itemDescription;
    }  
}
