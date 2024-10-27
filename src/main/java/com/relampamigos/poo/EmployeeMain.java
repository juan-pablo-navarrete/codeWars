package com.relampamigos.poo;

import com.relampamigos.ejercicio.Persona;

import java.sql.Date;
import java.time.LocalDate;

public class EmployeeMain {

  public static void main(String[] args) {
//    RepasoDePoo repaso = new RepasoDePoo();
  //  Employee empleado1 = new Employee();


//    repaso.setContractDate(LocalDate.of(2023, 2, 8));
//    repaso.setNumber(12);
//    empleado1.code = 1;
//    empleado1.name = "Juan Pablo";
//    empleado1.contractType = "Contrato indefinido";

//    empleado1.setCode(10000);
//    empleado1.setDepartmentCode(5);
//    empleado1.setName("Juan Pablo");
//    empleado1.setDocumentIdentification(76517368);
//    empleado1.setContractType("Contrato indefinido");
//
//    System.out.println(empleado1);
//
//    System.out.println("----------");
//    System.out.println(empleado1.getCode());
//    System.out.println(empleado1.getDepartmentCode());
//    System.out.println(empleado1.getName());
//    System.out.println(empleado1.getDocumentIdentification());
//    System.out.println(empleado1.getContractType());
/*    Employee empleado2 = new Employee(2, "matias");
    System.out.println(empleado2);

    Employee empleado3 = new Employee();
 //   System.out.println(empleado3);*/
    Persona persona = new Persona();
    System.out.println(persona);
    System.out.println(persona.getDNI());
    System.out.println(persona.getPeso());

    Persona persona2 = new Persona("rafael", 23, 'H');
    System.out.println(persona2);
    System.out.println(persona2.getAltura());
    System.out.println(persona2.getPeso());


    Persona persona3 = new Persona("carlos", 26, 'H', 45, 1.80);
    System.out.println(persona3.getDNI());
    System.out.println(persona3.getNombre());
    System.out.println(persona3.getAltura());
    System.out.println(persona3.getSexo());
  }

}
