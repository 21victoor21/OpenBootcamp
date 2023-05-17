package com.TemaCuatro;

public class SmartDevice {
    //atributos
    String marca;
    String color;
    int fabricacion; // año de fabricación.
    double precio;
    boolean estado;

    //constructores
    public SmartDevice(){

    }
    public SmartDevice(String marca, String color, int fabricacion, double precio){
        this.marca=marca;
        this.color=color;
        this.fabricacion=fabricacion;
        this.precio=precio;
    }

    //metodos
    public void Estado(boolean estado){
        this.estado=estado;
        if(estado==true){
            System.out.println("El dispositivo esta encendido");
        }else if (estado==false){
            System.out.println("El dispositivo esta apagado");
        }


    }
}
