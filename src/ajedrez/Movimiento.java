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
        return false;
    }
    
    public int saltoHorizontal(){
        return 800;
    }
    
    public int saltoVertical(){
        return 2;
    }
    
    public boolean movValido(){
        return true;
    }
    
}
