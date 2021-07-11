/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author DANIELA
 */
public class Principal {
    
    public double numeroNegativo(double valor) throws ExcepcionNumeroNegativo{
        if (valor > 0){
            return valor;
        }else{
            throw  new ExcepcionNumeroNegativo("Número menor o igual a cero no permitido");
        }
    }
    
    public double[] numeroNegativoTriangulo(double valor1, double valor2, double valor3) throws ExcepcionNumeroNegativo{
        if (valor1 > 0 && valor2 > 0 && valor3 > 0){
            return new double[]{valor1,valor2,valor3};
        }else{
            throw new ExcepcionNumeroNegativo("Número menor o igual a cero no permitido");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int opcion;
        Figura f;
        ImpresoraFiguras impF = new ImpresoraFiguras();
        Principal p = new Principal();

        System.out.println("1. Circulo\n"
                + "2. Triangulo\n"
                + "3. Cuadrado");

        try {
            System.out.print("Seleccione una figura ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del radio ");
                    double radio = sn.nextDouble();
                    try {
                        p.numeroNegativo(radio);
                        f = new Circulo(radio);
                        impF.imprimir(f);
                    } catch (ExcepcionNumeroNegativo ex) {
                        System.out.print(ex.getMessage());
                    }   
                    break;
                case 2:
                    System.out.print("Ingrese el valor del lado1 ");
                    double lado1 = sn.nextDouble();
                    System.out.print("Ingrese el valor del lado2 ");
                    double lado2 = sn.nextDouble();
                    System.out.print("Ingrese el valor del lado3 ");
                    double lado3 = sn.nextDouble();
                    try {
                        p.numeroNegativoTriangulo(lado1,lado2,lado3);
                        f = new Triangulo(lado1, lado2, lado3);
                        impF.imprimir(f);
                    } catch (ExcepcionNumeroNegativo ex) {
                        System.out.print(ex.getMessage());
                    } 
                    break;
                case 3:
                    System.out.print("Ingrese el valor del ancho ");
                    double ancho = sn.nextDouble();
                    try {
                        p.numeroNegativo(ancho);
                        f = new Cuadrado(ancho);
                        impF.imprimir(f);
                    } catch (ExcepcionNumeroNegativo ex) {
                        System.out.print(ex.getMessage());
                    }  
                    break;
                default:
                    System.out.println("Opcion ingresada invalida");
                    break;
            }
        } catch (InputMismatchException ex) {
            System.out.print("El valor ingresado, no correspondía a un número");
        }   
    }
}
