
package ajedrez;

public class Rey extends Pieza{

    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'P' y valor 10.
     */
    public Rey() {
        color = 'N';
        nombre = 'R';
        valor = 58;
    }

    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Rey(char color) {
        super(color);
        nombre = 'R';
        valor = 58;
    }
    
    /**
     * El rey puede moverse hacia todas las direcciones pero solamente de uno
     * en uno. Es decir, su salto nunca puede ser mayor a uno.
     * No puede saltar otras piezas.
     * @param movimiento - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no.
     */
    @Override
    public boolean puedeMover(Movimiento mov, Tablero tablero) {
        boolean puedeMover = false;
        if(mov.movHorizontal() || mov.movVertical() || mov.movDiagonal()){
            if(Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 && Math.abs(mov.saltoVertical()) == 1)
                puedeMover = true;
        }
        return puedeMover;
    }
    
    /**
     * Este método no es necesario, ni se utiliza durante la ejecución del 
     * programa. En caso de ser llamado, mostrará el nombre de la pieza.
     * @return nombre de la pieza entre barras para definirlo como una pieza.
     */
    @Override
    public String toString(){
        return "|R|";
    }
    
}
