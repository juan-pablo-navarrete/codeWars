package com.relampamigos.alejandroTaboada;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        System.out.println("Digite la participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final");
        examenFinal = entrada.nextFloat();

        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;

        notaFinal = participacion + primerExamen + segundoExamen +examenFinal;

        System.out.println("La nota final es: "+notaFinal);
    }
}
