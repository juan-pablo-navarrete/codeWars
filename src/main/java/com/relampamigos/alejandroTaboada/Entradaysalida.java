package com.relampamigos.alejandroTaboada;

import java.util.Scanner;

public class Entradaysalida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero:");
        numero = entrada.nextInt();

        System.out.println("El numero es: "+ numero);
    }
}
