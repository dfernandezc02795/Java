/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Circulo;
import java.text.DecimalFormat;
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
public class CirculoTest {
    
    Circulo c;
    DecimalFormat df = new DecimalFormat("###.##");
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        double area = 2.0;
        c = new Circulo(area);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of perimetro method, of class Circulo.
     */    
     @Test
    public void testPerimetro() {
        double expResult = 12.56636;
        
        double result = c.perimetro();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of area method, of class Circulo.
     */
    @Test
    public void testArea() {
        double expResult = 12.56636;
        
        double result = c.area();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of imprimir method, of class Circulo.
     */
    @Test
    public void testImprimir() {
        c.imprimir();
    }
    
}
