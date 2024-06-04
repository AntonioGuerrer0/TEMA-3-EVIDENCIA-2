
package Pilas;

import java.util.Stack;


public class EJERCICIO5 {

    
   public static void main(String[] args) {
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(5);
        pilaOriginal.push(4);
        pilaOriginal.push(3);
        pilaOriginal.push(2);

        Stack<Integer> pilaInvertida = new Stack<>();
        while (!pilaOriginal.isEmpty()) {
            pilaInvertida.push(pilaOriginal.pop());
        }

        System.out.println("Pila invertida: " + pilaInvertida);
    }
}