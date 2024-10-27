package com.relampamigos.alejandroTaboada;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.print("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1+nota2+nota3;

        System.out.println("\nLa suma es: "+suma); // el slash se hace con alt gr + el que esta al costado del 0 eso hace un salto de linea
    }
}
