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
        super("\n"
            +"\n------------------------------------------------"
            +"\n|             Inventory Items                  |"
            +"\n|----------------------------------------------|"
            +"\n|  Item 1:?                                    |"
            +"\n|  Item 2:?                                    |"
            +"\n|  Item 3:?                                    |"
            +"\n|  Item 4:?                                    |"
            +"\n|  Item 5:?                                    |"
            +"\n|  Item 6:?                                    |"  
            +"\n------------------------------------------------"
            +"\n| Which item would you like a description of?  |"
            +"\n------------------------------------------------"
            +"\n|1-6 - Item 1-6                                |"
            +"\n|E   - Exit Invetory                               |"
            +"\n------------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "1":
                System.out.println("This will describe item number 1");
                break;
            case "2":
                System.out.println("This will describe item number 2");
                break;
            case "3":
                System.out.println("This will describe item number 3");
                break;
            case "4":
                System.out.println("This will describe item number 4");
                break;
            case "5":
                System.out.println("This will describe item number 5");
                break;
            case "6":
                System.out.println("This will describe item number 6");
                break;
            case "E":
                return;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
    }   
}
