package com.relampamigos.whileEjercicios;

import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero!=0){

            if (numero>0){
                System.out.println("El numero es positivo");
            }else {
                System.out.println("El numero es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

        }
    }
}
