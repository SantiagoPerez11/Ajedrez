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
public class Dama extends Pieza{
  
    public Dama() {
        color = 'N';
        nombre = 'D';
        valor = 10;
    }

    public Dama(char color) {
        super(color);
        nombre = 'D';
        valor = 10;
    }
    
    @Override
    public String toString(){
        return "[D]";
    }

    @Override
    public boolean puedeMover(Movimiento movimiento, Tablero tablero) {
        boolean puedeMover = false;
        if(movimiento.movHorizontal() || movimiento.movVertical() || movimiento.movDiagonal())
            puedeMover = true;
        return puedeMover;
    }
    //Sin cambios
}
