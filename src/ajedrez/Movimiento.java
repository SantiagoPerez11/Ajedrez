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
class Movimiento {
    protected Posicion posInicial;
    protected Posicion posFinal;

    //
    
    public Movimiento() {
        
    }
    
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }
    
    //
    
    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(int posInicial, int posInicial2) {
        this.posInicial = new Posicion(posInicial, posInicial2);
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(int posFinal, int posFinal2) {
        this.posFinal = new Posicion(posFinal, posFinal2);
    }
    
    //
    
    public boolean movVertical(){
        boolean esVertical = false;
        if(posInicial.getColumna() == posFinal.getColumna() && posInicial != posFinal){
            esVertical = true;
        }
        return esVertical;
    }
    
    public boolean movHorizontal(){
        boolean esHorizontal = false;
        if(posInicial.getFila() == posFinal.getFila() && posInicial != posFinal){
            esHorizontal = true;
        }
        return esHorizontal;
    }
    
    public boolean movDiagonal(){
        boolean esDiagonal = false;
        if(Math.abs(saltoHorizontal()) == Math.abs(saltoVertical())){
            esDiagonal = true;
        }
        return esDiagonal;
    }
    
    public int saltoHorizontal(){
        int saltoH;
        saltoH = posFinal.getColumna() - posInicial.getColumna();
        return saltoH;
    }
    
    public int saltoVertical(){
        int saltoV;
        saltoV = posFinal.getFila() - posInicial.getFila();
        return saltoV;
    }
    
    public boolean movValido(){
        boolean movValido = true;
        return movValido;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }
    
}
