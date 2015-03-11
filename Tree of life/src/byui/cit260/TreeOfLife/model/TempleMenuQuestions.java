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
    
    question1("NEEDS TO BE FIXED!", "NEEDS TO BE FIXED!"),
    question2("NEEDS TO BE FIXED!", "NEEDS TO BE FIXED!"),
    question3("NEEDS TO BE FIXED!", "NEEDS TO BE FIXED!"),
    question4("NEEDS TO BE FIXED!", "NEEDS TO BE FIXED!"),
    question5("NEEDS TO BE FIXED!", "NEEDS TO BE FIXED!");
    
    private final String question;
    private final String answer;

    TempleMenuQuestions(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
