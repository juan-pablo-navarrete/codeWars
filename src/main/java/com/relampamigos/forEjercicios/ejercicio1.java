package com.relampamigos.forEjercicios;

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero :");
        int n = scanner.nextInt();

        System.out.println("Los números del 1 al " + n +" son:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
