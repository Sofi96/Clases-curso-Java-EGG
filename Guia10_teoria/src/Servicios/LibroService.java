/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author Sofi
 */
public class LibroService {
    
    
   public ArrayList <Libro> crearListaLibros(){
       
       ArrayList <Libro> Biblioteca=new ArrayList();
       
       Libro l1= new Libro("100 años de soledad");
       Libro l2= new Libro("402 farenheit");
       Libro l3= new Libro("la granja");
       
       Biblioteca.add(l1);
       Biblioteca.add(l2);
       Biblioteca.add(l3);
       
       return Biblioteca;
   }
   
   public void mostrarLista(ArrayList<Libro> biblioteca){
    
              
       for (Libro i : biblioteca) {
           
           System.out.println(i);
       }
   }
}
