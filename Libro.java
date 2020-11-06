
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
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean esEsteLibroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esEsteLibroDeTexto;
    }
    
    //Metodo para devolver el valor del autor
    public String getNombreAutor() {
        return autor;
    }
    
    //Metodo para devolver el valor del numero de referencia
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    //Metodo para devolver el valor del atributo esLibroDeTexto
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    //Metodo para devolver el valor del libro
    public String getNombreTitulo() {
        return titulo;
    }
    
    //Metodo para devolver el numero de paginas del libro
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    //Metodo para devolver el numero de veces prestadas del libro
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    //Metodo que modifica el atributo de veces prestado
    public void prestar () {
        vecesPrestado += 1;       
    }
    
    //Metodo para imprimir por pantalla el nombre del autor
    public void imprimeAutor () {
        System.out.println("El nombre del autor es: " + autor);       
    }
    
    //Metodo para imprimir por pantalla el numero de referencia
    public void comprobarNumeroReferencia (String numeroDeReferencia) {
        if (numeroDeReferencia.length() > 3){
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println("Error, el numero de referencia en menor de 3 caracteres");  
        }
    }
    
    //Metodo para imprimir por pantalla el nombre del libro
    public void imprimeTitulo () {
        System.out.println("El nombre del titulo es: " + titulo);       
    }
    
    //Metodo para imprimir los detalles del libro
    public void imprimeDetalles () {
        System.out.println(getDetalles());  
    }
    
    //Metodo que devuelve los detalles del libro
    public String getDetalles() {
        String libroDeTexto = "no";
        if (numeroReferencia == ""){
            numeroReferencia = "ZZZ";
        }
        if (esLibroDeTexto == true){
            libroDeTexto = "si";
        }
        return "Titulo: " + titulo +", autor: " + autor +", numero de paginas: " + numeroPaginas +", numero de referencia: " + numeroReferencia +", numero de veces prestado: " + vecesPrestado +", es libro de texto: " + libroDeTexto;
    }    
}
