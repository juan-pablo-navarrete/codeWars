package com.relampamigos.switchEjercicios;
enum Mes {
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
}
public class ejercicio1 {
    public static void main(String[] args) {
        Mes mes = Mes.DICIEMBRE;

        switch (mes){
            case ENERO:
            case FEBRERO:
            case MARZO:
                System.out.println("Estamos en el primer trimestre del año.");
                break;
            case ABRIL:
            case MAYO:
            case JUNIO:
                System.out.println("Estamos en el segundo trimestre del año.");
                break;
            case JULIO:
            case AGOSTO:
            case SEPTIEMBRE:
                System.out.println("Estamos en el tercer trimestre del año.");
                break;
            default:
            case OCTUBRE:
            case NOVIEMBRE:
            case DICIEMBRE:
                System.out.println("Estamos en el ultimo trimestre del año.");
        }
    }
}
