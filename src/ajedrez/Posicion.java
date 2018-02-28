
package ajedrez;

class Posicion {
    protected int fila;
    protected int columna;

    public Posicion() {
    }
    
    public Posicion(int fila, int columna) {
        this.columna = columna;
        this.fila = fila;
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
    
    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
}
