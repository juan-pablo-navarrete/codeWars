package com.relampamigos.forEjercicios;

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int edad,sumaEdad=0,conteoMayor18=0,contadorMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;

        for (int i=1;i<=5;i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su altura"));

            sumaEdad += edad;
            altura += altura;

            if (edad>18){
                conteoMayor18++;
            }
            if (altura>1.75){
                contadorMayor175++;
            }
        }
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;

        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La altura promedio es: "+mediaAltura);
        System.out.println("Cantidad de alumno mayores de 18 años: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: "+contadorMayor175);
    }
}
