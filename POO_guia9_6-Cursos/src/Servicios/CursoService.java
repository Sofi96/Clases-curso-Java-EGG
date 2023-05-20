/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class CursoService {
    
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    
    
    
    public void cargarAlumnos(Curso c){
        String [] alumnos= new String [5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese el " + (i+1) + "º alumno");
            alumnos [i]=leer.next();
        }
        c.setAlumnos(alumnos);
    }
    
    public void mostrarAlumnos(Curso c){
        String [] alumnos= c.getAlumnos();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print(" [" + alumnos[i] + "] ");
        }
        
    }
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese el nombre del curso");
        String nombre=leer.next();
        System.out.println("Ingrese la cantidad de horas por dia");
        Double horas=leer.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana");
        int dias= leer.nextInt();
        System.out.println("Ingrese el turno");
        String turno=leer.next();
        System.out.println("Ingrese el precio por hora");
        Double precio=leer.nextDouble();
        
        Curso c =new Curso(nombre, horas, dias, turno, precio, new String[5]);
        cargarAlumnos(c);
        
        return c;
    }
    
    public double calcularGananciaSemanal (Curso c){
        int cantidadAlumnos= (c.getAlumnos()).length;
        
        Double gs= c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getCantidadDiasPorSemana()* cantidadAlumnos;
        
        return gs;
    }
}
