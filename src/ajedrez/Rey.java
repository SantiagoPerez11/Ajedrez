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
        nombre = 'R';
        valor = 58;
    }

    public Rey(char color) {
        super(color);
        nombre = 'R';
        valor = 58;
    }
    
    @Override
    public String toString(){
        return "[R]";
    }
    
    @Override
    public boolean puedeMover(Movimiento mov, Tablero tablero) {
        boolean puedeMover = false;
        if(mov.movHorizontal() || mov.movVertical() || mov.movDiagonal()){
            if(Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoHorizontal()) == 1 && Math.abs(mov.saltoVertical()) == 1)
                puedeMover = true;
        }
        return puedeMover;
    }
    
}
