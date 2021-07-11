/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author DANIELA
 */
public class ExcepcionNumeroNegativo extends Exception{
    
    public ExcepcionNumeroNegativo(String mensaje) {
        super("Error: " + mensaje);
    }
    
}
