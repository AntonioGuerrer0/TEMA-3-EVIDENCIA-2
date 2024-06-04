
package Colas;

import java.util.LinkedList;
import java.util.Queue;
public class EJERCICIO3 {


    public static void main(String[] args) {
        Queue<Double> cola = new LinkedList<>();

        agregarElemento(cola, 3.45);
        agregarElemento(cola, 2.91);
        agregarElemento(cola, 6.41);

        buscarElemento(cola, 6.41);
        buscarElemento(cola, 1.62);
    }

    public static void agregarElemento(Queue<Double> cola, double elemento) {
        cola.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public static void buscarElemento(Queue<Double> cola, double elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la cola.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la cola.");
        }
    }
}