package com.unmsm.sistemas.monolith.paymentservice;

import java.util.Scanner;

public class FuncionesYProcedimientos {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        FuncionesYProcedimientos fp = new FuncionesYProcedimientos();
    //        fp.mostrarMensaje();
    //        fp.mostrarMensaje(5);
    //        fp.mostrarMensaje("guanazo");
    //        fp.mostrarMensaje("cacarius", 10);

    //        System.out.println(fp.retornarEntero());
    // System.out.println(fp.retornarSuma(5, 8));
    //        System.out.println(fp.retornarCadena("Juan Pablo"));
        System.out.println(fp.usarFuncionFactorial(10));
    }

    //********** FUNCIONES ************

    public int retornarEntero() {
        mostrarMensaje();
        return 5;
    }

    public int retornarSuma(int a, int b) {
        return a + b;
    }

    public String retornarCadena(String cadena) {
        return cadena + " animalarius";
    }

    public int usarFuncionFactorial(int n){
        return calcularFactorial(n);
    }

    public int calcularFactorial(int n) {
        int factorial = 1;
        for (int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }



    //********** PROCEDIMIENTOS *************

    //No acepta parametros
    public void mostrarMensaje() {
        System.out.println("Juan Pablo guanarius");
    }

    //Acepta parametros enteros
    public void mostrarMensaje(int numero) {
        System.out.println("Juan Pablo guanarius " + numero);
    }

    //Acepta parametros cadenas
    public void mostrarMensaje(String palabra) {
        System.out.println("Juan Pablo guanarius " + palabra);
    }

    //Acepta parametros cadenas y enteros
    public void mostrarMensaje(String palabra, int numero) {
        System.out.println("Juan Pablo guanarius " + palabra + numero);
    }
}
