package com.relampamigos.cuenta;

public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("matias", 20);
        System.out.println("antes:" + cuenta1);
//
//        Cuenta cuenta2 = new Cuenta("matias");
//        System.out.println(cuenta2);

        cuenta1.ingresar(10);
       System.out.println("despues:" + cuenta1);


        cuenta1.retirar(15);
        System.out.println(cuenta1);

    }
}
