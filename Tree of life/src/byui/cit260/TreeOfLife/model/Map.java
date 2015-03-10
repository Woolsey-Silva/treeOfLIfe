/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;

/**
 *
 * @author Caleb
 */
public class Map implements Serializable{
    private int rowCount;
    private int colCount;

    private Location[][] locations;
    
    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        if(noOfRows < 1 || noOfColumns < 1){
            System.out.println("you are dumb");
            return;
        }
        this.rowCount = noOfRows;
        this.colCount = noOfColumns;
        
        this.locations =new Location[noOfRows][noOfColumns];
        
        for(int row =0; row < noOfRows; row++) {
            for(int column =0; column < noOfColumns; column++){
            
            Location location =new Location();
            location.setColumn(column);
            location.setRow(row);
            locations[row][column] = location;
            }
        }
        
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.rowCount;
        hash = 17 * hash + this.colCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        return true;
    }
    
    

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }
    
    
    
}
