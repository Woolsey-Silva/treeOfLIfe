/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ENTELLiJENSE
 */
public class Scene implements
Serializable{
   private String type;
   private String description;
   private boolean visted;
   private boolean blocked;

    public Scene() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVisted() {
        return visted;
    }

    public void setVisted(boolean visted) {
        this.visted = visted;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
   
   

    

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", description=" + description + ", visted=" + visted + ", blocked=" + blocked + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.type);
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + (this.visted ? 1 : 0);
        hash = 13 * hash + (this.blocked ? 1 : 0);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.visted != other.visted) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        return true;
    }

   
   
   
   
}
