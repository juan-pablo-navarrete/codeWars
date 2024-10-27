package com.relampamigos.matrizEjemplo;

public class MatrizEjemplo {
    public static void main(String[] args){

        int[][] matriz = new int[3][3];
//        int[][] matrizEjemplo = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9} };

            // Inicializar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimir el valor en la posición (i, j)
            }
            System.out.println();
        }
//        // Inicializar la matriz con valores fijos
//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[0][2] = 3;
//        matriz[1][0] = 4;
//        matriz[1][1] = 5;
//        matriz[1][2] = 6;
//        matriz[2][0] = 7;
//        matriz[2][1] = 8;
//        matriz[2][2] = 9;

//        System.out.println(matriz.length);
//        System.out.println(matriz[0].length);

//        int valor = matriz[1][2]; // Acceder al valor en la fila 1, columna 2
//        System.out.println(valor); // Imprimir el valor (6)
        }
    }

