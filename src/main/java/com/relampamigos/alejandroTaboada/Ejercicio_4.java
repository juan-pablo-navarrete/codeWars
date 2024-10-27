package com.relampamigos.alejandroTaboada;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales,semanas,dias,horas;

        System.out.println("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;

        System.out.println("\n El quivalente de horas es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("horas: "+horas);
    }
}
