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
public class Rey extends Pieza{

    public Rey() {
        color = 'N';
    }

    public Rey(char color) {
        super(color);
    }
    
    @Override
    public String toString(){
        return "[R]";
    }
    
    @Override
    public boolean puedeMover(Movimiento mov) {
        boolean puedeMover = false;
        if(mov.movHorizontal() || mov.movVertical() || mov.movDiagonal()){
            if(Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoDiagonal()) == 1)
                puedeMover = true;
        }
        return puedeMover;
    }
    
}
