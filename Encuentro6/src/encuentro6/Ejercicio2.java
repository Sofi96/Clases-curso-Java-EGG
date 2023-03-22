/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro6;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
     * Nota: investigar la función equals() en Java.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave;
        System.out.println("Ingrese la clave");
        clave= leer.next();
        
        if (clave.equals("eureka")) {
            System.out.println("La clave es correcta");
            
        }else {
            System.out.println("La clave es incorrecta");
        }
          
    }
    
}
