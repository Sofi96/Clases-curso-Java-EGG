/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import AppPeliculas.Entidades.Pelicula;
import AppPeliculas.Servicios.PeliculaService;
import AppPeliculas.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sofi
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ps= new PeliculaService();
        
        ArrayList <Pelicula> lp= ps.crearListaPeliculas();
        ps.mostrarTodas();
        ps.mostrarPeliculasLargas();
        
        Collections.sort(lp, Comparadores.ordenarPorDuracionDesc);
        
        ps.mostrarTodas();
    }
    
}
