/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCalculatorOOP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SkullFlight
 */
public class ButtonTest {
    
    public ButtonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pushButton method, of class Button.
     */
    @Test
    public void testPushButton() {
        System.out.println("pushButton");
        Button instance = new Button();
        Character expResult = null;
        Character result = instance.pushButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawOnButton method, of class Button.
     */
    @Test
    public void testDrawOnButton() {
        System.out.println("drawOnButton");
        Character markup = null;
        Button instance = new Button();
        instance.drawOnButton(markup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
