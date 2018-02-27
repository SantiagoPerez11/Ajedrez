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
public class Alfil extends Pieza{

    final int valor = 4;
    
    public int getValor() {
        return valor;
    }
    
    public Alfil() {
        color = 'N';
    }

    public Alfil(char color) {
        super(color);
    }
    
    @Override
    public String toString(){
        return "[A]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento) {
        boolean puedeMover = false;
        if(movimiento.movDiagonal())
            puedeMover = true;
        return puedeMover;
    }
    
}
