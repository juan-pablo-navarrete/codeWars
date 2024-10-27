package com.relampamigos.whileEjercicios;

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero,contador =0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

        while (numero >0 ){
            contador++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero entero"));

        }
        System.out.println("Numeros introducidos "+contador);

    }
}
