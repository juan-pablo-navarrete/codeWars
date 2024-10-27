package com.relampamigos.codeWars;
/*Crea una función que proporciona un saludo personalizado. Esta función acepta dos parámetros: nombre del propietario.
Utilice condicionales para devolver el mensaje apropiado:
caso devolver nombre es igual a propietario Hola jefe de lo contrario Hola invitado*/
public class Greeting {

    public static void main(String[] args) {

        System.out.println(personalizedGreeting("Juan", "Juan"));
        System.out.println(personalizedGreeting("Maria", "Juan"));
    }
    public static String personalizedGreeting(String name, String owner) {

        if (name.equals(owner)) {
            return "Hola jefe";
        } else {
            return "Hola invitado";
        }
    }
}
