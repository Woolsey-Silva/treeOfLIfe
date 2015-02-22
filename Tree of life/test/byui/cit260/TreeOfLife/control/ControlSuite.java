/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ENTELLiJENSE
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({byui.cit260.TreeOfLife.control.GameControlTest.class, byui.cit260.TreeOfLife.control.MapControlTest.class, byui.cit260.TreeOfLife.control.forgeArmorTest.class, byui.cit260.TreeOfLife.control.TempleMenuControlTest.class, byui.cit260.TreeOfLife.control.InventoryControlTest.class})
public class ControlSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
