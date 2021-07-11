/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DANIELA
 */
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of perimetro method, of class Triangulo.
     */
    @Test
    public void testPerimetro() {
        //System.out.println("perimetro");
        double lado1 = 2.0, lado2 = 3.0, lado3 = 4.0;
        Triangulo instance = new Triangulo(lado1,lado2,lado3);
        double expResult = 24.0;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Triangulo.
     */
    @Test
    public void testArea() {
        //System.out.println("area");
        double lado1 = 2, lado2 = 3, lado3 = 4;
        Triangulo instance = new Triangulo(lado1,lado2,lado3);
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Triangulo.
     */
    @Test
    public void testImprimir() {
        //System.out.println("imprimir");
        double lado1 = 2, lado2 = 3, lado3 = 4 ;
        Triangulo instance = new Triangulo(lado1,lado2,lado3);
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
