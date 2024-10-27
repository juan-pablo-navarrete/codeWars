package com.relampamigos.miguelClases;

import com.sun.jdi.IntegerType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Gestión de inventario de productos
 * <br>
 * <b>Reglas de negocio: <b/>
 * - La aplicación debe permitir consultar el stock de productos mediante un código único.
 * - Si el código no existe, se debe lanzar una excepción.
 * - El stock de un producto no puede ser negativo.
 * - Solo los productos disponibles (stock mayor a 0) pueden ser vendidos.
 * <br>
 * <b>Criterios de aceptación: <b/>
 * - La aplicación debe permitir al usuario ingresar el código del producto.
 * - La aplicación debe mostrar el stock disponible del producto.
 * - La aplicación debe permitir registrar una venta y reducir el stock en consecuencia.
 */

public class ProductInventory {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("A0002",10);
        productMap.put("A0004",17);
        productMap.put("A0014",19);

        System.out.print("Por favor, ingrese el codigo del producto: ");
        String productCode = scaner.next();

        if(!productMap.containsKey(productCode))
            throw new IllegalArgumentException("El codigo que ingreso no existe");
        Integer stock = productMap.get(productCode);
        if(stock <= 0){
            throw new IllegalArgumentException("Stock del producto es invalido");
        }

        System.out.println("El stock del producto "+productCode+" es "+stock);
        System.out.println("Por favor digite la cantidad  que desea ingresar");
        Integer quantity = scaner.nextInt();

        if (quantity > stock)
            throw new IllegalArgumentException("Stock insuficiente");
        productMap.put(productCode,stock-quantity);
        System.out.println("EL stock final es: "+productMap.get(productCode));
    }
}
