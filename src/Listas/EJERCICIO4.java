
package Listas;

import java.util.ArrayList;
import java.util.List;


public class EJERCICIO4 {

    
    public static void main(String[] args) {
        List<Character> lista = new ArrayList<>();

        agregarElemento(lista, 'J');
        agregarElemento(lista, 'A');
        agregarElemento(lista, 'L');

        buscarElemento(lista, 'L');
        buscarElemento(lista, 'T');
    }

    public static void agregarElemento(List<Character> lista, char elemento) {
        lista.add(elemento);
        System.out.println("Elemento '" + elemento + "' agregado a la lista.");
    }

    public static void buscarElemento(List<Character> lista, char elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento '" + elemento + "' encontrado en la lista.");
        } else {
            System.out.println("Elemento '" + elemento + "' no se encuentra en la lista.");
        }
    }
}