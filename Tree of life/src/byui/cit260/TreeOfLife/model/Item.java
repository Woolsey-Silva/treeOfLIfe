package byui.cit260.TreeOfLife.model;

import java.io.Serializable;


public enum Item implements Serializable{
    // Reference: Item.GoldIngots = Item[0]
    CTRRING("Simple Ring", "A CTR Ring", 2, "Faith"),
    PGofBIBLE("a page", "A missing page of the bible", 2, "Faith"),
    nehpiBrokenBow("a broken bow", "The bow that Nephi broke", 2, "Faith"),
    SpindleOfLiahona("A needle of a compass", "The sindle of the liahona", 2, "Faith"),
    BroJaredsStone("common stone", "A glowing stone used in the arcs for the people of the brother of Jared", 2, "Faith"),
    
    LabansCape("A cape", "Labans cape", 2, "Knowledge"),
    MoronisTitleOfLiberty("A ripped shirt", "The title of liberty", 2, "Knowledge"),
    StripplingWarriorsHeadband("A head band", "a head band from a strippling warrior", 2, "Knowledge"),
    OlvieBranch("An olive branch", "An olive branch that jacob used to teach his people", 2, "Knowledge"),
    KingBenBracelt("A simple Bracelt", "King Benjamins Bracelt", 2, "Knowledge"),
    
    AmmonsSling("A sling", "The sling Of Ammon", 2, "Virtue"),
    FeatherOfLimhisHeadBand("a Feather", "A feather from the head band of King Limhi", 2, "Virtue"),
    NecklaceOfKingNoah("A necklace", "A necklace from King Noah tax colleciton", 2, "Virtue"),
    ChainLInkOfAbinadi("A chain link", "A link from the chains that held Abinadi", 2, "Virtue"),
    BottleWatersOfMormon("Water that has been bottled", "Waters of Mormon that has been bottled", 2, "Virtue"),
    
    GavilOfMosiah("A Gavil", "The gavil that Mosiah gave to the people after he declared that there should be no more kings", 2, "Honesty"),
    ShardOfGideonsSwords("A shard Of a sword", "a Shard of Gideons sword", 2, "Honesty"),
    SeedsOfAlma("A bag of seeds", "A bage of seeds which alma gave to those he taught about faith", 2, "Honesty"),
    ChipOfLamonisDagger("A chip of obsidian", "A chip of obsidian from King Lamonis dagger which fell protection Ammon.", 2, "Honesty"),
    ChunkOfWood("A chunk of wood", "A chunk of wood from the fire which alma and almulek excaped unharmed.", 2, "Honesty"),
    
    epistleOfHelaman("A rolled paper", "An Epistle of Helman telling Moroni of the strippliing warriors.", 2, "Righteousness"),
    GadiantonDagger("A curves Dagger", "A dagger taken from the gadianton robbers", 2, "Righteousness"),
    SamuelStaff("A wooden Staff", "The walking staff that samuel the lamanite", 2, "Righteousness"),
    RubbleOfZerahemla("A peice of rubble", "A peice of the cumble city of Zerahemla", 2, "Righteousness"),
    SacrementBaskter("a Basket", "A basket used to pass the sacrement that Jesus gave to the nephites", 2, "Righteousness");

    
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
