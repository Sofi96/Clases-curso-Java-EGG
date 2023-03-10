/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double C;
        System.out.println("Ingrese la cantidad de ºC");
        C=leer.nextDouble();
        double F=32+(9*C/5);
        System.out.println("Esa cantidad de ºC equivalen a: " + F + "Farhenheit");
    }
    
}
