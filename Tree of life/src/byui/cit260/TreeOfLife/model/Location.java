package byui.cit260.TreeOfLife.model;

import java.io.Serializable;


public class Location implements Serializable{
    private double row;
    private double column;
    private Scene scene;
    private Item itemInLocation;
    private Question questionInLocation;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Item getItemInLocation() {
        return itemInLocation;
    }

    public void setItemInLocation(Item itemInLocation) {
        this.itemInLocation = itemInLocation;
    }

    public Question getQuestionInLocation() {
        return questionInLocation;
    }

    public void setQuestionInLocation(Question questionInLocation) {
        this.questionInLocation = questionInLocation;
    }
    
    public Location() {
    }
    
    public Location(double row, double column) {
        this.row = row;
        this.column = column;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        return true;
    }
    
    
    
}
