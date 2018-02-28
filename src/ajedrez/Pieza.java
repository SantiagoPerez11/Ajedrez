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
public abstract class Pieza {
    protected char color;
    protected char nombre;
    protected int valor;

    public Pieza() {
        
    }
    
    public Pieza(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }
    
    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public abstract boolean puedeMover(Movimiento movimiento, Tablero tablero);
}
