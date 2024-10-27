package com.relampamigos.factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero entero no negativo: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            int factorial = 1;

            for (int j = 1; j <= i; j++) {
      //          factorial *= j;
                factorial = factorial * j;
            }
            System.out.println("El factorial " + i + " es " + factorial);
            }
        }
    }

