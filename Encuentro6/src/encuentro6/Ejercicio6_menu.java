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
public class Ejercicio6_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num1, num2;
        int opcion;
        String respuesta;
      
        
       
       
        
        do {
            
            System.out.println("Ingrese un numero entero positivo");
            num1=leer.nextInt();
            System.out.println("Ingrese otro numero entero positivo");
            num2=leer.nextInt();

            
            
            System.out.println("MENÚ ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            opcion=leer.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    continue;
                case 2: 
                    System.out.println("La resta es: " + (num1-num2));
                    continue;
                case 3: 
                    System.out.println("La multiplicación es: " + (num1*num2));
                    continue; 
                case 4: 
                    System.out.println("La división es: " + (num1/num2));
                    continue;
                case 5: 
                    System.out.println("Esta seguro que desea salir del programa? (s/n)");
                    respuesta=leer.next();
                    if (respuesta.equals("s")) {
                        break;
                    } else {
                        continue;
                    }
                 
            }
        
        } while (opcion <=1000000000);
        
        
    }
    
}
