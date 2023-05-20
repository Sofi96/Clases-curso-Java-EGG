/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Sofi
 */
public class Cafetera {
    
     private int capacidadMáxima;
     private int cantidadActual;
     
     
     //CONSTRUCTORES

    public Cafetera() {
    }
    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    //SETTERS Y GETTERS

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //OTROS METODOS

    @Override
    public String toString() {
        return "ESTADO DE LA Cafetera{" + "capacidadM\u00e1xima=" + capacidadMáxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
