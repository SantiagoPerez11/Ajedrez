package ajedrez;
/**
 * Dama hereda de la clase Pieza
 */
public class Dama extends Pieza{
  
    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'D' y valor 10.
     */
    public Dama() {
        color = 'N';
        nombre = 'D';
        valor = 10;
    }

    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Dama(char color) {
        super(color);
        nombre = 'D';
        valor = 10;
    }

    /**
     * La dama puede moverse siempre hacia todas direcciones en caso de que
     * ninguna pieza esté por el camino.
     * No puede saltar otras piezas.
     * @param movimiento - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no. 
     */
    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movHorizontal() || movimiento.movVertical() || movimiento.movDiagonal())
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
        return "|D|";
    }
}
