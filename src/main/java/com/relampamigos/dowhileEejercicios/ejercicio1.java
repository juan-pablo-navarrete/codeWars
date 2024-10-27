package com.relampamigos.dowhileEejercicios;

import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
        int numero,aleatorio,contador =0;

        aleatorio = (int) (Math.random()*100);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (aleatorio > numero){
                System.out.println("Digite un numero mayor");
            }else {
                System.out.println("Digite un numero menor");
            }
            contador++;
        }while (numero != aleatorio);
        System.out.println("\nFelicidades!! adivinaste el numero en: "+contador+" intentos");
    }
}
