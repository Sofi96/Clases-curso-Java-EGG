/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Sofi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String frase;
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        frase= toUpperCase(frase);
        System.out.println(frase);
        frase= toLowerCase(frase);
        System.out.println(frase);
       
    }
    
}
