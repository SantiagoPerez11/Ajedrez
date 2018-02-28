/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author santy
 */
public class Tablero {

    protected boolean hayPieza;
    public Pieza[][] tablero = new Pieza[8][8];

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

    public Pieza[][] getTablero() {
        return tablero;
    }

    public void setTablero(Pieza[][] tablero) {
        this.tablero = tablero;
    }

    public boolean hayPieza(int fila, int columna) {
        hayPieza = true;
        if (tablero[fila][columna] == null) {
            hayPieza = false;
        }
        return hayPieza;
    }

    public boolean hayPieza(Posicion pos) {
        hayPieza = true;
        if (tablero[pos.getFila()][pos.getColumna()] == null) {
            hayPieza = false;
        }
        return hayPieza;
    }

    public boolean hayPiezasEntre(Movimiento mov) {
        boolean hayPiezasEntre = false;
        return hayPiezasEntre;
    }

    public void ponerPieza(Pieza pieza, Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = pieza;
    }

    public void quitarPieza(Posicion pos) {
        tablero[pos.getFila()][pos.getColumna()] = null;
    }

    public Pieza buscarPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public boolean moverJuego(Movimiento mov) {
        boolean moverJuego = false;
        if ( buscarPieza(mov.getPosInicial().getFila(), mov.getPosInicial().getColumna()).puedeMover(mov, this) == true && hayPiezasEntre(mov) == false) {
            Pieza aux = tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
            quitarPieza(mov.getPosInicial());
            ponerPieza(aux, mov.getPosFinal());
            moverJuego = true;
        }
        return moverJuego;
    }
    
//    public boolean movValido(Tablero tablero, Movimiento mov){
//        boolean movValido = false;
//        if(tablero.buscarPieza(0, 0)){
//            movValido = true;
//        }
//        return movValido;
//    }
    
    @Override
    public String toString() {
        return null;
    }
}
