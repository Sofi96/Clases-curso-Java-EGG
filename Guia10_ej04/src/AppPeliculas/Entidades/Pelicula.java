/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPeliculas.Entidades;

/**
 *
 * @author Sofi
 */
public class Pelicula {
    
    private String nombre;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
}
