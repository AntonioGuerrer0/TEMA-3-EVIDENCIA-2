/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tono_
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        List<Character> lista = new ArrayList<>();

        agregarElemento(lista, 'K');
        agregarElemento(lista, 'X');
        agregarElemento(lista, 'A');

        buscarElemento(lista, 'K');
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