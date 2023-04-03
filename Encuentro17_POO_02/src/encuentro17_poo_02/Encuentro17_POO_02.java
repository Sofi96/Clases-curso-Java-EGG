/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro17_poo_02;

import Entidad.Circunferencia;
import java.util.Scanner;
/**
 *
 * @author Sofi
 */
public class Encuentro17_POO_02 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Circunferencia primerCirculo= new Circunferencia ();
        Circunferencia segundoCirculo= new Circunferencia ();
        
        
//primer objeto
        System.out.println("Ingrese el radio del circulo: ");
        primerCirculo.setRadio(leer.nextDouble());
        
        System.out.println("El area del circulo es: " + primerCirculo.area());
        System.out.println("El perimetro del circulo es: " + primerCirculo.perimetro());

//segundo objeto
        System.out.println("Ingrese el radio del segundo circulo: ");
        segundoCirculo.setRadio(leer.nextDouble());
        
        System.out.println("El area del segundo circulo es: " + segundoCirculo.area());
        System.out.println("El perimetro del segundo circulo es: " + segundoCirculo.perimetro());
        
    }
    
}
