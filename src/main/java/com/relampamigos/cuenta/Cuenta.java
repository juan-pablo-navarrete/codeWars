package com.relampamigos.cuenta;

public class Cuenta {
    private String titular;
    private double cantidad;
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular){
        this.titular = titular;
    }

    public void ingresar(double cantidadIngresada){
//        if (cantidadIngresada < 0){
//
//        } else{
//            this.cantidad = this.cantidad + cantidadIngresada;
//        }
        if(cantidadIngresada >= 0){
            this.cantidad = this.cantidad + cantidadIngresada;
        }
    }
    public void retirar(double cantidadRetirada){
        double diferencia = cantidad - cantidadRetirada;
        if (diferencia < 0){
            cantidad = 0;
        } else{
            cantidad = diferencia;
        }
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
