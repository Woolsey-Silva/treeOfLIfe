/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Caleb
 */
public class TempleMenuControlTest {
    
    public TempleMenuControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
        System.out.println("result: " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // Test Case 2
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 0;
        length = 8;
        expResult = -1; // -1 Because the height is invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
        
        // Test Case 3
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 8;
        length = 0;
        expResult = -2; // -2 Because the length is invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 4
        System.out.println("askComplexQuestion");
        correctAnswer = 0; // This value doesn't matter
        height = 25;
        length = 9;
        expResult = -1; // -1 Because height is tested first as invalid
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 5
        System.out.println("askComplexQuestion");
        correctAnswer = 24.02;
        height = 1;
        length = 24;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 6
        System.out.println("askComplexQuestion");
        correctAnswer = 8.06;
        height = 8;
        length = 1;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 7
        System.out.println("askComplexQuestion");
        correctAnswer = 25.30;
        height = 8;
        length = 24;
        expResult = 0;
        result = instance.askComplexQuestion(correctAnswer, height, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of askComplexQuestion2 method, of class TempleMenuControl.
     */
    @Test
    public void testAskComplexQuestion2() {
        // Test Case 1
        System.out.println("askComplexQuestion2");
        double correctAnswer = 25.0;
        int height = 5;
        int length = 5;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 2
        System.out.println("askComplexQuestion2");
        correctAnswer = 0.0;
        height = 0;
        length = 5;
        expResult = -1;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 3
        System.out.println("askComplexQuestion2");
        correctAnswer = 0.0;
        height = 5;
        length = 0;
        expResult = -2;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 4
        System.out.println("askComplexQuestion2");
        correctAnswer = 0.0;
        height = 26;
        length = 26;
        expResult = -1;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 5
        System.out.println("askComplexQuestion2");
        correctAnswer = 25.0;
        height = 1;
        length = 25;
        expResult = 0;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 6
        System.out.println("askComplexQuestion2");
        correctAnswer = 25.0;
        height = 25;
        length = 1;
        expResult = 0;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
        
        // Test Case 7
        System.out.println("askComplexQuestion2");
        correctAnswer = 625.0;
        height = 25;
        length = 25;
        expResult = 0;
        result = instance.askComplexQuestion2(correctAnswer, height, length);
        assertEquals(expResult, result);
    }
    
    /**
 *
 * @author Brett Silva
 */
    @Test
    public void testAskComplexQuestion3() {
        // Test Case 1
        System.out.println("askComplexQuestion3");
        double correctAnswer = 484;
        int width = 22;
        int length = 22;
        TempleMenuControl instance = new TempleMenuControl();
        int expResult = 0;
        int result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
           // Test Case 2
        System.out.println("askComplexQuestion3");
        correctAnswer = 0.0;
        width = 0;
        length = 22;
        expResult = -1;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
          // Test Case 3
        System.out.println("askComplexQuestion3");
        correctAnswer = 0.0;
        width = 0;
        length = 22;
        expResult = -2;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
           // Test Case 4
        System.out.println("askComplexQuestion3");
        correctAnswer = 0.0;
        width = 485;
        length = 485;
        expResult = -1;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
              // Test Case 5
        System.out.println("askComplexQuestion3");
        correctAnswer = 484;
        width = 1;
        length = 484;
        expResult = 0;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
              // Test Case 6
        System.out.println("askComplexQuestion3");
        correctAnswer = 484;
        width = 484;
        length = 1;
        expResult = 0;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
        
              // Test Case 7
        System.out.println("askComplexQuestion3");
        correctAnswer = 484;
        width = 22;
        length = 22;
        expResult = 0;
        result = instance.askComplexQuestion3(correctAnswer, width, length);
        assertEquals(expResult, result);
    }

    private void assertEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

