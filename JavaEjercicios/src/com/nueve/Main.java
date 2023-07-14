package com.nueve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Lee un número por teclado que pida el precio de un producto
        // (puede tener decimales) y calcule el precio final con IVA.
        // El IVA sera una constante que sera del 21%.
        Scanner dato = new Scanner(System.in);
        double precio;
        double preciofinal;
        System.out.println("Ingrese el precio del producto");
        precio=dato.nextDouble();
        preciofinal = precio+precio*0.21;
        System.out.println("El precio final incluido IVA es: "+preciofinal);
    }
}
