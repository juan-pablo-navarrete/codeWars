package com.relampamigos.alejandroTaboada;

import javax.swing.*;
import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero == dato){ // ! esta es el operador de desigualdad sirve si quieres saber si el valor es diferente
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numeor es diferente a 5");
        }
    }
}
