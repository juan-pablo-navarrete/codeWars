package com.relampamigos.miguelClases;

import java.util.Scanner;
/**
 * Ejercicio: Comprar Productos en una Tienda
 *
 * Descripción:
 * Imagina que estás en una tienda donde puedes comprar productos. El programa debe pedirte
 * que ingreses la cantidad de dinero que tienes y el precio de un producto que quieres comprar.
 * Luego, el programa debe verificar si tienes suficiente dinero para comprar el producto.
 * Si tienes suficiente dinero, el programa restará el precio del producto de tu dinero y
 * te dirá cuánto dinero te queda. Si no tienes suficiente, el programa te avisará que no
 * puedes comprar el producto.
 *
 * Reglas:
 * - El dinero y el precio del producto deben ser valores positivos.
 * - El programa debe verificar si tienes suficiente dinero para comprar el producto.
 *
 * Criterios de Aceptación:
 * - El programa debe permitirte ingresar el dinero que tienes y el precio del producto.
 * - Si tienes suficiente dinero, el programa debe mostrar cuánto dinero te queda después
 *   de la compra.
 * - Si no tienes suficiente dinero, el programa debe mostrar un mensaje diciendo que no
 *   puedes comprar el producto.
 */
public class purchasingProductsInStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialización del dinero disponible
        System.out.println("Cuento dinero tiene:");
        double availableMoney = scanner.nextDouble();

        // Ingreso del precio del producto
        System.out.println("Ingrese el precio del prodcuto que deseas comprar:");
        double productPrice = scanner.nextDouble();

        // Validación de que ambos valores sean positivos
        if(availableMoney <= 0 || productPrice <= 0) {
            System.out.println("El dinero y el precio del producto deben ser valores positivos.");
        }else{
            // Verificación si puedes comprar el producto
            if (availableMoney > productPrice) {
                // Si puedes comprarlo, se resta el precio del producto de tu dinero disponible
                availableMoney = availableMoney - productPrice;
                System.out.println("Has comprado el producto. te queda " + availableMoney + " de dinero.");
            }else {
                // Si no tienes suficiente dinero
                System.out.println("No tienes suficiente dinero para comprar el producto.");
            }
        }
    }
}
