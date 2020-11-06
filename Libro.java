
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    //Metodo para devolver el valor del autor
    public String getNombreAutor() {
        return autor;
    }
    
    //Metodo para devolver el valor del libro
    public String getNombreTitulo() {
        return titulo;
    }
    
    //Metodo para imprimir por pantalla el nombre del autor
    public void impreimeAutor () {
            System.out.println("El nombre del autor es: " + autor);       
    }
    
    //Metodo para imprimir por pantalla el nombre del libro
    public void impreimeTitulo () {
            System.out.println("El nombre del titulo es: " + titulo);       
    }
}
