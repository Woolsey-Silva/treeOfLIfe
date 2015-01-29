/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;

/**
 *
 * @author ENTELLiJENSE
 */
public class Game implements Serializable {
   private double gameTime;
   private double RecordTime;

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.gameTime) ^ (Double.doubleToLongBits(this.gameTime) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.RecordTime) ^ (Double.doubleToLongBits(this.RecordTime) >>> 32));
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
        if (Double.doubleToLongBits(this.gameTime) != Double.doubleToLongBits(other.gameTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.RecordTime) != Double.doubleToLongBits(other.RecordTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameTime=" + gameTime + ", RecordTime=" + RecordTime + '}';
    }

   
   
    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }

    public double getRecordTime() {
        return RecordTime;
    }

    public void setRecordTime(double RecordTime) {
        this.RecordTime = RecordTime;
    }
   
    
}
