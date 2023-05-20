/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppArrays;

import Service.ArregloService;

/**
 *
 * @author Sofi
 */
public class MainArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService as= new ArregloService();
        
        int [] arregloA = new int[50];
        int [] arregloB= new int[20];
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        
        as.ordenar(arregloA);
        as.mostrar(arregloA);
        
        as.inicializarB(arregloA, arregloB);
        as.mostrar(arregloB);

    
    
    }
    
}
