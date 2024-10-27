package com.relampamigos.alejandroTaboada;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //para poder guardar datos se tiene que llamar a la clase scaner que se debe importar de la libreria de java, con esto puedes guardar cual quier tipo de dato como cadenas, entero, entre otros
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        System.out.println("El numero es: "+numero);
    }
}
