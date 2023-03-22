/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro7;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Guia_11_reemplazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase; 
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        String resultado= funcion(frase);
        
        System.out.println(resultado);
    }
    
    public static String funcion (String frase) {
        
        frase= frase.toUpperCase();
        
        String fraseCambiada= frase.replace('A', '@');
        fraseCambiada= fraseCambiada.replace('E', '#');
        fraseCambiada= fraseCambiada.replace('I', '$');
       fraseCambiada= fraseCambiada.replace('O', '%');
       fraseCambiada= fraseCambiada.replace('U', '*');
       
       
       
        return fraseCambiada;
        
    }
    
}
