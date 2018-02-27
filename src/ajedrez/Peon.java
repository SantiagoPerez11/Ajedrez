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
public class Peon extends Pieza{
    
    final int valor = 1;
    
    public int getValor() {
        return valor;
    }

    public Peon() {
        color = 'N';
    }
    
    public Peon(char color) {
        super(color);
    }
    
    @Override
    public String toString(){
        return "[P]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento) {
        boolean puedeMover = false;
        if(movimiento.movVertical() || movimiento.movDiagonal())
            puedeMover = true;
        return puedeMover;
    }
    
}
