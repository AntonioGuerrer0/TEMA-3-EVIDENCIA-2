
package Listas;

import java.util.ArrayList;
import java.util.List;

public class EJERCICIO2 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        // Función para agregar elementos a la lista
        agregarElemento(lista, "Hola");
        agregarElemento(lista, "Mundo");
        agregarElemento(lista, "eyy");

        // Función para buscar elementos en la lista
        buscarElemento(lista, "eyy");
        buscarElemento(lista, "Adios");
    }

    public static void agregarElemento(List<String> lista, String elemento) {
        lista.add(elemento);
        System.out.println("Elemento \"" + elemento + "\" agregado a la lista.");
    }

    public static void buscarElemento(List<String> lista, String elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento \"" + elemento + "\" encontrado en la lista.");
        } else {
            System.out.println("Elemento \"" + elemento + "\" no se encuentra en la lista.");
        }
    }
}