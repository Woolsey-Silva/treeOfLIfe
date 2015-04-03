package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable{

    private int answerCounter;
    private int gameTime;
    private int IngotOfFaith;
    private int IngotOfObedience;
    private int IngotOfKnowledge;
    private int IngotOfHonesty;
    private int IngotOfRighteousness;
    private int IngotOfVirtue;
    
    private Player player;
    private ArrayList<Item> backpack;
    private Item[] gameItems;
    private Map map;
    private Armor[] armor;
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.gameTime;
        hash = 71 * hash + this.IngotOfFaith;
        hash = 71 * hash + this.IngotOfObedience;
        hash = 71 * hash + this.IngotOfKnowledge;
        hash = 71 * hash + this.IngotOfHonesty;
        hash = 71 * hash + this.IngotOfRighteousness;
        hash = 71 * hash + this.IngotOfVirtue;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.gameTime != other.gameTime) {
            return false;
        }
        if (this.IngotOfFaith != other.IngotOfFaith) {
            return false;
        }
        if (this.IngotOfObedience != other.IngotOfObedience) {
            return false;
        }
        if (this.IngotOfKnowledge != other.IngotOfKnowledge) {
            return false;
        }
        if (this.IngotOfHonesty != other.IngotOfHonesty) {
            return false;
        }
        if (this.IngotOfRighteousness != other.IngotOfRighteousness) {
            return false;
        }
        if (this.IngotOfVirtue != other.IngotOfVirtue) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameTime=" + gameTime + ", faith=" + IngotOfFaith + ", obedience=" + IngotOfObedience + ", knowledge=" + IngotOfKnowledge + ", honesty=" + IngotOfHonesty + ", righteousness=" + IngotOfRighteousness + ", virtue=" + IngotOfVirtue + '}';
    }

    public Game() {
    }

    public int getGameTime() {
        return gameTime;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    public int getFaith() {
        return IngotOfFaith;
    }

    public void setFaith(int faith) {
        this.IngotOfFaith = faith;
    }

    public int getObedience() {
        return IngotOfObedience;
    }

    public void setObedience(int obedience) {
        this.IngotOfObedience = obedience;
    }

    public int getKnowledge() {
        return IngotOfKnowledge;
    }

    public void setKnowledge(int knowledge) {
        this.IngotOfKnowledge = knowledge;
    }

    public int getHonesty() {
        return IngotOfHonesty;
    }

    public void setHonesty(int honesty) {
        this.IngotOfHonesty = honesty;
    }

    public int getRighteousness() {
        return IngotOfRighteousness;
    }

    public void setRighteousness(int righteousness) {
        this.IngotOfRighteousness = righteousness;
    }

    public int getVirtue() {
        return IngotOfVirtue;
    }

    public void setVirtue(int virtue) {
        this.IngotOfVirtue = virtue;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Armor[] getArmor() {
        return armor;
    } 
    
    
}
