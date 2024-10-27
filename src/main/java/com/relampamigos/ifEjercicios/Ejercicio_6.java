package com.relampamigos.ifEjercicios;

import javax.swing.*;

public class Ejercicio_6 {
     public static void main(String[] args) {
        int numero1, numero2;
         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
         numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

         if (numero1 > numero2) {
             JOptionPane.showMessageDialog(null,"El numero "+numero1+"es mayor que el numero"+numero2);
         }
         else if (numero1 < numero2){
             JOptionPane.showMessageDialog(null,"El numero "+numero2+"es mayor que el numero"+numero1);

         }else {
             JOptionPane.showMessageDialog(null,"Los numeros son iguales");
         }
    }
}
