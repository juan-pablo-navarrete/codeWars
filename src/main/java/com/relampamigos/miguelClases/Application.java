package com.relampamigos.miguelClases;

public class Application {
    public static void main(String[] args) {
        Employe employee = new Employe(18, "Desarrollador", 9500, 2);
        employee.setSalary(10000);

        System.out.println(employee);

        employee.progress();

        System.out.println(employee);

        employee.progress();
        employee.progress();
        employee.progress();
        employee.progress();
        employee.progress();
        employee.progress();
        employee.progress();
        employee.progress();

        System.out.println(employee);

        System.out.println("El mérito del empleado es: " + employee.getMerit() + " y su sueldo actual es: " + employee.getSalary());

        employee.progress();

        System.out.println(employee);
    }

}
