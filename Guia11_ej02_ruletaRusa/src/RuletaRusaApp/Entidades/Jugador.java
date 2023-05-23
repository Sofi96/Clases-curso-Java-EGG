/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusaApp.Entidades;

/**
 *
 * @author Sofi
 */
public class Jugador {
    
    private int ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        
    }

    public Jugador(int ID, boolean mojado) {
        this.ID = ID;
        this.nombre = "Jugador" + ID;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        this.nombre= "Jugador" + ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
   
    
}
