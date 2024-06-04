
package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class EJERCICIO1 {

  
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String input = scanner.nextLine();
        
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Cadena invertida: " + reversed.toString());
    }
}