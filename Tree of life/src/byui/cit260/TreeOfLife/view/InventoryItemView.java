/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;


/**
 *
 * @author ENTELLiJENSE
 */
public class InventoryItemView extends View {
    
    //Item Name
    public InventoryItemView() {
        super("\n----------------------------------------------"
             +"\n|         List of Inventory Items            |"
             +"\n----------------------------------------------"
             +"\n Description\t\t\tName");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "E":
                return;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
    }   
}
