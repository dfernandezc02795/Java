/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Circulo;
import figurasgeometricas.Cuadrado;
import figurasgeometricas.Figura;
import figurasgeometricas.ImpresoraFiguras;
import figurasgeometricas.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DANIELA
 */
public class ImpresoraFigurasTest {
    
    Figura fCirculo, fCuadrado, fTriangulo;
    ImpresoraFiguras impFig;
    
    public ImpresoraFigurasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        double radio = 2.0;
        fCirculo = new Circulo (radio);
        impFig = new ImpresoraFiguras();
        
        double ancho = 2.0;
        fCuadrado = new Cuadrado (ancho);
        
        double lado1 = 3.0, lado2 = 3.0,lado3 = 3.0;
        fTriangulo = new Triangulo (lado1,lado2,lado3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of imprimir method, of class ImpresoraFiguras.
     */
    @Test
    public void testImprimirCirculo() {
        System.out.println("imprimir Circulo");
        
        impFig.imprimir(fCirculo);
    }
    
     @Test
    public void testImprimirCuadrado() {
        System.out.println("imprimir Cuadrado");
        
        impFig.imprimir(fCuadrado);
    }
    
     @Test
    public void testImprimirTriangulo() {
        System.out.println("imprimir Triangulo");
        
        impFig.imprimir(fTriangulo);
        //verify(fTriangulo,times(1)).imprimir();
        
    }
   
    
    
}
