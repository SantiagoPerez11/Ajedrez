package ajedrez;
/**
 * Métodos para controlar la posición de las piezas.
 */
public class Posicion {
    /**
     * Atributos de la clase Posicion, fila y columna.
     */
    protected int fila;
    protected int columna;

    /**
     * Constructor por defecto de Posicion.
     */
    public Posicion() {
    }
    
    /**
     * Constructor de posicion en el que tendremos que introducir la fila y la 
     * columna
     * @param fila valor numerico del primer punto de la posicion
     * @param columna valor numerico del segundo punto de la posicion
     */
    public Posicion(int fila, int columna) {
        this.columna = columna;
        this.fila = fila;
    }
    
    /**
     * Devuelve el valor del atributo fila.
     * @return devuelve el valor numérico de fila.
     */
    public int getFila() {
        return fila;
    }

    /**
     * Cambia el valor del atributo fila.
     * @param fila valor numérico.
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Devuelve el valor del atributo columna.
     * @return devuelve el valor numérico de columna.
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Cambia el valor del atributo columna.
     * @param columna valor numérico.
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    /**
     * Este método no es necesario ni se usa durante la ejecución del programa.
     * @return - devuelve el valor de la fila y el valor de la columna.
     */
    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
}
