/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=  new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero entero");
        num1= leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2=leer.nextInt();
        System.out.println("La suma de los numeros es: " + (num1+num2));
    }
    
}
