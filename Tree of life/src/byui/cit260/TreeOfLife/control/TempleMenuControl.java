/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.TempleMenuControlException;
import static java.lang.Math.sqrt;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Caleb
 */
public class TempleMenuControl {
    public void askComplexQuestion(double correctAnswer, int height, int length)throws TempleMenuControlException
    {
        // Test for invalid inputs
        if (!(height >= 1 && height <= 8))
            throw new TempleMenuControlException("The value of Hieght you have given is out of bounds");
        {
            //return -1;
            
        }
        
        if (!(length >= 1 && length <= 24))
            throw new TempleMenuControlException("The value of Length you have given is out of bounds");
        {
            //return -2;
            
        }
        
        // Create the testAnswer variable
        double testAnswer = sqrt((height*height)+(length*length));
        
        // Round testAnswer 2 places
        BigDecimal bd = new BigDecimal(testAnswer);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        testAnswer = bd.doubleValue();
        
        // Test the users input vs the correct answer
        if (testAnswer == correctAnswer)
            throw new TempleMenuControlException("The answer given is correct");
        {
            // if correct: return 0
            //return 0;
        }
        
        if (!(testAnswer == correctAnswer))
        throw new TempleMenuControlException("The answer given was incorret");
        {
            // if not correct return 1
            //return 1;
        } 
    }
    
    public void askComplexQuestion2(double correctAnswer, int height, int length)throws TempleMenuControlException
    {
          if (!(height >= 1 && height <= 25))
              throw new TempleMenuControlException("Error in Height input");
          {
              //return -1;   
          }
          if (!(length >= 1 && length <= 25))
              throw new TempleMenuControlException("Error in Length input");
          {
              //return -2;
          }
          
          int testAnswer = (height * length);
          
          if (testAnswer == correctAnswer)
              throw new TempleMenuControlException("The answer was correct");
          {
              //return 0;
          }
          if(!(testAnswer == correctAnswer))
          throw new TempleMenuControlException("The answer was incorrect");
          {
              //return 1;
          }
            
          
    }

    public int askComplexQuestion3(double correctAnswer, int width, int length)throws TempleMenuControlException {
        
          if (!(width >= 1 && width <= 484))
              throw new TempleMenuControlException("Error in Height value");
          {
              //return -1;   
          }
          if (!(length >= 1 && length <= 484))
              throw new TempleMenuControlException("Error in Length value");
          {
              //return -2;
          }
          
          int testAnswer = (width * length);
          
          if (testAnswer == correctAnswer)
              throw new TempleMenuControlException("The answer was correct");
          {
              //return 0;
          }
          if(!(testAnswer == correctAnswer))
              throw new TempleMenuControlException("The answer was incorrect");
          {
              //return 1;
          }
    }
}
