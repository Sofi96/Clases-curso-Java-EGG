
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofi
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
     * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
     * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String frasse;
        System.out.println("Ingrese una frase que comience con A");
        frasse= leer.nextLine();
        
        String primerLetra= frasse.substring(0,1);
        
        
        if (primerLetra.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
