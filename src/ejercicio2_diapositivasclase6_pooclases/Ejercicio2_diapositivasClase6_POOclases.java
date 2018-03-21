

package ejercicio2_diapositivasclase6_pooclases;


public class Ejercicio2_diapositivasClase6_POOclases {

 
    public static void main(String[] args) {
       ConjuntosLibros misLibros= new ConjuntosLibros();
       
       Libro libro1=new Libro("Juventud en extasis","Carlos Cuautemoc",210,9);
       Libro libro2=new Libro("Orgullo y prejuicio", "Jane Osten", 150, 7);
   
       
       misLibros.anadirLibro(libro1);
       misLibros.anadirLibro(libro2);
       
       misLibros.eliminarXautor("Jane Osten");
       misLibros.eliminarXtitulo("Juventud en extasis");
       
       misLibros.anadirLibro(libro2);
       misLibros.mostrarTodo();
       
       
    }
    
}
