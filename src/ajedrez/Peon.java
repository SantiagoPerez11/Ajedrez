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
public class Peon extends Pieza {

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
    public String toString() {
        return "[P]";
    }

    @Override
    public boolean puedeMover(Movimiento mov) {
        boolean puedeMover = false;
        if (color == 'B' && mov.movVertical()) {
            if (mov.saltoVertical() == -1) {
                puedeMover = true;
            } else if (mov.saltoVertical() >= -2 && mov.saltoVertical() < 0 && mov.getPosInicial().getFila() == 6) {
                puedeMover = true;
            }
        }
        if (color == 'N' && mov.movVertical()) {
            if (mov.saltoVertical() == 1) {
                puedeMover = true;
            } else if (mov.saltoVertical() <= 2 && mov.saltoVertical() > 0 && mov.getPosInicial().getFila() == 1) {
                puedeMover = true;
            }
        }
        return puedeMover;
    }
}
