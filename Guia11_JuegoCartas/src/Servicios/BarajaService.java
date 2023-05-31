/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class BarajaService {
    
    private Scanner leer;
    
    

    public BarajaService() {
        this.leer= new Scanner (System.in).useDelimiter("\n");
    }
     
        
    public void Barajar(Baraja b){
        List<Carta> Carta;
        
        
       shuffle(b.getBaraja());
       shuffle(b.getBaraja());
    }
    
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public Carta siguienteCarta(Baraja baraja){
        //baraja= de tipo Baraja
        //b= Arraylist de Cartas
        
        Carta c = new Carta();
        
        List <Carta> b= baraja.getBaraja();
        List <Carta> m= baraja.getMonton();
        
        
        int tamaño = b.size();
        
        if (tamaño==0) {
            System.out.println("La baraja no tiene mas cartas");
        }else{
            
            c=b.get(0);
            b.remove(0);
            m.add(c);
           
        }
        
        baraja.setBaraja(b);
        baraja.setMonton(m);
        
        return c;
    }
    
//    cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    public int cartasDisponibles(Baraja baraja){
        
        List <Carta> b= baraja.getBaraja();
        int tamaño = b.size();
        return tamaño;
    }
    
    
    
//    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    
    public void darCartas (Baraja b){
        
        System.out.println("Ingrese la cantidad de cartas a repartir: ");
        int n =leer.nextInt();
        
        
        if (b.getBaraja().size()<n) {
            System.out.println("No alcanzan las cartas para repartir esa cantidad");
        }else {
        System.out.println("Las cartas repartidas en esta mano son: ");
        for (int i = 0; i < n; i++) {
            System.out.println(siguienteCarta(b));
        }
        }
    }
    
//    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    
    public void cartasMonton(Baraja b){
        List <Carta> m= b.getMonton();
        
        if (m.size()==0) {
            System.out.println("No ha salido ninguna carta de la baraja");
            
        }else{
            System.out.println("Las cartas que ya han salido del mazo son: ");
            for (Carta aux : m) {
                System.out.println(aux);
            }
        }
        
    }
    
//    mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    
    public void mostrarBaraja(Baraja b){
        
        System.out.println("Las cartas restantes de la baraja son: ");
        for (Carta aux : b.getBaraja()) {
            System.out.println(aux);   
        }
    }
}
