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
    
    question1("What is the answer to the universe?", "A"),
    question2("QUESTION!", "ANSWER!"),
    question3("QUESTION!", "ANSWER!"),
    question4("QUESTION!", "ANSWER!"),
    question5("QUESTION!", "ANSWER!"),
    question6("QUESTION!", "ANSWER!"),
    question7("QUESTION!", "ANSWER!"),
    question8("QUESTION!", "ANSWER!"),
    question9("QUESTION!", "ANSWER!"),
    question10("QUESTION!", "ANSWER!"),
    question11("QUESTION!", "ANSWER!"),
    question12("QUESTION!", "ANSWER!"),
    question13("QUESTION!", "ANSWER!"),
    question14("QUESTION!", "ANSWER!"),
    question15("QUESTION!", "ANSWER!"),
    question16("QUESTION!", "ANSWER!"),
    question17("QUESTION!", "ANSWER!"),
    question18("QUESTION!", "ANSWER!"),
    question19("QUESTION!", "ANSWER!"),
    question20("QUESTION!", "ANSWER!"),
    question21("QUESTION!", "ANSWER!"),
    question22("QUESTION!", "ANSWER!"),
    question23("QUESTION!", "ANSWER!"),
    question24("QUESTION!", "ANSWER!"),
    question25("QUESTION!", "ANSWER!");

    
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
