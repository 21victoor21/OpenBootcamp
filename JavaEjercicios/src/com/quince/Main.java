package com.quince;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola
        Scanner r = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero mayor o igual a cero");
            num=r.nextInt();
        }while(num<0);
        System.out.println(num);
    }
}

