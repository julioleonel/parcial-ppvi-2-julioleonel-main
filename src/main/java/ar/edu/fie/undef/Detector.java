package ar.edu.fie.undef;

/*
Se requiere la implementación de una clase denominada Detector con dos atributos principales:
 uno asociado a un umbral (threshold) y otro que referencia
al método de detección a utilizar.
 */
public class Detector {

    //Atributos
    private int threshold; //faltaría un setter para modificarlo en tiempo de ejecución
    private Metodo metodo;

    //Constructor
    public Detector(int threshold, Metodo metodo) {
        this.threshold = threshold;
        this.metodo = metodo;
    }

    //Setter para el acceso dinamico.
    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }


    //Método para detectar si una palabra es de interés o no. obtenemos verdadero o falso
    public boolean detectar(String palabra) {
        return metodo.interes(palabra, threshold);
    }
}
