
package ejercicio2_diapositivasclase6_pooclases;


public class Libro {
private String titulo;
private String autor;
private int numPaginas;
private int calificacion;

    public Libro(String titulo, String autor, int numPaginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
    }



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }




}
