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
public enum ComplexQuestion implements Serializable{
    complexQuestion1("QUESTION!", "ANSWER!", Item.CTRRING),
    complexQuestion2("QUESTION!", "ANSWER!", Item.CTRRING),
    complexQuestion3("QUESTION!", "ANSWER!", Item.CTRRING),
    complexQuestion4("QUESTION!", "ANSWER!", Item.CTRRING),
    complexQuestion5("QUESTION!", "ANSWER!", Item.CTRRING);
    
    private final String question;
    private final String answer;
    private final Item item;
    
    ComplexQuestion(String question, String answer, Item item) {
        this.question = question;
        this.answer = answer;
        this.item = item;
    }
    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
