
package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class EJERCICIO2 {

    public static boolean verificarBalance(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una expresión matemática: ");
        String expresion = scanner.nextLine();
        
        if (verificarBalance(expresion)) {
            System.out.println("Los paréntesis están balanceados.");
        } else {
            System.out.println("Los paréntesis no están balanceados.");
        }
    }
}
