package com.relampamigos.ejercicio;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el nombre: ");
        String nombre = sc.next();

        System.out.print("Escriba la edad: ");
        int edad = sc.nextInt();

        System.out.print("Escriba el sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Escriba el peso (Kg): ");
        double peso = sc.nextDouble();

        System.out.print("Escriba la altura (M): ");
        double altura = sc.nextDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setAltura(1.75);
        persona2.setPeso(80);

        Persona persona3 = new Persona();
        persona3.setPeso(82);
        persona3.setAltura(1.85);
        persona3.setEdad(27);
        persona3.setNombre("Raul");
        persona3.setSexo('H');

        System.out.println("******************************************************");
        System.out.println("PERSONA 1");
        System.out.println("Usted tiene " + persona.calcularIMC());
        System.out.println("La persona es mayor de edad: " + persona.esMayorDeEdad());
        System.out.println(persona);
        System.out.println("******************************************************");

        System.out.println("PERSONA 2");
        System.out.println("Usted tiene " + persona2.calcularIMC());
        System.out.println("La persona es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona2);
        System.out.println("******************************************************");

        System.out.println("PERSONA 3");
        System.out.println("Usted tiene " + persona3.calcularIMC());
        System.out.println("La persona es mayor de edad: " + persona3.esMayorDeEdad());
        System.out.println(persona3);
    }
}
