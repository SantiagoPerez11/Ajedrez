package ajedrez;
/**
 * Creación y funcionamiento del tablero.
 */
public class Tablero {

    /**
     * Atributos de la clase Tablero.
     */
    protected boolean hayPieza;
    public Pieza[][] tablero = new Pieza[8][8];

    /**
     * Constructor del tablero por defecto. Inicializa todas las posiciones del
     * array con piezas y las ordena según su color (arriba negras y abajo blancas)
     * El resto de huecos quedarán vacíos.
     */
    public Tablero() {
        tablero[0][0] = new Torre();
        tablero[0][7] = new Torre();
        tablero[7][0] = new Torre('B');
        tablero[7][7] = new Torre('B');
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon();
            tablero[6][i] = new Peon('B');
        }
        tablero[0][2] = new Alfil();
        tablero[0][5] = new Alfil();
        tablero[7][2] = new Alfil('B');
        tablero[7][5] = new Alfil('B');
        tablero[0][1] = new Caballo();
        tablero[0][6] = new Caballo();
        tablero[7][1] = new Caballo('B');
        tablero[7][6] = new Caballo('B');
        tablero[0][3] = new Rey();
        tablero[7][4] = new Rey('B');
        tablero[0][4] = new Dama();
        tablero[7][3] = new Dama('B');

    }

    /**
     * hayPieza indica si el lugar que le estamos indicando está ocupado por una
     * pieza o no.
     * @param fila valor numerico de la fila que queremos comprobar
     * @param columna valor numerico de la columna que queremos comprobar
     * @return true si hay pieza, false si no hay.
     */
    public boolean hayPieza(int fila, int columna) {
        hayPieza = true;
        if (tablero[fila][columna] == null) {
            hayPieza = false;
        }
        return hayPieza;
    }

    /**
     * hayPieza indica si el lugar que le estamos indicando está ocupado por una
     * pieza o no.
     * @param pos de tipo Posicion, compuesto por fila y columna.
     * @return si hay pieza devuelve true, si no, false.
     */
    public boolean hayPieza(Posicion pos) {
        hayPieza = true;
        if (tablero[pos.getFila()][pos.getColumna()] == null) {
            hayPieza = false;
        }
        return hayPieza;
    }

    /**
     * Este método se encarga de hacer el recorrido por el tablero comprobando
     * si en las casillas que hay entre posicion inicial y posicion final comprobando
     * si hay alguna pieza que interrumpa el movimiento de nuestra pieza.
     * @param mov de tipo movimiento, es el movimiento a comprobar.
     * @return true si se encuentra alguna pieza en medio, false si el camino
     * está despejado.
     */
    public boolean hayPiezasEntre(Movimiento mov) {
        boolean hayP = false;
        if (buscarPieza(mov.getPosInicial().getFila(), mov.getPosInicial().getColumna()).getNombre() == 'C') {
            hayP = false;
        } else if (mov.movHorizontal()) {
            for (int i = mov.getPosInicial().getColumna() + 1; i < mov.getPosFinal().getColumna(); i++) {
                if (hayPieza(mov.getPosInicial().getFila(), i)) {
                    hayP = true;
                }
            }
            for (int i = mov.getPosFinal().getColumna() + 1; i < mov.getPosInicial().getColumna(); i++) {
                if (hayPieza(mov.getPosFinal().getFila(), i)) {
                    hayP = true;
                }
            }

        } else if (mov.movVertical()) {
            for (int i = mov.getPosInicial().getFila() + 1; i < mov.getPosFinal().getFila(); i++) {
                if (hayPieza(i, mov.getPosInicial().getColumna())) {
                    hayP = true;
                }
            }
            for (int i = mov.getPosFinal().getFila() + 1; i < mov.getPosInicial().getFila(); i++) {
                if(hayPieza(i, mov.getPosFinal().getColumna()))
                    hayP = true;
            }
      }
        
        else if(mov.movDiagonal()){
            for (int i = mov.getPosInicial().getFila() - 1, j = mov.getPosInicial().getColumna() + 1; i > mov.getPosFinal().getFila() && j < mov.getPosFinal().getColumna() && hayP == false; i--, j++) {
                if(hayPieza(i, j))
                    hayP = true;
            }
            
            for (int i = mov.getPosInicial().getFila() - 1, j = mov.getPosInicial().getColumna() - 1; i > mov.getPosFinal().getFila() && j > mov.getPosFinal().getColumna() && hayP == false; i--, j--) {
                if(hayPieza(i, j))
                    hayP = true;
            }
            
            for (int i = mov.getPosInicial().getFila() + 1, j = mov.getPosInicial().getColumna() + 1; i < mov.getPosFinal().getFila() && j < mov.getPosFinal().getColumna() && hayP == false; i++, j++) {
                if(hayPieza(i, j))
                    hayP = true;
            }
            
            for (int i = mov.getPosInicial().getFila() + 1, j = mov.getPosInicial().getColumna() - 1; i < mov.getPosFinal().getFila() && j > mov.getPosFinal().getColumna() && hayP == false; i--, j--) {
                if(hayPieza(i, j))
                    hayP = true;
            }
            
        }

        return hayP;
    }

    /**
     * Este método se encarga de poner una pieza en el lugar que le indiquemos.
     * @param pieza a introducir.
     * @param pos posicion en la que se va a introducir.
     */
    public void ponerPieza(Pieza pieza, Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = pieza;
    }

    /**
     * Este método se encarga de borrar una pieza del lugar que le indiquemos.
     * @param pos posicion en la que se va a eliminar la pieza.
     */
    public void quitarPieza(Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = null;
    }

    /**
     * Método encargado de buscar una pieza en la fila y columna que le indiquemos.
     * @param fila valor numérico de la fila que queremos observar.
     * @param columna valor numérico de la columna que queremos observar.
     * @return devuelve la pieza que haya en dicha fila y columna.
     */
    public Pieza buscarPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    /**
     * Este método se encarga de hacer el intercambio de posición de una pieza
     * una vez se ha comprobado que el movimiento se puede realizar. En caso de 
     * no haber ninguna pieza en el destino final, se sobreescribe el valor "null"
     * de dicha casilla. Si hay una pieza en el destino final, esa pieza habrá sido
     * comida en el proceso y será eliminada de la partida.
     * @param mov movimiento a realizar.
     * @return en el caso de ser true significará que el intercambio ha sido
     * realizado correctamente.
     */
    public boolean moverJuego(Movimiento mov) {
        boolean moverJuego = false;
        if (buscarPieza(mov.getPosInicial().getFila(), mov.getPosInicial().getColumna()).puedeMover(mov, this) == true && hayPiezasEntre(mov) == false) {
            Pieza aux = tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
            quitarPieza(mov.getPosInicial());
            ponerPieza(aux, mov.getPosFinal());
            moverJuego = true;
        }
        return moverJuego;
    }

    /**
     * Este método no se utiliza durante la ejecución del programa.
     * @return devuelve null.
     */
    @Override
    public String toString() {
        return null;
    }
}
