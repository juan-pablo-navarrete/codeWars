package com.relampamigos.ejercicio;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1000);
       // System.out.println(numeroAleatorio);

        int numeroIngresado;
        do {
           System.out.println("Ingrese un numero: ");
           numeroIngresado = sc.nextInt();
           if (numeroIngresado < numeroAleatorio){
               System.out.println("el numero que usted a ingresado es menor");
           }else{
               if (numeroIngresado > numeroAleatorio){
                   System.out.println("el numero que ested a ingresado es mayor");
               }else{
                   System.out.println("!Felicidades acerto!");
               }
           }
        } while (numeroAleatorio != numeroIngresado);
    }
}
