package ajedrez;

/**
 * Métodos con los que se ejecuta el juego.
 */
import java.util.Scanner;

/**
 * Dentro de esta clase inicializamos todo el juego y establecemos los turnos.
 */
public class Juego {

    /**
     * El juego comienza con las piezas de color blanco. El turno se decide
     * mediante el resto de dividir turno entre dos, si el resto da 0 el turno
     * es de las piezas negras, mientras que si el resto da 1, el turno es de
     * las piezas blancas.
     */
    protected int turno = 1;

    /**
     * Este es el constructor del juego. Siempre comenzará con las piezas de
     * color blanco.
     */
    public Juego() {

    }

    /**
     * getTurno nos permite saber el turno en el que nos encontramos.
     *
     * @return número entero.
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Permite cambiar el turno en el que nos encontramos.
     *
     * @param turno número entero con el que sustituimos el turno existente por
     * el turno nuevo.
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * Este método es el encargado de iniciar la partida y de terminarla. Se
     * encarga de llamar a un método, y, cuando este finaliza, llama al
     * siguiente.
     *
     * @param tablero tablero que se utiliza para la partida.
     */
    public void inicializar(Tablero tablero) {
        System.out.println("¡EMPIEZA EL JUEGO!");
        System.out.println();
        pintar(tablero);
        jugada(tablero);
        puntuacion(tablero);
    }

    /**
     * Este método se encarga de dibujar en pantalla el tablero en el que
     * estamos jugando. Las piezas son identificadas a través del nombre de su
     * clase (cogemos solamente el primer carácter) y de su color. También se
     * encarga de poner los números a los laterales y las letras en la parte
     * baja de la pantalla para que el usuario sepa qué movimiento está
     * realizando.
     *
     * @param tablero - tablero en el que estamos jugando.
     */
    public void pintar(Tablero tablero) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 8; j++) {
                if (tablero.tablero[i][j] != null) {
                    System.out.print("|");
                    System.out.print(tablero.tablero[i][j].getClass().getSimpleName().charAt(0));
                    System.out.print(".");
                    System.out.print(tablero.tablero[i][j].getColor());
                    System.out.print("|");
                } else {
                    System.out.print("|   |");
                }
            }
            System.out.printf("\n");
        }
        System.out.println("  — — — — — — — — — — — — — — — —");
        char letra = 'A';
        System.out.print("    " + (char) (letra) + "  " + "  " + (char) (letra + 1) + "  " + "  " + (char) (letra + 2) + "  " + "  " + (char) (letra + 3) + "  " + "  " + (char) (letra + 4) + "  " + "  " + (char) (letra + 5) + "  " + "  " + (char) (letra + 6) + "  " + "  " + (char) (letra + 7) + "  \n");
    }

    /**
     * El método jugada se encarga de dirigir los turnos y quién juega en cada
     * uno de ellos. Además, pide el movimiento al usuario y se encarga de
     * comprobar todas las posibilidades de fallo para asegurar que el
     * movimiento introducido es correcto. Cada jugador dispone de 50
     * movimientos, es decir, 100 en total. Una vez llegamos al movimiento 50 de
     * cada jugador, el método habrá terminado su tarea.
     *
     * @param tablero - tablero sobre el que se realizará la jugada introducida
     * en cada uno de los turnos.
     * @return devuelve el movimiento introducido por el usuario una vez que se
     * ha comprobado que es válido.
     */
    public Movimiento jugada(Tablero tablero) {
        Scanner lector = new Scanner(System.in);
        Movimiento mov = new Movimiento();
        String introduccion = new String();
        do {
            if (turno < 99) {
                System.out.println("Turno número " + turno + ". Juegan: " + this.toString());
            } else {
                System.out.println("¡Último movimiento de " + this.toString() + "!");
            }

            System.out.println("Introduce tu jugada.");
            introduccion = lector.nextLine().toUpperCase();

            if (introduccion.length() != 4) {
                System.out.println("Jugada inválida. Introduce otra.");
            } else {
                mov.setPosInicial(introduccion.charAt(1) - 49, introduccion.charAt(0) - 65);
                mov.setPosFinal(introduccion.charAt(3) - 49, introduccion.charAt(2) - 65);

                if (introduccion.charAt(0) < 'A' || introduccion.charAt(0) > 'H' || introduccion.charAt(2) < 'A' || introduccion.charAt(2) > 'H') {
                    System.out.println("Has introducido una letra fuera de los límites del tablero. Introduce otra vez la jugada.");
                } else if (introduccion.charAt(1) < '1' || introduccion.charAt(1) > '8' || introduccion.charAt(3) < '1' || introduccion.charAt(3) > '8') {
                    System.out.println("Has introducido un número fuera de los límites del tablero. Introduce otra vez la jugada.");
                } else if (tablero.hayPieza((int) introduccion.charAt(1) - 49, (int) introduccion.charAt(0) - 65) == false) {
                    System.out.println("En esa casilla no hay ninguna pieza. Introduce otra jugada.");
                } else if (tablero.buscarPieza((int) introduccion.charAt(1) - 49, (int) introduccion.charAt(0) - 65).getColor() != this.toString().toUpperCase().charAt(0)) {
                    System.out.println("No es el turno de ese color. Introduce un movimiento válido.");
                } else if (tablero.hayPieza(introduccion.charAt(3) - 49, introduccion.charAt(2) - 65) == true && tablero.tablero[introduccion.charAt(3) - 49][introduccion.charAt(2) - 65].color == tablero.tablero[introduccion.charAt(1) - 49][introduccion.charAt(0) - 65].color) {
                    System.out.println("Hay una pieza de tu color en esa casilla. Introduce otro movimiento");
                } else if (tablero.tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()].puedeMover(mov, tablero) == false) {
                    System.out.println("La pieza no puede moverse hacia esa posición");
                } else if (tablero.hayPiezasEntre(mov)) {
                    System.out.println("No puedes saltar otras piezas con esa pieza.");
                } else {
                    tablero.moverJuego(mov);
                    pintar(tablero);
                    turno++;
                }
            }

        } while (turno < 101);
        return mov;
    }

    /**
     * Este método se encarga de asignar la puntuación al finalizar la partida.
     * También dice quién ha sido el ganador en base al recuento del valor de
     * las piezas que queden sobre el tablero de cada color. En caso de empate
     * nadie será el ganador, y así lo anunciará.
     *
     * @param tablero tablero que se utiliza para el recuento de piezas
     * restantes y sumar la puntuación de las piezas que queden de cada color.
     */
    public void puntuacion(Tablero tablero) {
        int blanco = 0;
        int negro = 0;

        for (int i = 0; i < tablero.tablero.length; i++) {
            for (int j = 0; j < tablero.tablero.length; j++) {
                if (tablero.buscarPieza(i, j) != null && tablero.buscarPieza(i, j).getColor() == 'B') {
                    blanco += tablero.buscarPieza(i, j).getValor();
                } else if (tablero.buscarPieza(i, j) != null) {
                    negro += tablero.buscarPieza(i, j).getValor();
                }
            }
        }
        if (blanco > negro) {
            System.out.print("¡El ganador es: el jugador blanco con: " + blanco + " puntos! \n");
        } else if (negro > blanco) {
            System.out.print("¡El ganador es: el jugador negro con: " + negro + " puntos! \n");
        } else {
            System.out.println("¡EMPATE! ¡BIEN JUGADO!");
        }

        System.out.println("Puntuación final: \nEl jugador negro ha terminado con: " + negro + " puntos. \nEl jugador blanco ha terminado con: " + blanco + " puntos.");
    }

    /**
     * Este método se encarga de asignar un valor diferente en base al resto de
     * dividir el turno actual entre dos. El valor por defecto es "negras", pero
     * ya que el juego comienza en el turno 1 directamente y en el ajedrez
     * empiezan las blancas, si el resultado de la operación es 1, el valor
     * cambiará a "blancas". De esta forma conseguimos que el método jugada sepa
     * quién tiene que jugar en cada momento.
     *
     * @return devuelve el string con el color del usuario al que le toque jugar
     * en ese turno.
     */
    @Override
    public String toString() {
        String color = "negras";
        if (turno % 2 == 1) {
            color = "blancas";
        }
        return color;
    }
}
