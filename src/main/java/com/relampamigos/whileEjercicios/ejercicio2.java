package com.relampamigos.whileEjercicios;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args){
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0){
            cuadrado = (int)Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es: " +cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));

        }
    }
}
