package ar.edu.fie.undef;

/*
- Longitud de Caracteres: Se construye utilizando únicamente un umbral.
Una palabra será clasificada como de interés si su longitud supera el umbral establecido.
 */

public class LongCaracteres implements Metodo {

    // atributos
    private int umbral; //para que quiere este umbral? acaso no es un atributo del detector?

    // Constructor
    public LongCaracteres(int umbral) {
        this.umbral = umbral;
    }


    @Override
    public boolean interes(String palabra, int threshold) { //cual es el sentido de recibir el threshold si no lo utiliza?
        return palabra.length() > umbral;
    }
}

