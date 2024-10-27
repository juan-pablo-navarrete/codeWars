package com.relampamigos.ejercicio;

import java.util.Random;

public class Persona {
    private final char SEXO_DEF = 'H';

    private final String INFRAPESO = "Infrapeso";

    private final String PESO_IDEAL = "Peso Ideal";

    private final String SOOBREPESO = "Sobrepeso";

    private String nombre;

    private int edad;

    private String DNI;

    private char sexo;

    private double peso;

    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = SEXO_DEF;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String generaDNI() {
        int length = 8;
        String charset = "0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charset.length());
            char randomChar = charset.charAt(randomIndex);
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }

    public String calcularIMC() {
        double IMC = peso / (altura*altura);

        if (IMC >= 20 && IMC <= 25){
            return PESO_IDEAL;
        } else if (IMC <20) {
            return INFRAPESO;
        } else {
            return SOOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public char comprobarSexo() {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H';
        }
    }
}