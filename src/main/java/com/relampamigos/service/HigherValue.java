package com.relampamigos.service;

import java.util.Scanner;

public class HigherValue {

  // psvm crear metodo principal
  public static void main(String[] args) {
    //leer
    Scanner sc = new Scanner(System.in);

    //sout escribir
    System.out.println("Por favor, ingrese dos valores:");

    System.out.print("Escriba el primer valor:");
    int valorA = sc.nextInt();

    System.out.print("Escriba el segundo valor:");
    int valorB = sc.nextInt();

    if (valorA > valorB) {
      System.out.println("Valor A es mayor: " + valorA);
    } else {
      if(valorA == valorB) {
        System.out.println("Valor A es igual a valor B: " + valorA + "-" + valorB);
      } else {
        System.out.println("Valor B es mayor: " + valorB);
      }
    }
  }
}
