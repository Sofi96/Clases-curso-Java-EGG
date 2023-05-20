/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class PersonaService {
    
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre=leer.next();
        System.out.println("Ingrese su año de nacimiento");
        int año= leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes= leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        int dia= leer.nextInt();
        
        Date fecha= new Date(año-1900,mes-1,dia);
        
        
        return new Persona(nombre,fecha);   
    }
    
    public int calcularEdad(Persona p){
        
        Date fn= p.getFechaNacimiento();
        Date fa= new Date();
        
        int edad= fa.getYear()- fn.getYear();
        return edad;
    }
    
    public boolean menorQue(Persona p, int edad){
        
        boolean esMenor=false;
        if (calcularEdad(p)<edad) {
             esMenor=true;
        }
        
        return esMenor;
    }
}
