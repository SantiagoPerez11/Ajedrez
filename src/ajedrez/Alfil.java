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
    
    public Alfil() {
        color = 'N';
        nombre = 'A';
        valor = 4;
    }

    public Alfil(char color) {
        super(color);
        nombre = 'A';
        valor = 4;
    }
    
    @Override
    public String toString(){
        return "[A]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movDiagonal())
            puedeMover = true;
        return puedeMover;
    }
    //Sin Cambios
}
