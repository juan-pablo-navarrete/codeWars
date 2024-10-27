package com.relampamigos.evaluacion;

import java.util.Scanner;

public class evaluación {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contadorMayorQueCero = 0;
    int contadorMenorQueCero = 0;
    int contadorIgualQuecero = 0;

    System.out.println("Ingrese la cantidad de numeros: ");
    int cantidadDeNumeros = sc.nextInt();

    for (int i = 0; i < cantidadDeNumeros; i++) {
      System.out.println("Ingrese el numero: ");
      int valorIngresado = sc.nextInt();
      if (valorIngresado > 0){
        contadorMayorQueCero = contadorMayorQueCero + 1;
      }
      if (valorIngresado < 0){
        contadorMenorQueCero = contadorMenorQueCero +1;
      }
      if (valorIngresado == 0){
        contadorIgualQuecero = contadorIgualQuecero +1;
      }
    }
    System.out.println("La cantidad de numeros mayores que 0: " + contadorMayorQueCero);
    System.out.println("La cantidad de numeros menores que 0: " + contadorMenorQueCero);
    System.out.println("La cantidad de numeros iguales que 0: " + contadorIgualQuecero);
  }
}
