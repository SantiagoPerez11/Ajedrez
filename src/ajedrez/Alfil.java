
package ajedrez;
/**
 * Alfil hereda de la clase Pieza
 */
public class Alfil extends Pieza{
    
    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'A' y valor 4
     */
    public Alfil() {
        color = 'N';
        nombre = 'A';
        valor = 4;
    }

    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Alfil(char color) {
        super(color);
        nombre = 'A';
        valor = 4;
    }

    /**
     * El alfil se moverá únicamente cuando el movimiento introducido sea
     * diagonal y no haya otra pieza en el camino.
     * No puede saltar otras piezas.
     * @param movimiento - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no.
     */
    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movDiagonal())
            puedeMover = true;
        return puedeMover;
    }
    
    /**
     * Este método no es necesario, ni se utiliza durante la ejecución del 
     * programa. En caso de ser llamado, mostrará el nombre de la pieza.
     * @return nombre de la pieza entre barras para definirlo como una pieza.
     */
    @Override
    public String toString(){
        return "|A|";
    }
}
