/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Sofi
 */
public class ArregloService {
    
    public void inicializarA(int[] arreglo){
        
        for (int i = 0; i < 50; i++) {
            arreglo[i]= (int) (Math.random()*10);
        }
        
    }
    
    public void mostrar(int[] arreglo){
        
        int tamaño= arreglo.length;
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
         System.out.println("------------------------------------------------------------------");
    }
    
    public void ordenar (int[] arreglo){
        Arrays.sort(arreglo);
        int aux;
        
                
        // llenar intercambiar valores de mayor a menor
                
        for (int i = 0; i < arreglo.length/2; i++) {
            
            aux=arreglo[i];
            arreglo[i]= arreglo[arreglo.length-1-i];
            arreglo[arreglo.length-1-i]= aux;
        }
    }
    
    public void inicializarB (int[] arregloA, int[] arregloB){
        
        for (int i = 0; i < arregloB.length; i++) {
            
            if (i<arregloB.length/2) {
                arregloB[i]= arregloA[i];
            } else{
                arregloB[i]= 5;
            }

        }
    }
}
