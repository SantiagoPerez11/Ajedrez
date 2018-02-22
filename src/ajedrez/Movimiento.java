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
    private Posicion posInicial;
    private Posicion posFinal;

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

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }
    
    //
    
    public boolean movVertical(){
        return false;
    }
    
    public boolean movHorizontal(){
        return false;
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
    
}
