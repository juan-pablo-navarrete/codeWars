package com.relampamigos.service;

// psvm
//sout
//int
//n++  =  n=n+1
//Scanner sc = new Scanner(System.in);

import java.util.Scanner;

public class SumaValor {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("ingrese su numero:");
    int limite= sc.nextInt();
    int n;
    int suma = 0;

    for (n = 1; n<=limite; n++) {
      suma = suma + n;
      System.out.println("valor actual: " +suma );
    }

    System.out.println("el valor de la suma: " + suma);

  }


}
