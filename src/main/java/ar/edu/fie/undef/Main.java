package ar.edu.fie.undef;


public class Main {
    public static void main(String[] args) {

        // creo los objetos
        CantidadLetras cantidadLetras = new CantidadLetras('a', 1);
        LongCaracteres longCaracteres = new LongCaracteres(5);
        Detector detector = new Detector(2, cantidadLetras);

        // selecciono el metodo cantidad de letras
        detector.setMetodo(cantidadLetras);

        // pruebo el metodo detectar
        System.out.println(detector.detectar("hola")); // espero falso
        System.out.println(detector.detectar("antonela")); // espero verdadero

        // selecciono el metodo long caracteres
        detector.setMetodo(longCaracteres);

        // pruebo el metodo detectar
        System.out.println(detector.detectar("hola")); // espero falso
        System.out.println(detector.detectar("antonela")); // espero verdadero

        }
    }
