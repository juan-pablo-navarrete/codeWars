package com.relampamigos.matrizEjemplo;
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
public class EjercicioMatriz {
    public static void main(String[] args) {
        int[][] matriz = llenarMatriz();
        mostrarMatriz(matriz);

        System.out.println("************ PROMEDIO ************");
        calcularPromedio(matriz);

        System.out.println("************ NUMEROS PRIMOS ************");
        numerosPrimos(matriz);
        System.out.println();

        System.out.println("************ NUMEROS PARES ************");
        numerosPares(matriz);

        System.out.println();
        System.out.println("************ SUMA DIAGONAL *************");
        sumaDeDiagonales(matriz);

        System.out.println();
        System.out.println("************ SUMA DE LA ULTIMA FILA *************");
        sumaDeUltimaFila(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {
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
        System.out.println("El promedio es: " + promedio);
        return promedio;
    }

    public static void numerosPrimos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static boolean esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)
                contador++;
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void numerosPares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (esPar(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void sumaDeDiagonales(int[][] matriz) {
        int sumadiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    sumadiagonal = sumadiagonal + matriz[i][j];
                }
            }
        }
        int sumadiagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == matriz.length - 1) {
                    sumadiagonal2 = sumadiagonal2 + matriz[i][j];
                }
            }
        }
        System.out.println(" " + sumadiagonal + " " + sumadiagonal2 );
    }

    public static void sumaDeUltimaFila(int[][] matriz){
        int sumafila = 0;
        for (int j = 0; j < 5; j++) {
                sumafila = sumafila + matriz[4][j];
            }
            System.out.println(": " + sumafila);

        }
    }
