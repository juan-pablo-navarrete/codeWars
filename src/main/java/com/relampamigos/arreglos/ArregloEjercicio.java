package com.relampamigos.arreglos;

import java.util.Scanner;

/**
 * Crea un array de 4 posiciones de números con valores pedidos por teclado.
 * Muestra por consola el indice y el valor al que corresponde.
 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
 */
public class ArregloEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();

         //   String = "(índice: " + index + ", valor: " + value + ")";


        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice: " + i + ", valor: " + numeros[i]);
        }
        }
}
