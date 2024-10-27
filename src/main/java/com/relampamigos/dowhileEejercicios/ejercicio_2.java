package com.relampamigos.dowhileEejercicios;

import javax.swing.*;

public class ejercicio_2 {
    public static void main(String[] args) {
        int numero,contador=0,i=0;


        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

            contador++;
            i += numero;

        }while (numero !=0);
        System.out.println("La suma de los numeros introducidos son: " +i);
    }
}
