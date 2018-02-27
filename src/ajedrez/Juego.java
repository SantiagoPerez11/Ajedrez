/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Juego {

    protected int turno = 1; //0 Negras 1 Blancas

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void inicializar(Tablero tablero) {
        System.out.println("¡EMPIEZA EL JUEGO!");
        System.out.println();
        pintar(tablero);
        jugada(tablero);
    }

    public void pintar(Tablero tablero) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 8; j++) {
                if (tablero.tablero[i][j] != null) {
                    System.out.print("[");
                    System.out.print(tablero.tablero[i][j].getClass().getSimpleName().charAt(0));
                    System.out.print(".");
                    System.out.print(tablero.tablero[i][j].getColor());
                    System.out.print("]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.printf("\n");
        }
        System.out.println("    — — — — — — — — — — — — — — — —");
        char letra = 'A';
        System.out.print("      " + (char) (letra) + "  " + "  " + (char) (letra + 1) + "  " + "  " + (char) (letra + 2) + "  " + "  " + (char) (letra + 3) + "  " + "  " + (char) (letra + 4) + "  " + "  " + (char) (letra + 5) + "  " + "  " + (char) (letra + 6) + "  " + "  " + (char) (letra + 7) + "  \n");
    }

    public Movimiento jugada(Tablero tablero) {
        Scanner lector = new Scanner(System.in);
        Movimiento mov = new Movimiento();
        String introduccion = new String();
        do {
            if (turno < 98) {
                System.out.println("Turno " + turno + ". " + this.toString());
            } else {
                System.out.println("Último movimiento de: " + this.toString());
            }
            System.out.println("Introduce tu jugada.");
            introduccion = lector.nextLine().toUpperCase();
            mov.setPosInicial(introduccion.charAt(0)-65, introduccion.charAt(1)-49);
            mov.setPosFinal(introduccion.charAt(2)-65, introduccion.charAt(3)-49);
                    
            tablero.moverJuego(mov);
            
            if (introduccion.length() != 4) {
                System.out.println("Jugada inválida. Introduce otra.");
            } else if (tablero.tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()].getColor() != this.toString().toUpperCase().charAt(7)){
                System.out.println("Mueve una pieza de tu color.");
            }        
            else {
                pintar(tablero);
                turno++;
            }
        } while (turno <= 99);
        return mov;
    }

    @Override
    public String toString() {
        String color = "negras";
        if (turno % 2 == 1) {
            color = "blancas";
        }
        return "Juegan " + color;
    }
}
