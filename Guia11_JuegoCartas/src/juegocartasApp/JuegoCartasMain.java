/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartasApp;

import Entidades.Baraja;
import Entidades.Carta;
import Servicios.BarajaService;

/**
 *
 * @author Sofi
 */
public class JuegoCartasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaService bs= new BarajaService ();
        
        Baraja b= new Baraja();
        
        bs.Barajar(b);
        
        for (Carta aux : b.getBaraja()) {
            System.out.println(aux);
        }
        
     
        
        bs.darCartas(b);
        System.out.println("La cantidad de cartas disponibles es: "+ bs.cartasDisponibles(b));
        
        
        bs.darCartas(b);
        
        System.out.println("La cantidad de cartas disponibles es: "+ bs.cartasDisponibles(b));
        
        bs.mostrarBaraja(b);
        System.out.println("La cantidad de cartas disponibles es: "+ bs.cartasDisponibles(b));
    }
    
}
