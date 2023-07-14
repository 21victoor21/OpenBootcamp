package com.ocho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Modifica el ejercicio anterior, para que en lugar de pedir un número,
        // pida un carácter (char) y muestre su código en la tabla ASCII
        Scanner dato = new Scanner(System.in);
        char valor;
        System.out.println("ingrese el caracter");
        valor=dato.next().charAt(0);
        int caracter = (int)valor;
        System.out.println(caracter);
    }
}
