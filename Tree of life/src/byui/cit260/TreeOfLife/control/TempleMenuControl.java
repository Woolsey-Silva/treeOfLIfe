/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import static java.lang.Math.sqrt;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Caleb
 */
public class TempleMenuControl {
    public int askComplexQuestion(double correctAnswer, int height, int length)
    {
        // Test for invalid inputs
        if (!(height >= 1 && height <= 8))
        {
            return -1;
        }
        
        if (!(length >= 1 && length <= 24))
        {
            return -2;
        }
        
        // Create the testAnswer variable
        double testAnswer = sqrt((height*height)+(length*length));
        
        // Round testAnswer 2 places
        BigDecimal bd = new BigDecimal(testAnswer);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        testAnswer = bd.doubleValue();
        
        // Out the new testAnswer to the screen for debugging
        System.out.println("testAnswer: " + testAnswer);
        System.out.println("correctAnswer: " + correctAnswer);
        
        // Test the users input vs the correct answer
        if (testAnswer == correctAnswer)
        {
            // if correct: return 0
            return 0;
        }
        
        else
        {
            // if not correct return 1
            return 1;
        } 
    }
}
