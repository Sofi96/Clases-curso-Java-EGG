/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class EstudianteService {
    
    private Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante [] crearEscuela(){
        Estudiante e1= new Estudiante("Camilo Sanchez",8.5);
        Estudiante e2= new Estudiante("Agustina Perez",7.5);
        Estudiante e3= new Estudiante("Sofia Blanes",10);
        Estudiante e4= new Estudiante("Cristian Tangarife",10);
        Estudiante e5= new Estudiante("Morena Blanes",9.5);
        Estudiante e6= new Estudiante("Fernando Polenta",5);
        Estudiante e7= new Estudiante("Francisco Ludovico",6.5);
        Estudiante e8= new Estudiante("Edgardo Cassiani",4.5);
        
        Estudiante [] Escuela1= {e1,e2,e3,e4,e5,e6,e7,e8};
        
        
        return Escuela1;
    }
    
    
    public void mostrarEscuela(Estudiante [] escuela){
        
        for (int i = 0; i < 8; i++) {
            System.out.println("["+ escuela[i] + "]");
        }
    }
    public double promedio(Estudiante [] estudiante){
        double suma=0;
        for (int i = 0; i < 8; i++) {
            
            suma+=estudiante[i].getNota();
        }
        double promedio= (suma/8);
        
        return promedio;
    }
    
    public String [] mayorAlPromedio(Estudiante [] estudiante){
        int n=0;
        int m=0;
        
        for (int i = 0; i < 8; i++) {
            
            if (estudiante[i].getNota()>promedio(estudiante)) {
                n+=1;
            }
        }
        String []grupoInteligente= new String [n];
        
        for (int i = 0; i < 8; i++) {
            if (estudiante[i].getNota()>promedio(estudiante)) {
                grupoInteligente[m]= estudiante[i].getNombre();
                m+=1;
            }
        }
        return grupoInteligente;
    }
    
    public void mostrarVector(String[] v){
        
        for (int i = 0; i < v.length; i++) {
            
            System.out.println("[" + v[i] + "]");
        }
    }
    
}
