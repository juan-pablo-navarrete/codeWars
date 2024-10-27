package com.relampamigos.repaso;
//         Crear un matriz de 5 x 5
//        Llenar la matriz con números aleatorios.
//        Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.
//
//        int numero = (int)(Math.random() * 100);
//        A partir de la matriz anteriormente creada.
//
//        Mostrar en consola el promedio de la matriz.
//        Mostrar en consola todos los números primos.
//        Mostrar en consola todos los números pares.
//        Mostrar en consola la suma de las diagonales.
//        Mostrar en consola la suma de la la última fila.
public class matriz {
    public static void main(String[] args) {
        int[][] matriz = llenarMatriz();
        mostrarMatriz(matriz);

        System.out.println("************** PROMEDIO ***************");
        calcularPromedio(matriz);

    }
    public static void mostrarMatriz ( int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprimir el valor en la posición (i, j)
            }
            System.out.println();
        }
    }
    public static int[][] llenarMatriz() {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        return matriz;
    }

    public static double calcularPromedio(int[][] matriz) {
        int suma = 0;
        int promedio = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        promedio = suma / (matriz.length * matriz[0].length);
        System.out.println("El promeido es: " + promedio);
        return promedio;
    }


}
