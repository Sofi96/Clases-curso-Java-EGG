/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sofi
 */
public class Baraja {
    
    private List <Carta> baraja;
    private List<Carta> monton;


    public Baraja() {
        
        List <Carta> b = new ArrayList();
        
        for (int i = 0; i < 12; i++) {
            if ((i+1)==8 || (i+1)==9 ) {
                
            }else {
                b.add(new Carta ((i+1),"Oro"));
            }
        }
        for (int i = 0; i < 12; i++) {
            if ((i+1)==8 || (i+1)==9 ) {
                
            }else {
                b.add(new Carta ((i+1),"Basto"));
            }
        }
        for (int i = 0; i < 12; i++) {
            if ((i+1)==8 || (i+1)==9 ) {
                
            }else {
                b.add(new Carta ((i+1),"Espada"));
            }
        }
        for (int i = 0; i < 12; i++) {
            if ((i+1)==8 || (i+1)==9 ) {
                
            }else {
                b.add(new Carta ((i+1),"Copa"));
            }
        }
        
        this.baraja= b;
        this.monton= new ArrayList();
    }

    public List<Carta> getMonton() {
        return monton;
    }

    public void setMonton(List<Carta> monton) {
        this.monton = monton;
    }

    
        
    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + ", monton=" + monton + '}';
    }

    
    
    
}
