/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detecciones.de.error;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class apoyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String seguir;
        String datos="Los datos ingresados son:";
        String legalidad;
        String nom;
        int edad;
        
        do {
            
            System.out.println("Ingrese el nombre");
            nom=leer.nextLine();
            
            
            
            datos= datos.concat( "\n"  + nom );
            
                     
            
            
            
            
            System.out.println("Desea continuar ingresando datos? (si/no)");
            seguir=leer.next();
            
        } while (seguir.equalsIgnoreCase("si"));
        
        
        System.out.println(datos);
    }
    
}

