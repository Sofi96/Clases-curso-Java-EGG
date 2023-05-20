/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoAPP;

import EquipoAPP.Entidades.Equipo;
import EquipoAPP.Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sofi
 */
public class Main_EquipoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Jugador> jugadores=new ArrayList ();
        
        jugadores.add(new Jugador("Kevin", "Mier", "Arquero", 23));
        jugadores.add(new Jugador("Cristian", "Zapata", "Defensa", 2));
        jugadores.add(new Jugador("Sebastian", "Gomez", "Mediocampista", 5));
        jugadores.add(new Jugador("Jefferson", "Duque", "Delantero", 9));
        
        Equipo e1= new Equipo("Nacional", jugadores);
        
        System.out.println(e1);
        
    }
    
}
