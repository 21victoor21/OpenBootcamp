package com.trece;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Realiza una aplicación que nos pida un número de ventas a introducir,
        // después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
        // Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de ventas en día de hoy");
        int nventas = r.nextInt();
        double sumamonto=0; // acumulador
        for(int i=1; i<=nventas;i++){
            System.out.println("Ingrese la venta: "+i);
            Double monto = r.nextDouble();
            sumamonto=sumamonto+monto;
        }
        System.out.println("El monto total de las ventas es:"+sumamonto);

    }
}
