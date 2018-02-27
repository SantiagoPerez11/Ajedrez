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
class Posicion {
    protected int fila;
    protected int columna;

    public Posicion() {
    }
    
    public Posicion(int columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }  

    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
}
