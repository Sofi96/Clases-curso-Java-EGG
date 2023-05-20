/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_teoria;

import Entidades.Libro;
import Servicios.LibroService;
import java.util.ArrayList;

/**
 *
 * @author Sofi
 */
public class EjListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService ls=new LibroService();
        
        ArrayList <Libro> biblioteca= ls.crearListaLibros();
        
        ls.mostrarLista(biblioteca);
        
        
        
        
        
        
        
    }
    
}
