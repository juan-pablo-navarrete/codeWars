package com.relampamigos.arreglos;

public class ArregloPrueba  {

    public static void main(String[] args) {

        // Declaración y creación de un arreglo de enteros con 5 elementos
     //   int[] numeros = new int[5];
        int[] numeros = {10, 20, 30, 40, 50};

        // Asignación de valores a cada elemento del arreglo
//        numeros[0] = 10;
//        numeros[1] = 20;
//        numeros[2] = 30;
//        numeros[3] = 40;
//        numeros[4] = 50;

        // Acceso y modificación de elementos individuales del arreglo
        System.out.println("El valor del primer elemento del arreglo es: " + numeros[0]);
        numeros[0] = 100;

        // Iteración a través de los elementos del arreglo
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}


