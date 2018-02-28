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

    public Torre() {
        color = 'N';
        nombre = 'T';
        valor = 5;
    }

    public Torre(char color) {
        super(color);
        nombre = 'T';
        valor = 5;
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

