/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Figura;
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
public class FiguraTest {
    
    Figura fg;
    
    public FiguraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fg = new FiguraImpl();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Figura.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = 0.0;
        double result = fg.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of perimetro method, of class Figura.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        double expResult = 0.0;
        double result = fg.perimetro();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of imprimir method, of class Figura.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");;
        fg.imprimir();
    }

    public class FiguraImpl extends Figura {

        public double area() {
            return 0.0;
        }

        public double perimetro() {
            return 0.0;
        }

        public void imprimir() {
        }
    }
    
}
