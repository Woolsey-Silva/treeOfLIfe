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
public class CharacterSelectView extends View {
    public CharacterSelectView() {
        super("\n"
            +"\n----------------------------------------------"
            +"\n| Please Select A Character                  |"
            +"\n----------------------------------------------"
            +"\n|N - Nephi: +3 Obediance                     |"
            +"\n|J - Jacob: +3 Honesty                       |"
            +"\n|S - Sam:   +3 Virtue                        |"
            +"\n|L - Laman: +3 Knowledge                     |"
            +"\n|Z - Zoram: +3 Faith                         |"
            +"\n|D - Lehi:  +3 Righteousness                 |"
            +"\n----------------------------------------------");
    }

    @Override
    public void doAction(String choice) {
        
        switch (choice){
            case "N":
                this.chooseNephi();
                break;
            case "J":
                break;
            case "S":
                break;
            case "L":
                break;
            case "Z":
                return;
            case "D":
                break;
            default:
                System.out.println("\nINVALID SELECTION! Try again!");
                break;
        }
    }

    private void chooseNephi() {
        
    }
}
