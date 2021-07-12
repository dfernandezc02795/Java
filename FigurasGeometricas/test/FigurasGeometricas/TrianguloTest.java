/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Triangulo;
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
public class TrianguloTest {
    
    Triangulo t;
    double lado1, lado2, lado3;
    DecimalFormat df = new DecimalFormat("###.##");;
    
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
        lado1 = 2.0; 
        lado2 = 3.0;
        lado3 = 4.0;
        t = new Triangulo(lado1,lado2,lado3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of perimetro method, of class Triangulo.
     */
    @Test
    public void testPerimetro() {
        double expResult = 9;
        
        double result = t.perimetro();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of area method, of class Triangulo.
     */
    @Test
    public void testArea() {
        double expResult = 2.9047375096555625;
        
        double result = t.area();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of imprimir method, of class Triangulo.
     */
    @Test
    public void testImprimir() {
        t.imprimir();
    }
    
}
