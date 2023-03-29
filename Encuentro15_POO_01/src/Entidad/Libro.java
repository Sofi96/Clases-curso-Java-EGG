
package Entidad;

public class Libro {

//atributos:    
    private long ISBN; 
    private String Título;
    private String Autor;
    private int paginas;
    
    
//constructores:
    public Libro(long ISBN, String Título, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.paginas = paginas;
    }
    public Libro() {
    }
    
    
//setters y getters:
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public void setTítulo(String Título) {
        this.Título = Título;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public long getISBN() {
        return ISBN;
    }
    public String getTítulo() {
        return Título;
    }
    public String getAutor() {
        return Autor;
    }
    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
    
}
