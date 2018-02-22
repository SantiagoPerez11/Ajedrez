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
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego ajedrez = new Juego();
        Tablero tablero = new Tablero();
        ajedrez.inicializar(tablero);
    }
    
}
