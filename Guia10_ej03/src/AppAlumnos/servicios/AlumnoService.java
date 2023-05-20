/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppAlumnos.servicios;

import AppAlumnos.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class AlumnoService {
    
    private Scanner leer;
    private ArrayList <Alumno> listaAlumnos;

    public AlumnoService() {
        this.leer = new Scanner(System.in);
        this.listaAlumnos= new ArrayList();
    }
    
    
    
    public Alumno crearAlumno(){
        
        
        System.out.println("Ingrese el nombre del alumno");
        String n=leer.next();
        
        ArrayList <Integer> l= new ArrayList();
        
        System.out.println("Ingrese las 3 notas del alumno " + n + " (Teclee enter cada vez que ingrese una nota)");
        l.add(leer.nextInt());
        l.add(leer.nextInt());
        l.add(leer.nextInt());
        
        System.out.println("la cantidad de notas es: " + l.size());
        return new Alumno(n,l);
    }
    
    public ArrayList<Alumno> crearListaAlumnos (){
        String desicion;
        ArrayList <Alumno> lista= new ArrayList();
        int contador=0;
        do {
            Alumno a = crearAlumno();
            lista.add(a);
            System.out.println("Quiere crear otro alumno? (s/n)");
            desicion=leer.next();
            contador+=1;
        } while (desicion.equalsIgnoreCase("s"));
        
        System.out.println("Se agregaron correctamente "+ contador + " alumnos. ");
        
        this.listaAlumnos=lista;
        return lista;
    }
    
    public Integer notaFinal(){
                
        System.out.println("Ingrese el nombre del alumno para saber el promedio: ");
        String nombreAlumno= leer.next();
        
        ArrayList<Integer> notas= new ArrayList<>();
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno a= listaAlumnos.get(i);
            
            if (a.getNombre().equals(nombreAlumno)) {
                notas= a.getNotas();
                break;
            }
        }
        
        Integer suma=0;
        for (Integer aux : notas) {
            suma+=aux;
        }
        
        Integer promedio= suma/(notas.size());
        
        return promedio;
    }
    
}
