package com.relampamigos.miguelClases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Gestión de clientes de telecomunicaciones
 * <br>
 * <b>Reglas de negocio: <b/>
 * - La aplicación debe permitir agregar, listar y eliminar clientes.
 * - Los nombres de los clientes deben ser únicos.
 * - El nombre del cliente debe tener al menos 3 caracteres.
 * <br>
 * <b>Criterios de aceptación: <b/>
 * - La aplicación debe permitir ingresar el nombre del cliente.
 * - La aplicación debe mostrar la lista de clientes.
 * - La aplicación debe permitir eliminar un cliente por nombre.
 */

public class customerManagement{

    public static final String[] NAMES_DB = {"Fabian", "Omar", "Jhunior", "Martin", "Lorena"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(NAMES_DB));

        //Insertado un nuevo cliente
        System.out.print("Ingrese el nombre del nuevo cliente: ");
        String name = scanner.next();
        nameList.add(name);

        System.out.println("############# Lista de clientes #############");

        //Mostrar la lista de clientes
        for(String currentName: nameList) {
            System.out.println(currentName);
        }

        //Eliminar cliente por nombre
        System.out.print("Ingrese el nombre del cliente que dessea eliminar: ");
        String nameToRemove = scanner.next();
        nameList.remove(nameToRemove);

        System.out.println("############# Lista de clientes #############");

        //Mostrar la lista de clientes
        for(String currentName: nameList) {
            System.out.println(currentName);
        }
    }
}
