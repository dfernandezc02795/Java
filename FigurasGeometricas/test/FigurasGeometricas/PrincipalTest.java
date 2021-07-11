/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import figurasgeometricas.Principal;
import figurasgeometricas.Figura;
import figurasgeometricas.ImpresoraFiguras;
import figurasgeometricas.Circulo;
import figurasgeometricas.Cuadrado;
import figurasgeometricas.Triangulo;
import java.util.InputMismatchException;
import static org.hamcrest.core.Is.is;
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
public class PrincipalTest {
    
    int opcion;
    double radio, ancho, lado1,lado2,lado3;
    ImpresoraFiguras impF;
    Figura fCirculo, fCuadrado, fTriangulo;
    Principal p;
    
    public PrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        opcion = 3;
        
        impF = new ImpresoraFiguras();
        p = new Principal();
        
        radio = -2.0;
        fCirculo = new Circulo(radio);
        
        ancho = -3.0;
        fCuadrado = new Cuadrado(ancho);
      
        lado1= 2;
        lado2= -2;
        lado3= 2;
        fTriangulo = new Triangulo(lado1, lado2, lado3);
        
        
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of main method, of class Principal.
     */
    @Test
    public void testMain() {
       
        System.out.println("1. Circulo\n"
                + "2. Triangulo\n"
                + "3. Cuadrado");
        
        try {
            System.out.println("Seleccione una figura ");
           
            switch (opcion) {
                case 1:
                    try {
                        if(radio > 0){
                        impF.imprimir(fCirculo);
                        }
                    } catch (Exception ex) {
                       assertThat(ex.getMessage(), is("Error"));
                    }  
                    break;
                case 2:
                    try {
                        if(lado1 > 0 && lado2 > 0 && lado3 > 0){
                        impF.imprimir(fTriangulo);
                        }
                    } catch (Exception ex) {
                       assertThat(ex.getMessage(), is("Error"));
                    } 
                    break;
                case 3:
                    try {
                        if(ancho > 0){
                        impF.imprimir(fCuadrado);
                        }
                    } catch (Exception ex) {
                       assertThat(ex.getMessage(), is("Error"));
                    } 
                    break;
                default:
                    System.out.println("Opcion ingresada invalida");
                    break;
            }
        } catch (InputMismatchException ex) {
            assertThat(ex.getMessage(), is("Error"));
        }   
    
    }
    
}
