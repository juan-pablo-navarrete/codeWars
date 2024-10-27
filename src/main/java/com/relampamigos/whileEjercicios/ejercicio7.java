package com.relampamigos.whileEjercicios;

import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args) {
        int numero,elementos=0,suma=0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero>=0){
            suma += numero;
            elementos++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        if (elementos==0){
            System.out.println("ERROR la divison entre 0 no existe");
        }
        else {
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }
    }
}
