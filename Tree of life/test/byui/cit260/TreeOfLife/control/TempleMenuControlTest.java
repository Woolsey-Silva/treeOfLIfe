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
     * Test of askComplexQuestion method, of class TempleMenuControl.
     */
    @Test
    public void testAskComplexQuestion() {
        // Test Case 1
        System.out.println("askComplexQuestion");
        double correctAnswer = 11.31;
        int height = 8;
        int length = 8;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 2
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 0;
        length = 8;
        expResult = -1; // -1 Because the height is invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 3
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 8;
        length = 0;
        expResult = -2; // -2 Because the length is invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 4
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 25;
        length = 9;
        expResult = -1; // -1 Because height is tested first as invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 5
        System.out.println("askComplexQuestion");
        correctAnswer = 24.02;
        height = 1;
        length = 24;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 6
        System.out.println("askComplexQuestion");
        correctAnswer = 8.06;
        height = 8;
        length = 1;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        // Test Case 7
        System.out.println("askComplexQuestion");
        correctAnswer = 29.30;
        height = 8;
        length = 24;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
