/**
 * Caballo hereda de la clase Pieza
 */
package ajedrez;

public class Caballo extends Pieza{

    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'C' y valor 3.
     */
    public Caballo() {
        color = 'N';
        nombre = 'C';
        valor = 3;
    }
    
    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Caballo(char color) {
        super(color);
        nombre = 'C';
        valor = 3;
    }
    
    /**
     * El movimiento del caballo se ve definido por 2 saltos horizontal y 1 salto vertical
     * o por 2 saltos vertical y 1 salto horizontal. El caballo es capaz de saltar
     * otras piezas, pero no de caer en la casilla ocupada por una pieza de su color.
     * @param mov - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no. 
     */
    @Override
    public boolean puedeMover(Movimiento mov, Tablero tablero) {
        boolean puedeMover = false;
        if(Math.abs(mov.saltoVertical()) == 2 && Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoVertical()) == 1 && Math.abs(mov.saltoHorizontal()) == 2)
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
        return "|C|";
    }
}
