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
public enum TempleMenuQuestions implements Serializable{
    
    question1(","),
    question2(","),
    question3(",");
    
    private final String question;
    private final String answer;
    
    private Location[] location;

    TempleMenuQuestions(String question) {
        this.question = question;
        this.answer = "test";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    
    
    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
 
}
