/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPeliculas.utilidades;

import AppPeliculas.Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Sofi
 */
public class Comparadores {
    
    public static Comparator <Pelicula> ordenarPorDuracionDesc = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
}
