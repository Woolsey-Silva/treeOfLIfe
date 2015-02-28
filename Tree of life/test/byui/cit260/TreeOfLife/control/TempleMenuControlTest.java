/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caleb
 */
public class TempleMenuControlTest {
    
    public TempleMenuControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateComplexQuestion method, of class TempleMenuControl.
     */
    @Test
    public void testCalculateComplexQuestion() {
        System.out.println("calculateComplexQuestion");
        double correctAnswer = 7.07;
        int height = 5;
        int length = 5;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.calculateComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateComplexQuestion2 method, of class TempleMenuControl.
     */
    @Test
    public void testCalculateComplexQuestion2() {
        System.out.println("calculateComplexQuestion2");
        double correctAnswer = 25.0;
        int height = 5;
        int length = 5;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.calculateComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateComplexQuestion3 method, of class TempleMenuControl.
     */
    @Test
    public void testCalculateComplexQuestion3() {
        System.out.println("calculateComplexQuestion3");
        double correctAnswer = 25.0;
        int width = 5;
        int length = 5;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.calculateComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
    
    }
}
