/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusaApp.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sofi
 */
public class Juego {
    
    private List <Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
        this.jugadores= new ArrayList ();
    }

    public Juego(List<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    
}
