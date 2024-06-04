
package Listas;

import java.util.ArrayList;
import java.util.List;


public class EJERCICIO1 {

   
      public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        agregarElemento(lista, 15);
        agregarElemento(lista, 5);
        agregarElemento(lista, 25);

        buscarElemento(lista, 5);
        buscarElemento(lista, 20);
    }

    public static void agregarElemento(List<Integer> lista, int elemento) {
        lista.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la lista.");
    }

    public static void buscarElemento(List<Integer> lista, int elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la lista.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
        }
    }
}