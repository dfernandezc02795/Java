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
public class Circulo extends Figura {

    double radio, PI = 3.14159;
    DecimalFormat df = new DecimalFormat("###.##");

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        perimetro = 2 * radio * PI;
        return perimetro;
    }

    @Override
    public double area() {
        area = PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public void imprimir() {
        area();
        perimetro();
        System.out.println("Circulo \n"
                + "Área: " + df.format(area) + "\n"
                + "Perimetro: " + df.format(perimetro));
    }

}
