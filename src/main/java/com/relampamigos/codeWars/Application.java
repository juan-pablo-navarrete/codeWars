package com.relampamigos.codeWars;
/*Necesitamos una función que pueda transformar un número (entero) en una cadena.*/
public class Application {
    public static void main(String[] args) {
        int number = 589;
        String result= integerString(number);
        System.out.println(result);
    }
    public static String integerString(int number){
        String chain = Integer.toString(number);
        return chain;
    }
}
