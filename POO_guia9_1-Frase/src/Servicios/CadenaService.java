/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class CadenaService {
    
    private Scanner leer= new Scanner (System.in).useDelimiter("\n");
    
    public int mostrarVocales (Cadena c){
        
        int longitud= c.getLongi();
        String frase= c.getFrase();
        
        String letra;
        int cantidadVocales=0;
        
                    
        for (int i = 0; i < longitud; i++) {
            
            letra= frase.substring(i,i+1);
            
            if (letra.equals("a")|| letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u")) {
                cantidadVocales= cantidadVocales + 1;
            }
        }
        
        return cantidadVocales;
    }
    
    
    public void invertirFrase (Cadena c){
        
        int longitud= c.getLongi();
        String frase= c.getFrase();
        String letra;
        for (int i = longitud-1; i >= 0; i--) {
            
            letra= frase.substring(i,i+1);
            System.out.print(letra);
        }
        
    }
    
    
    public void vecesRepetido (Cadena c){
        int veces=0;
        int longitud= c.getLongi();
        String frase= c.getFrase();
        String letraFrase;
        System.out.println("Ingrese la letra a buscar");
        String letraBuscar=leer.next();
        
        for (int i = 0; i < longitud; i++) {
            
            letraFrase= frase.substring(i,i+1);
            
            if (letraFrase.equals(letraBuscar)) {
                veces +=1;
            }
        }
        
        System.out.println("Se repite su letra: " + veces + " veces");         
    }
    
    public void compararLongitud(Cadena c) {
        String frase1= c.getFrase();
        int longitud1= c.getLongi();
        
        
        System.out.println("Ingrese una frase a comparar longitud");
        String frase2= leer.next();
        int longitud2= frase2.length();
        
        
        
        System.out.println(Math.max(longitud1, longitud2));
    }
    
    public String unirFrases(Cadena c, String frase2) {
        String frase1= c.getFrase();
        String fraseUnida= frase1.concat(frase2);
        
        
        return fraseUnida;
    }
    
    public void reemplazar(Cadena c) {
        String frase= c.getFrase();
        
        
        System.out.println("Ingrse por que letra reemplazara todas las 'a'");
        char letra= leer.next().charAt(0);
        
        System.out.println(frase.replace('a', letra));
        
    }
    
    public boolean contiene(Cadena c, String letra) {
        boolean laContiene;
        String frase= c.getFrase();
        laContiene= frase.contains (letra);
        
        return laContiene;
    }
}
