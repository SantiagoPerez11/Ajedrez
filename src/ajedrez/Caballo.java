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
public class Caballo extends Pieza{
    
    final int valor = 3;
    
    public int getValor() {
        return valor;
    }

    public Caballo() {
        nombre = 'C';
        color = 'N';
    }

    public Caballo(char color) {
        super(color);
        nombre = 'C';
    }
    
    @Override
    public String toString(){
        return "[C]";
    }

    @Override
    public boolean puedeMover(Movimiento mov, Tablero tablero) {
        boolean puedeMover = false;
        if(Math.abs(mov.saltoVertical()) == 2 && Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoVertical()) == 1 && Math.abs(mov.saltoHorizontal()) == 2)
            puedeMover = true;
        return puedeMover;
    }
}
