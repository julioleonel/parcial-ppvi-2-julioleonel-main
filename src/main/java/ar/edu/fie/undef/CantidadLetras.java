package ar.edu.fie.undef;

/*
 Por Cantidad de Letras: Se construye especificando una letra de interés y el umbral.
 Una palabra será considerada de interés si la letra seleccionada aparece más veces de lo indicado por el umbral.
 */
public class CantidadLetras implements Metodo {

    //Atributos
    private char letra;
    private int umbral;

    //Constructor
    public CantidadLetras(char letra, int umbral) {
        this.letra = letra;
        this.umbral = umbral;
    }

    @Override
    public boolean interes(String palabra, int threshold) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador > umbral;
    }

}