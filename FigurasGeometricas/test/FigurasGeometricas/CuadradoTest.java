/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Cuadrado;
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
public class CuadradoTest {
    
    Cuadrado c;
    DecimalFormat df = new DecimalFormat("###.##");
    
    public CuadradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        double ancho = 2.0;
        c = new Cuadrado(ancho);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Cuadrado.
     */
    @Test
    public void testArea() {
        double expResult = 4.0;
        
        double result = c.area();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of perimetro method, of class Cuadrado.
     */
    @Test
    public void testPerimetro() {
        double expResult = 8.0;
        
        double result = c.perimetro();
        
        assertEquals(df.format(expResult), df.format(result));
    }

    /**
     * Test of imprimir method, of class Cuadrado.
     */
    @Test
    public void testImprimir() {
        //System.out.println("imprimir");
        c.imprimir();
    }
    
}
