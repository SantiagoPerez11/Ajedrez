
package ajedrez;


public class Peon extends Pieza {

    /**
     * Constructor por defecto para la pieza. Se inicializa por defecto como
     * negra, con nombre 'P' y valor 10.
     */
    public Peon() {
        color = 'N';
        nombre = 'P';
        valor = 1;
    }

    /**
     * Debemos introducir el parámetro color, en caso de que no sea negra la 
     * pieza. 
     * @param color para iniciar la pieza como color blanco debemos llamarlo 'B'
     * ya que es una variable tipo char y el programa utiliza las mayúsculas.
     */
    public Peon(char color) {
        super(color);
        nombre = 'P';
        valor = 1;
    }

    /**
     * El movimiento del peón se define de la siguiente manera:
     * Es capaz de moverse dos casillas hacia delante siempre y cuando no se 
     * haya movido anteriormente esa pieza.
     * Solo puede desplazarse de uno en uno, siempre hacia adelante, nunca hacia
     * los lados.
     * El peón es capaz de comer en diagonal siempre y cuando haya una pieza
     * en una de las dos casillas en diagonal (por delante de su posición).
     * No puede saltar otras piezas.
     * @param movimiento - movimiento que introduce el usuario.
     * @param tablero tablero no necesario, utilizar en caso de serlo.
     * @return devuelve true si la pieza puede moverse y false si no.
     */
    @Override
    public boolean puedeMover(Movimiento mov, Tablero tablero) {
        boolean puedeMover = false;
        
        if (color == 'B' && mov.movVertical()) {
            if (mov.saltoVertical() == -1) {
                puedeMover = true;
            } else if (mov.saltoVertical() >= -2 && mov.saltoVertical() < 0 && mov.getPosInicial().getFila() == 6) {
                puedeMover = true;
            }
        }
        
        if(color == 'B' && mov.saltoVertical() == -1 && Math.abs(mov.saltoHorizontal()) == 1){
            if(tablero.buscarPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) != null){
                puedeMover = true;
            }
        }
        
        if (color == 'N' && mov.movVertical()) {
            if (mov.saltoVertical() == 1) {
                puedeMover = true;
            } else if (mov.saltoVertical() <= 2 && mov.saltoVertical() > 0 && mov.getPosInicial().getFila() == 1) {
                puedeMover = true;
            }
        }
        
        if(color == 'N' && mov.saltoVertical() == 1 && Math.abs(mov.saltoHorizontal()) == 1){
            if(tablero.buscarPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) != null){
                puedeMover = true;
            }
        }
        
        if(mov.movVertical() == true && tablero.hayPieza(mov.posFinal) == true){
            puedeMover = false;
        }
            
        return puedeMover;
    }
    
    /**
     * Este método no es necesario, ni se utiliza durante la ejecución del 
     * programa. En caso de ser llamado, mostrará el nombre de la pieza.
     * @return nombre de la pieza entre barras para definirlo como una pieza.
     */
    @Override
    public String toString() {
        return "|P|";
    }
}
