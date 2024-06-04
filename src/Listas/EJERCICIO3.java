
package Listas;

import java.util.ArrayList;
import java.util.List;


public class EJERCICIO3 {

     public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();

        agregarElemento(lista, 3.19);
        agregarElemento(lista, 2.81);
        agregarElemento(lista, 1.71);

        buscarElemento(lista, 1.71);
        buscarElemento(lista, 1.62);
    }

    public static void agregarElemento(List<Double> lista, double elemento) {
        lista.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la lista.");
    }

    public static void buscarElemento(List<Double> lista, double elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la lista.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
        }
    }
}