/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import static java.lang.Math.sqrt;

/**
 *
 * @author Caleb
 */
public class TempleMenuControl {
    public int askComplexQuestion(double correctAnswer, int height, int length)
    {
        // Test for invalid inputs
        if (!(height >= 1 && height <= 24))
        {
            return -1;
        }
        
        if (!(length >= 1 && length <=8))
        {
            return -2;
        }
        
        // Create the testAnswer variable
        double testAnswer = sqrt((height*height)+(length*length));
        
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
