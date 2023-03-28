package Practica01;

import EJERCICIO2.PERSONA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Libro libro1 = new Literarios("El Juan", "1452A", "gore", "Juan") {

        };
        Libro libro2 = new Consulta("Don Quijote", "145BA", "romance", "Juan") {

        };
        Libro libro3 = new Texto("FullMetal", "142D", "asesinato", "Juan") {

        };
        Libro libro4 = new Texto("Biblia", "143C", "canivalismo", "Juan") {

        };
        Libro libro5 = new Consulta("Sql", "1452B", "asesinos", "Juan") {

        };

        List<Libro> listaLibro = Arrays.asList(libro1,libro2,libro3,libro4,libro5);


        System.out.println(listaLibro);

    }

}
