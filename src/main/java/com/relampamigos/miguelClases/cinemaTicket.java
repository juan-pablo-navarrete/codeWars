package com.relampamigos.miguelClases;
import java.util.Scanner;
/**
 * Ejercicio: Pago de Entrada al Cine
 *
 * Descripción:
 * Estás en la taquilla de un cine y deseas comprar entradas para una película. El programa debe pedirte
 * que ingreses la cantidad de dinero que tienes, el precio de una entrada, y la cantidad de entradas
 * que deseas comprar. Luego, el programa verificará si tienes suficiente dinero para comprar las entradas.
 * Si tienes suficiente dinero, el programa calculará el costo total, lo restará de tu dinero, y te dirá
 * cuánto dinero te queda. Si no tienes suficiente dinero, te avisará que no puedes comprar las entradas.
 *
 * Reglas:
 * - El dinero, el precio de la entrada y la cantidad de entradas deben ser valores positivos.
 * - El programa debe verificar si tienes suficiente dinero para comprar la cantidad de entradas.
 *
 * Criterios de Aceptación:
 * - El programa debe permitirte ingresar el dinero que tienes, el precio de la entrada, y la cantidad de entradas.
 * - Si tienes suficiente dinero, el programa debe mostrar cuánto dinero te queda después de la compra.
 * - Si no tienes suficiente dinero, el programa debe mostrar un mensaje diciendo que no puedes comprar las entradas.
 */

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuanto dinero tienes?");
        double amountOfMoney = scanner.nextDouble();

        System.out.println("¿Cual es el costo de una entrada?");
        double entryCost = scanner.nextDouble();

        System.out.println("¿Cuantas entradas desea comprar?");
        double numberOfEntriesRequired = scanner.nextDouble();

        if (amountOfMoney <=0 || entryCost <=0 || numberOfEntriesRequired <=0){
            System.out.println("EL dinero, el costo de la entrada y la cantidad de entradas deben ser valores positivos");
        }else{
            double totalCost = entryCost*numberOfEntriesRequired;

            if (amountOfMoney >= totalCost){
                amountOfMoney = amountOfMoney - totalCost;
                System.out.println("Has comprado " + numberOfEntriesRequired + " entradas. te queda " + amountOfMoney + " dinero.");
            }else {
                System.out.println("No tienes dinero suficiente para comprar" + numberOfEntriesRequired + "entrdas");
            }
        }
    }
}
