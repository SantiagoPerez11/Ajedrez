package ajedrez;

/**
 * Métodos de configuración de movimiento.
 */
public class Movimiento {
    
    /**
     * Atributos de posicion inicial y posicion final de tipo posicion.
     */
    protected Posicion posInicial;
    protected Posicion posFinal;

    /**
     * Constructor por defecto para un movimiento.
     */
    public Movimiento() {
        
    }
    
    /**
     * Constructor de un movimiento en el que añadiremos la posición de inicio
     * y la posición de fin.
     * @param posInicial de tipo Posicion, es la posición inicial del movimiento.
     * @param posFinal de tipo Posicion, es la posición final del movimiento.
     */
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }
    
    /**
     * Con este método conocemos el contenido de la posición inicial.
     * @return - devuelve una posición, la inicial, de donde sale el movimiento.
     */
    public Posicion getPosInicial() {
        return posInicial;
    }

    /**
     * Con este método cambiamos el contenido de la posición inicial.
     * @param posInicial tipo int, valor numérico del primer parámetro introducido
     * por el usuario.
     * @param posInicial2 tipo int, valor numérico del segundo parámetro introducido
     * por el usuario.
     */
    public void setPosInicial(int posInicial, int posInicial2) {
        this.posInicial = new Posicion(posInicial, posInicial2);
    }

    /**
     * Con este método conocemos el contenido de la posición inicial.
     * @return - devuelve una posición, la final, donde acaba el movimiento.
     */
    public Posicion getPosFinal() {
        return posFinal;
    }

    /**
     * Con este método cambiamos el contenido de la posición final.
     * @param posFinal tipo int, valor numérico del primer parámetro introducido
     * por el usuario.
     * @param posFinal2 tipo int, valor numérico del segundo parámetro introducido
     * por el usuario.
     */
    public void setPosFinal(int posFinal, int posFinal2) {
        this.posFinal = new Posicion(posFinal, posFinal2);
    }
    
    /**
     * Nos indica si el movimiento introducido es vertical comparando las columnas
     * del inicio del movimiento y del final del movimiento. Si la columna es la misma,
     * el movimiento es vertical.
     * @return - devuelve true si el movimiento es vertical.
     */
    public boolean movVertical(){
        boolean esVertical = false;
        if(posInicial.getColumna() == posFinal.getColumna() && posInicial != posFinal){
            esVertical = true;
        }
        return esVertical;
    }
    
    /**
     * Nos indica si el movimiento introducido es horizontal comparando las filas
     * del inicio del movimiento y del final del movimiento. Si la fila es la misma,
     * el movimiento es horizontal.
     * @return - devuelve true si el movimiento es horizontal.
     */
    public boolean movHorizontal(){
        boolean esHorizontal = false;
        if(posInicial.getFila() == posFinal.getFila() && posInicial != posFinal){
            esHorizontal = true;
        }
        return esHorizontal;
    }
    
    /**
     * Indica si el movimiento es diagonal o no. Para esto, hace uso de los métodos
     * para calcular la cantidad de casillas en horizontal y vertical que se está
     * moviendo la pieza. Si ambos valores (absolutos) son iguales, el movimiento
     * será siempre diagonal.
     * @return devuelve true si el movimiento es diagonal.
     */
    public boolean movDiagonal(){
        boolean esDiagonal = false;
        if(Math.abs(saltoHorizontal()) == Math.abs(saltoVertical())){
            esDiagonal = true;
        }
        return esDiagonal;
    }
    
    /**
     * Resta al valor de la columna de la posición final el valor de la columna
     * de la posición inicial. El resultado es la cantidad de casillas que salta.
     * @return - devuelve un número (casillas que se van a saltar).
     */
    public int saltoHorizontal(){
        int saltoH;
        saltoH = posFinal.getColumna() - posInicial.getColumna();
        return saltoH;
    }
    
    /**
     * Resta al valor de la fila de la posición final el valor de la fila de la 
     * posición inicial. El resultado es la cantidad de casillas que salta.
     * @return - devuelve un número (casillas que se van a saltar).
     */
    public int saltoVertical(){
        int saltoV;
        saltoV = posFinal.getFila() - posInicial.getFila();
        return saltoV;
    }

    /**
     * Este método no es necesario, ni se utiliza durante la ejecución del 
     * programa. En caso de ser llamado, mostrará la posición inicial y la final.
     * @return devuelve el String
     */
    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }  
}
