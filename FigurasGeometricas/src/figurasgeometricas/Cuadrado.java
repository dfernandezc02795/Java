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
public class Cuadrado extends Figura {

    double ancho, area, perimetro;
    DecimalFormat df = new DecimalFormat("###.##");

    public Cuadrado(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double area() {
        area = Math.pow(ancho, 2);
        return area;
    }

    @Override
    public double perimetro() {
        perimetro = ancho * 4;
        return perimetro;
    }

    @Override
    public void imprimir() {
        area();
        perimetro();
        System.out.println("Cuadrado \n"
                + "Área: " + df.format(area) + "\n"
                + "Perimetro: " + df.format(perimetro));
    }

}
