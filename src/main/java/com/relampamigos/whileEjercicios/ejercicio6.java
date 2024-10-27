package com.relampamigos.whileEjercicios;

import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero != 0 ){
            if (numero %2 ==0){
                System.out.println("El numero es PAR");
            }else {
                System.out.println("El numero es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

        }
    }
}
