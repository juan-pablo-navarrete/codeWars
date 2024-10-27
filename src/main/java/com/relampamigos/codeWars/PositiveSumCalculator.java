package com.relampamigos.codeWars;
/*Obtienes una matriz de números y devuelves la suma de todos los positivos.
 Ejemplo [1,-4,7,12]=>1 + 7 + 12 = 20
 Nota: si no hay nada que sumar, la suma predeterminada es 0. ahora lo mismo para este ejercicio*/
public class PositiveSumCalculator {

    public static void main(String[] args) {

        int[] example = {1, -4, 7, 12};
        System.out.println(sumOfPositives(example));
    }
    public static int sumOfPositives(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}
