package com.TemaCuatro;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        SmartDevice smartdevice = new SmartDevice("iPhone","blanco",2022,1449);
        SmartPhone smartphone = new SmartPhone();
        System.out.println("--> DATOS DEL SMARTPHONE:");
        smartphone.operador = "Movistar";
        System.out.println("OPERADOR: "+smartphone.operador);
        System.out.println("MARCA: "+smartdevice.marca);
        System.out.println("COLOR: "+smartdevice.color);
        System.out.println("AÑO DE FABRICACION: "+smartdevice.fabricacion);
        System.out.println("PRECIO: "+smartdevice.precio+" euros");
        smartdevice.Estado(true);

        System.out.println(" ");
        System.out.println("--> DATOS DEL SMARTWATCH:");
        SmartWatch smartwatch =new SmartWatch("Samsung","negro", 2021,260, "blanca");
        System.out.println("COLOR DE CORREA: "+smartwatch.colorcorrea);
        System.out.println("MARCA: "+smartwatch.marca);
        System.out.println("COLOR: "+smartwatch.color);
        System.out.println("AÑO DE FABRICACION: "+smartwatch.fabricacion);
        System.out.println("PRECIO: "+smartwatch.precio+" euros");
        smartdevice.Estado(false);


    }
}
