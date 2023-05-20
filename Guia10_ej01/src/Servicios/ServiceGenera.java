/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class ServiceGenera {
    
    private Scanner leer;
    public ArrayList <String> razas;

    public ServiceGenera() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }
    
    public void listaRazas (){
        
        System.out.println("---------------Función de agregado de razas---------------");
        do {
            System.out.println("Ingrese una nueva raza: ");
            razas.add(leer.next());
            
            System.out.println("Quiere seguir agregando razas? (S/N)");
            
        } while (leer.next().equalsIgnoreCase("S"));
        
        mostrarListaRazas();
        
    }
    
    
    
    public void mostrarListaRazas (){
        System.out.println("Las razas de perros en la lista son: ");
        for (String aux : razas) {
            
            System.out.println(aux);
        }
    }
    
    public void eliminarRaza (){
        Iterator <String> it= razas.iterator();
       
        System.out.println("Ingrese la raza a eliminar de la lista");
        String razaEliminar= leer.next();
        int n=razas.size();
        
        while (it.hasNext()) {
            String aux= it.next();
            
            if (aux.equals(razaEliminar)) {
                it.remove();
            }
        }
       
        int m=razas.size();
        
        if (n==m) {
            System.out.println("No se eliminó ninguna raza.");
        }
        
    }
}
