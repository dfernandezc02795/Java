/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.text.DecimalFormat;

/**
 *
 * @author DANIELA
 */
public class Triangulo extends Figura {
    
    double lado1, lado2, lado3;
    DecimalFormat df = new DecimalFormat("###.##");
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * Metodo que retorna el perimetro del triangulo
     * @return perimetro
     */  
    @Override
    public double perimetro(){
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    /**
     * Metodo que retorna el area del cuadrado
     * @return area
     */
    @Override
    public double area() {
        double sp = perimetro/2;
        area = Math.sqrt((sp*(sp-lado1)*(sp-lado2)*(sp-lado3)));
        return area;
    }
    /**
     * Metodo que imprime los datos de triangulo
     */
    @Override
    public void imprimir() {
        perimetro();
        area();
        System.out.println("Triangulo \n" +
                           "Área: " + df.format(area) + "\n" +
                           "Perimetro: " + df.format(perimetro));
    }
}
