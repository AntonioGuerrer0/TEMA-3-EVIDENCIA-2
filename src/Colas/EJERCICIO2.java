
package Colas;

import java.util.LinkedList;
import java.util.Queue;


public class EJERCICIO2 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        agregarElemento(cola, "Hola");
        agregarElemento(cola, "Como");
        agregarElemento(cola, "estas");

        buscarElemento(cola, "estas");
        buscarElemento(cola, "bien");
    }

    public static void agregarElemento(Queue<String> cola, String elemento) {
        cola.add(elemento);
        System.out.println("Elemento \"" + elemento + "\" agregado a la cola.");
    }

    public static void buscarElemento(Queue<String> cola, String elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento \"" + elemento + "\" encontrado en la cola.");
        } else {
            System.out.println("Elemento \"" + elemento + "\" no se encuentra en la cola.");
        }
    }
}