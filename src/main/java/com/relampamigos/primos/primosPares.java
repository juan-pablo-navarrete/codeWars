package com.relampamigos.primos;

import java.util.Scanner;

public class primosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        do {
            System.out.print("Introduce un número : ");
            numero1 = sc.nextInt();
            System.out.print("Introduce otro número: ");
            numero2 = sc.nextInt();
            if (numero1 >= numero2) {
                System.out.println("El segundo número debe ser mayor que el primero");
            }
        } while (numero1 >= numero2);
        System.out.println("Números pares desde " + numero1 + " hasta " + numero2 + "  ");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}