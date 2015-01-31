/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

/**
 *
 * @author Caleb
 */
public class Game {
    private int gameTime;
    private int faith;
    private int obedience;
    private int knowledge;
    private int honesty;
    private int righteousness;
    private int virtue;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.gameTime;
        hash = 71 * hash + this.faith;
        hash = 71 * hash + this.obedience;
        hash = 71 * hash + this.knowledge;
        hash = 71 * hash + this.honesty;
        hash = 71 * hash + this.righteousness;
        hash = 71 * hash + this.virtue;
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
        if (this.faith != other.faith) {
            return false;
        }
        if (this.obedience != other.obedience) {
            return false;
        }
        if (this.knowledge != other.knowledge) {
            return false;
        }
        if (this.honesty != other.honesty) {
            return false;
        }
        if (this.righteousness != other.righteousness) {
            return false;
        }
        if (this.virtue != other.virtue) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameTime=" + gameTime + ", faith=" + faith + ", obedience=" + obedience + ", knowledge=" + knowledge + ", honesty=" + honesty + ", righteousness=" + righteousness + ", virtue=" + virtue + '}';
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
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getObedience() {
        return obedience;
    }

    public void setObedience(int obedience) {
        this.obedience = obedience;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getRighteousness() {
        return righteousness;
    }

    public void setRighteousness(int righteousness) {
        this.righteousness = righteousness;
    }

    public int getVirtue() {
        return virtue;
    }

    public void setVirtue(int virtue) {
        this.virtue = virtue;
    }
    
}
