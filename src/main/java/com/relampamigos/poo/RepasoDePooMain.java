package com.relampamigos.poo;

public class RepasoDePooMain {
     public static void main(String[] args) {
         RepasoDePoo trabajador = new RepasoDePoo();
    trabajador.setCode(8515);
    trabajador.setName("Matias");
    trabajador.setContractType("contrato de aprendizaje");
    trabajador.setDocumentIdentification(75868303);
    trabajador.setDeparmentCode(3);

    System.out.println(trabajador);
         System.out.println("----------");
         System.out.println(trabajador.getCode());
         System.out.println(trabajador.getContractType());
         System.out.println(trabajador.getName());
         System.out.println(trabajador.getDocumentIdentification());
         System.out.println(trabajador.getDeparmentCode());
    }
}