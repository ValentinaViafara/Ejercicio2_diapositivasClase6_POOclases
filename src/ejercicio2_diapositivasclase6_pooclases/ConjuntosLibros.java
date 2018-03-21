
package ejercicio2_diapositivasclase6_pooclases;

public class ConjuntosLibros {
    
    private Libro[] libros;
    
    public ConjuntosLibros(){
        this.libros=new Libro[20];
    }
    
    public boolean anadirLibro(Libro libro){
       boolean proceso= false;
        for (int i = 0; i < 20; i++) {
            if(this.libros[i] == null){
                libros[i]=libro;
                proceso=true;
                break;
            }
        }
      return proceso;
    }
    
   public boolean eliminarXautor(String autor){
       boolean proceso=false;
       for (int i = 0; i < 20; i++) {
           if(this.libros[i].getAutor().equals(autor)){
               libros[i]=null;
               proceso=true;
               break;
           }
       }
       return proceso;
       
   }
   
   public boolean eliminarXtitulo(String titulo){
       boolean proceso=false;
       for (int i = 0; i < 20; i++) {
           if(this.libros[i].getTitulo().equals(titulo)){
               libros[i]=null;
               proceso=true;
               break;
           }
           
       }
       return proceso;
   }
   
   public Libro mostrarMayorCalificacion(){
       int aux=0;
       int j=-1;
       for (int i = 0; i < 20; i++) {
           if(this.libros[i].getCalificacion()>aux){
               aux=libros[i].getCalificacion();
               j=i;  
           }
       }
       return libros[j];
   }
   
   public Libro mostrarMenorCalificacion(){
       int aux=11;
       int j=-1;
       
       for (int i = 0; i < 20; i++) {
           if(libros[i]!=null){
           if(this.libros[i].getCalificacion()<aux){
               aux=libros[i].getCalificacion();
               j=i;
           }
           }
       }
       return libros[j];
   }
   
   
   public void mostrarTodo(){
       for (int i = 0; i < libros.length; i++) {
           if(libros[i]!=null){
               System.out.println("El libro"+ (i+1)+ " es "+ libros[i].getTitulo()+ ". del autor "+ libros[i].getAutor());
           }
           
       }
   }
    
}

