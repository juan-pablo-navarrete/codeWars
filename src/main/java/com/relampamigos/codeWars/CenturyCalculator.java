package com.relampamigos.codeWars;
/*El primer siglo abarca desde el año 1 hasta el año 100 inclusive , el segundo siglo desde el año 101 hasta el año 200 inclusive , etc.

Tarea
Dado un año, devuelve el siglo en el que se encuentra.

Ejemplos
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20
2742 --> 28*/
public class CenturyCalculator {

    public static void main(String[] args) {

        System.out.println(centuryFromYear(1705));
        System.out.println(centuryFromYear(1900));
        System.out.println(centuryFromYear(1601));
        System.out.println(centuryFromYear(2000));
        System.out.println(centuryFromYear(2742));
    }
    public static int centuryFromYear(int year) {
        int century;

        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }
}
