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
public class Torre extends Pieza{
    
    final int valor = 5;
    
    public int getValor() {
        return valor;
    }

    public Torre() {
        color = 'N';
    }

    public Torre(char color) {
        super(color);
    }
    
    @Override
    public String toString(){
        return "[T]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movHorizontal() || movimiento.movVertical())
            puedeMover = true;
        return puedeMover;
    }
    
}

