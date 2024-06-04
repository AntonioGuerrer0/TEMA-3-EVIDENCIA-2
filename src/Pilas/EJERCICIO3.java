
package Pilas;

import java.util.Scanner;
import java.util.Stack;


public class EJERCICIO3 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int numero = scanner.nextInt();

        Stack<Integer> pila = new Stack<>();
        while (numero > 0) {
            pila.push(numero % 2);
            numero /= 2;
        }

        System.out.print("Numero en binario: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }
}