package com.relampamigos.miguelClases;
import java.util.Scanner;

/**
 * Ejercicio: Recarga de Saldo en un Teléfono Móvil
 *
 * Descripción:
 * Tienes un teléfono móvil y quieres recargar saldo. El programa debe pedirte que ingreses
 * la cantidad de dinero que tienes y el monto que deseas recargar. Luego, el programa verificará
 * si tienes suficiente dinero para hacer la recarga. Si tienes suficiente dinero, el programa restará
 * el monto de la recarga de tu dinero y te dirá cuánto dinero te queda. Si no tienes suficiente dinero,
 * te avisará que no puedes realizar la recarga.
 *
 * Reglas:
 * - El dinero disponible y el monto de la recarga deben ser valores positivos.
 * - El programa debe verificar si tienes suficiente dinero para hacer la recarga.
 *
 * Criterios de Aceptación:
 * - El programa debe permitirte ingresar el dinero que tienes y el monto de la recarga.
 * - Si tienes suficiente dinero, el programa debe mostrar cuánto dinero te queda después de la recarga.
 * - Si no tienes suficiente dinero, el programa debe mostrar un mensaje diciendo que no puedes hacer la recarga.
 */

public class cellPhoneRecharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuanto dinero tienes?");
        double amountOfMoney = scanner.nextDouble();

        System.out.println("¿Cual es el monto a recargar?");
        double amountToRecharge = scanner.nextDouble();

        if (amountOfMoney <= 0 || amountToRecharge <=0){
            System.out.println("El monto de la recarga debe ser un valor positivo");
        }else {
            if (amountOfMoney <= amountToRecharge){
                amountOfMoney = amountOfMoney - amountToRecharge;
                System.out.println("Tu recarga de " + amountToRecharge + " se a realizado exitosamente actualmente te queda " +amountOfMoney+ " de dinero");
            }else {
                System.out.println("No cuentas con dinero suficiente para hacer la recarga");
            }
        }
    }
}
