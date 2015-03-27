/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

/**
 *
 * @author Caleb
 */
public class GameItemListView extends View{
    public GameItemListView() {
        super("\n----------------------------------------------"
             +"\n|        List of all items in the Game       |"
             +"\n----------------------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        switch (choice){
            case "E":
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\nINVALID SELECTION! Try again!");
                break;
        }
    }
}

