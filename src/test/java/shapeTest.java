/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joeenright
 */
public class shapeTest {
    
    public shapeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    // Create an instance of Shape
    Shape instance = new Shape(10, 10);
    /**
     * Test of getHeight method, of class Shape.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        float expResult = 10;
        float result = instance.getHeight();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHeight method, of class Shape.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        float height = 10;
        instance.setHeight(height);
        float expResult = 10;
        assertEquals(expResult, instance.getHeight());
    }

    /**
     * Test of getLength method, of class Shape.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        float expResult = 10;
        float result = instance.getLength();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLength method, of class Shape.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        float length = 10;
        instance.setLength(length);
        float expResult = 10;
        assertEquals(expResult, instance.getLength());
        
    }

    /**
     * Test of getArea method, of class Shape.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        float expResult = 100.0F;
        float result = instance.getArea();
        assertEquals(expResult, result);
        
    }

    
    
}
