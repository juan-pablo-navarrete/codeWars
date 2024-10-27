package com.relampamigos.service;


import java.util.Scanner;

public class SumaValor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite;
        System.out.println("ingresa un valor:");
        limite = sc.nextInt();
        for (int n = 1; n <= limite; n++) {
            int contador = 0;
            for (int m = 1; m <= n; m++) {
                if (n % m == 0)
                    contador++;
                    }
                if (contador == 2)
                    System.out.println(n);

                }
            }



}