package byui.cit260.TreeOfLife.model;

import java.io.Serializable;


public enum Item implements Serializable{
    // Reference: Item.GoldIngots = Item[0]
    CTRRING("Simple Ring", "A CTR Ring", 2, "Faith");
    
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
    
    public Contribution getContribution() {
        return contribution;
    }
}
