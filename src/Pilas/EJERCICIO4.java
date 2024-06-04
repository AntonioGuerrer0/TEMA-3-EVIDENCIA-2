
package Pilas;

import java.util.Stack;


public class EJERCICIO4 {

      public static void main(String[] args) {
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(2);
        pilaOriginal.push(3);
        pilaOriginal.push(4);

        Stack<Integer> pilaInvertida = new Stack<>();
        while (!pilaOriginal.isEmpty()) {
            pilaInvertida.push(pilaOriginal.pop());
        }

        System.out.println("Pila original: " + pilaOriginal);
        System.out.println("Pila invertida: " + pilaInvertida);
    }
}