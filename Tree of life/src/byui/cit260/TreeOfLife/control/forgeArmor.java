package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Armor;
import byui.cit260.TreeOfLife.model.Contribution;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Item;
import java.util.ArrayList;
import tree.of.life.TreeOfLife;


// Set up the forge
// Display Items the user has
// Display the outcome of forging each item


public class forgeArmor {
    
    public void forge(String input) {
        Game game = TreeOfLife.getGame();
        int attribute;
        ArrayList<Armor> armorObtained = null;
        switch (input) {
            case "R":
                attribute = game.getRighteousness();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.BreastPlateOfRighteousness);
                    System.out.println("Congratz, you have obtained the Breastplate of Righteousness!");
                }
                break;
                
            case "K":
                attribute = game.getKnowledge();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.helmetOfKnoweldge);
                    System.out.println("Congratz, you have obtained the Helmet of Knowledge!");
                }
                break;
                
            case "F":
                attribute = game.getFaith();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.shieldOfFaith);
                    System.out.println("Congratz, you have obtained the Shield of Faith!");
                }
                break;
                
            case "O":
                attribute = game.getObedience();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.bootsOfObedinece);
                    System.out.println("Congratz, you have obtained the Boots of Obedience!");
                }
                break;
                
            case "V":
                attribute = game.getVirtue();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.beltOfVirtue);
                    System.out.println("Congratz, you have obtained the Belt of Virtue!");
                }
                break;
                
            case "H":
                attribute = game.getHonesty();
                if (attribute < 10) {
                    System.out.println("Sorry you do not have enough Ingots to"
                            + "create that armor peice!");
                }
                else {
                    armorObtained.add(Armor.swordOfHonesty);
                    System.out.println("Congratz, you have obtained the Sword of Honesty!");
                }
                break;
                
            case "E":
                break;
            default:
                System.out.println("Error! The input was invalid! Please "
                        + "re-enter input!");
        }
    }
    
    public void smelt() {
        Game game = TreeOfLife.getGame();
        ArrayList<Item> backpack = game.getBackpack();
        
        int honestyToAdd = 0;
        int obedienceToAdd = 0;
        int faithToAdd = 0;
        int virtueToAdd = 0;
        int righteousnessToAdd = 0;
        int knowledgeToAdd = 0;
        
        InventoryControl inventoryControl = new InventoryControl();
        
        for (Item i : backpack) {
            // Obtain the attributes to add
            Contribution contribution = i.getContribution();
            double itemAmount = contribution.getAmount();
            String itemCat = contribution.getCategory();
      
            switch (itemCat.charAt(0)) {
                case 'F':
                    // add the faith to the amount to add
                    faithToAdd += itemAmount;
                    // remove item from inventory
                    Item item = i;
                    inventoryControl.removeItem(item);
                
                    break;
                case 'H':
                    // add the faith to the amount to add
                    honestyToAdd += itemAmount;
                    // remove item from inventory
                    item = i;
                    inventoryControl.removeItem(item);
                
                    break;
                case 'O':
                    // add the faith to the amount to add
                    obedienceToAdd += itemAmount;
                    // remove item from inventory
                    item = i;
                    inventoryControl.removeItem(item);
                
                    break;
                case 'V':
                    // add the faith to the amount to add
                    virtueToAdd += itemAmount;
                    // remove item from inventory
                    item = i;
                    inventoryControl.removeItem(item);
                
                    break;
                case 'R':
                    // add the faith to the amount to add
                    righteousnessToAdd += itemAmount;
                    // remove item from inventory
                    item = i;
                    inventoryControl.removeItem(item);
                
                    break;
                case 'K':
                    // add the faith to the amount to add
                    knowledgeToAdd += itemAmount;
                    // remove item from inventory
                    item = i;
                    inventoryControl.removeItem(item);
          
                    break;
             
                default:
                    System.out.println("MAJOR SYSTEM ERROR! FIX THIS BUG!");
                    break;
            }  
        }
        
        // get games attributes
        int IngotOfFaith = game.getFaith();
        int IngotOfObedience = game.getObedience();
        int IngotOfKnowledge = game.getKnowledge();
        int IngotOfHonesty = game.getHonesty();
        int IngotOfRighteousness = game.getRighteousness();
        int IngotOfVirtue = game.getVirtue();
        
        // Add smelted item attributes to the games attributes
        IngotOfFaith += faithToAdd;
        IngotOfObedience += obedienceToAdd;
        IngotOfKnowledge += knowledgeToAdd;
        IngotOfHonesty += honestyToAdd;
        IngotOfRighteousness += righteousnessToAdd;
        IngotOfVirtue += virtueToAdd;
        
        // Tell the user how many Ingots that were added and how many they now
        // currently have
        System.out.println("Ingots of each type added: "
                + "Ingots of Faith: " + faithToAdd + ""
                + "Ingots of Obedience: " + obedienceToAdd + "" 
                + "Ingots of Knowledge: " + knowledgeToAdd + ""
                + "Ingots of Honesty: " + honestyToAdd + ""
                + "Ingots of Righteousness: " + righteousnessToAdd + ""
                + "Ingots of Virtue: " + virtueToAdd + ""
                + "----------------------------------------------------"
                + "You now currently have:"
                + "Ingots of Faith: " + IngotOfFaith + ""
                + "Ingots of Obedience: " + IngotOfObedience + "" 
                + "Ingots of Knowledge: " + IngotOfKnowledge + ""
                + "Ingots of Honesty: " + IngotOfHonesty + ""
                + "Ingots of Righteousness: " + IngotOfRighteousness + ""
                + "Ingots of Virtue: " + IngotOfVirtue + "");
        
        // Reset the games attributes
        game.setFaith(IngotOfFaith);
        game.setObedience(IngotOfObedience);
        game.setKnowledge(IngotOfKnowledge);
        game.setHonesty(IngotOfHonesty);
        game.setRighteousness(IngotOfRighteousness);
        game.setVirtue(IngotOfVirtue);
    }
}