/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPeliculas.Servicios;

import AppPeliculas.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class PeliculaService {
    
    private Scanner leer;
    private ArrayList <Pelicula> listaPeliculas;

    public PeliculaService() {
        this.listaPeliculas= new ArrayList();
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pelicula crearPelicula (){
        String n;
        String d;
        Double h;
                
        System.out.println("Ingrese el nombre de la pelicula: ");
        n= leer.next();
        System.out.println("Ingrese el director de la pelicula: ");
        d= leer.next();
        System.out.println("Ingrese la duracion de la pelicula en horas (ej.: 1,5 ): ");
        h= leer.nextDouble();
            
        return new Pelicula (n,d,h);
    }
    
    public ArrayList <Pelicula> crearListaPeliculas (){
        int i=0;
         
        do {
            listaPeliculas.add(crearPelicula());
            i+=1;
            System.out.println("Desea agregar otra pelicula? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
        
        System.out.println("Se agregaron " + i + " peliculas.");
        return listaPeliculas; 
    }
     
    public void mostrarTodas (){
        System.out.println("---------------------------------------------");
        System.out.println("Las peliculas ingresadas hasta el momento son: ");
        
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
     
     public void mostrarPeliculasLargas(){
         System.out.println("---------------------------------------------");
         System.out.println("Las peliculas con una duracion superior a 1 hora son: ");
         for (Pelicula aux : listaPeliculas) {
             
             if (aux.getDuracion()>1) {
                 System.out.println(aux);
             }
         }
         
     }
     
}
