/**
 * Clase abstracta de la que heredan las demás piezas.
 */

package ajedrez;

public abstract class Pieza {
    
    /**
     * Atributos que tendrán todas las piezas que hereden de esta clase.
     */
    protected char color;
    protected char nombre;
    protected int valor;

    /**
     * Constructor por defecto de una pieza. Por defecto tiene el color en negro.
     */
    public Pieza() {
        color = 'N';
    }
    
    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Pieza(char color) {
        this.color = color;
    }

    /**
     * Método utilizado para obtener el color de la pieza con la que estamos
     * trabajando.
     * @return - devuelve el caracter con el color de la pieza.
     */
    public char getColor() {
        return color;
    }
    
    /**
     * Método utilizado para obtener el nombre de la pieza con la que estamos
     * trabajando.
     * @return - devuelve el caracter con el nombre de la pieza.
     */
    public char getNombre() {
        return nombre;
    }

    /**
     * Método utilizado para definir el nombre de la pieza con la que estamos
     * trabajando.
     * @param nombre El nombre es un caracter.
     */
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método utilizado para obtener el valor de la pieza con la que estamos
     * trabajando.
     * @return - devuelve el int con el valor de la pieza.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Método utilizado para definir el valor de la pieza con la que estamos
     * trabajando.
     * @param valor El valor es un int.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Método por el que cada pieza según su clase determinará si el movimiento
     * al que está siendo sometida es válido o no.
     * @param movimiento movimiento introducido por el usuario y el cual queremos
     * averiguar si es válido o no.
     * @param tablero - tablero sobre el que se realizará dicho movimiento.
     * @return true si el movimiento es válido, false si no lo es.
     */
    public abstract boolean puedeMover(Movimiento movimiento, Tablero tablero);
    
    /**
     * Este método no es necesario, ni se utiliza durante la ejecución del 
     * programa. En caso de ser llamado, mostrará el nombre de la pieza y su
     * color.
     */
    @Override
    public String toString(){
        return "Pieza " + this.nombre + " color " + this.color;
    }
}
