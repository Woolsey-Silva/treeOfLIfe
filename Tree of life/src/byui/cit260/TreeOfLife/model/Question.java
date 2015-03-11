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
public enum Question implements Serializable{
    
    question1("QUESTION!", "ANSWER!"),
    question2("QUESTION!", "ANSWER!"),
    question3("QUESTION!", "ANSWER!"),
    question4("QUESTION!", "ANSWER!"),
    question5("QUESTION!", "ANSWER!");
    
    private final String question;
    private final String answer;
    
    Question(String question, String answer) {
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
