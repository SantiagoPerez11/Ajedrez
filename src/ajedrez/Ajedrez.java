
package ajedrez;
/**
 * main class donde se ejecuta el juego.
 */
public class Ajedrez {

    /**
     * @param args. Aquí es donde lanzamos el inicio del juego y le explicamos
     * al usuario el uso del ajedrez (cómo introducir los movimientos).
     */
    public static void main(String[] args) {
        Juego ajedrez = new Juego();
        Tablero tablero = new Tablero();
        System.out.println("¡Bienvenido al ajedrez! \nPara introducir un "
                + "movimiento solo tienes que introducirlo de la siguiente forma:\n"
                + "'a1a2', donde 'a1' sería la pieza que vas a mover y 'a2' "
                + "sería su posición final. \n¡Buena suerte a ambos jugadores!");
        ajedrez.inicializar(tablero);
    }
    
}
