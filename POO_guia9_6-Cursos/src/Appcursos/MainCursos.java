/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appcursos;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author Sofi
 */
public class MainCursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs= new CursoService();
        Curso c1= new Curso();
        
        /*
        cs.cargarAlumnos(c1);
        cs.mostrarAlumnos(c1);
        */
        
        Curso c2= cs.crearCurso();
        System.out.println(c2);
        
        System.out.println(cs.calcularGananciaSemanal(c2));
    }
    
}
