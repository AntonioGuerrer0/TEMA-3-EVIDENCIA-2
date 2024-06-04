
package Colas;
import java.util.LinkedList;
import java.util.Queue;
public class EJERCICIO_1 {
 public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        agregarElemento(cola, 10);
        agregarElemento(cola, 15);
        agregarElemento(cola, 20);

        buscarElemento(cola, 25);
        buscarElemento(cola, 20);
    }

    public static void agregarElemento(Queue<Integer> cola, int elemento) {
        cola.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public static void buscarElemento(Queue<Integer> cola, int elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la cola.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la cola.");
        }
    }
}