/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Game;
import tree.of.life.TreeOfLife;

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
                this.chooseJacob();
                break;
            case "S":
                this.chooseSam();
                break;
            case "L":
                this.chooseLaman();
                break;
            case "Z":
                this.chooseZoram();
                return;
            case "D":
                this.chooseLehi();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nINVALID SELECTION! Try again!");
                break;
        }
    }

    private void chooseNephi() {
        Game game = TreeOfLife.getGame();
        game.setObedience(3);
    }

    private void chooseJacob() {
        Game game = TreeOfLife.getGame();
        game.setHonesty(3);
    }

    private void chooseSam() {
        Game game = TreeOfLife.getGame();
        game.setVirtue(3);
    }

    private void chooseLaman() {
        Game game = TreeOfLife.getGame();
        game.setKnowledge(3);
    }

    private void chooseZoram() {
        Game game = TreeOfLife.getGame();
        game.setFaith(3);
    }

    private void chooseLehi() {
        Game game = TreeOfLife.getGame();
        game.setRighteousness(3);
    }
}