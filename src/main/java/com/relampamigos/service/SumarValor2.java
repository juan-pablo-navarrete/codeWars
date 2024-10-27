package com.relampamigos.service;

import java.util.Scanner;

public class SumarValor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor:");
        int limite = sc.nextInt();
        int n;
        int suma = 0;
        for (n = 1; n <= limite; n++) {
            suma = suma + n;
            System.out.println("el valor actual :" + suma);
        }
        System.out.println("el valor de la suma :" + suma);
    }
}
