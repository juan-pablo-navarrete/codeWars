package com.relampamigos.miguelClases;

import java.util.Scanner;

public class transfersBetweenAccounts {

    /**
     * <b>Caso de uso: <b/> Transferencia entre cuentas
     * <br>
     * <b>Reglas de negocio: <b/>
     * - Una de las características de una cuenta bancaria es que tiene saldo.
     * - Durante una transferencia intervienen dos cuentas, la cuenta de origen y la cuenta de destino.
     * - Durante una transferencia, la cuenta origen debe tener saldo disponible para poder realizar la transacción.
     * - Si el monto a transferir supera el saldo disponible en la cuenta origen, entonces la transferencia no puede realizarse.
     * - El monto a transferir debe ser un valor positivo.
     * <br>
     * <b>Criterios de aceptación: <b/> La aplicación debe permitir hacer una transferencia entre cuentas y mostrar sus saldos finales.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialización de los saldos de las cuentas.
        double originAccountBalance = 2000;  // Saldo inicial de la cuenta de origen
        double destinationAccountBalance = 3000;  // Saldo inicial de la cuenta de destino

        // Se solicita al usuario que ingrese el monto a transferir.
        System.out.print("Por favor, ingrese el monto a transferir: ");
        double amountToTransfer = scanner.nextDouble();

        // Validación del monto a transferir.
        // Si el monto es menor o igual a 0, se lanza una excepción.
        if (amountToTransfer <= 0)
            throw new IllegalArgumentException("El monto a transferir debe ser positivo.");

        // Proceso de transferencia.
        // Se verifica si la cuenta de origen tiene saldo suficiente para la transferencia.
        if (amountToTransfer <= originAccountBalance) {
            // Si hay saldo suficiente, se realiza la transferencia.
            originAccountBalance = originAccountBalance - amountToTransfer;
            destinationAccountBalance = destinationAccountBalance + amountToTransfer;
        } else {
            // Si no hay saldo suficiente, se lanza una excepción.
            throw new IllegalArgumentException("La cuenta de origen no tiene saldo suficiente para realizar la operación.");
        }

        // Se muestran los saldos finales de las cuentas después de la transferencia.
        System.out.println("Saldo final");

    }
}