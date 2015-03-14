package byui.cit260.TreeOfLife.model;

import java.io.Serializable;


public class Map implements Serializable{
    private int rowCount;
    private int colCount;
    private Location[][] locations;
    
    public Map() {
    }

    public Map(int numRows, int numCols) {
        if(numRows < 1 || numCols < 1){
            System.out.println("numRows and numCols have to be greater than 1");
            return;
        }
        this.rowCount = numRows;
        this.colCount = numCols;
        this.locations = new Location[numRows][numCols];
        
        for(int row = 0; row < numRows; row++) {
            for(int column = 0; column < numCols; column++){
            Location location = new Location();
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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    
    
    
}
