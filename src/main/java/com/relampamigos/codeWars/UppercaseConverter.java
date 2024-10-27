package com.relampamigos.codeWars;
/*Escriba una función que convierta la cadena de entrada a mayúsculas.*/
public class UppercaseConverter {

    public static void main(String[] args) {

        System.out.println(convertToUppercase("hola"));
        System.out.println(convertToUppercase("Java es divertido"));
        System.out.println(convertToUppercase("123abc!"));
        System.out.println(convertToUppercase(null));
    }
    public static String convertToUppercase(String input) {

        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }
}
