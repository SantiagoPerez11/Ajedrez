
package ajedrez;

public class Torre extends Pieza{

    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'P' y valor 10.
     */
    public Torre() {
        color = 'N';
        nombre = 'T';
        valor = 5;
    }

    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Torre(char color) {
        super(color);
        nombre = 'T';
        valor = 5;
    }

    /**
     * La torre puede moverse hacia delante y hacia atrás tantos lugares como
     * desee siempre y cuando no haya alguna pieza en medio, al igual que hacia
     * los lados.
     * No puede saltar otras piezas.
     * @param movimiento - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no.
     */
    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movHorizontal() || movimiento.movVertical())
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
        return "|T|";
    }   
}

