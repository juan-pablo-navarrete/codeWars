package com.relampamigos.forEjercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma total de los 10 números es: " + suma);
    }
}
