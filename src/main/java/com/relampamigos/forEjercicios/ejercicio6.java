package com.relampamigos.forEjercicios;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número para la tabla de multiplicar
        System.out.print("Ingresa un número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Imprimir la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            }

            scanner.close();
        }
    }


