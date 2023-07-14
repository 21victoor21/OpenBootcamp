package com.siete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Lee un número por teclado y muestra por consola,
        // el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
        Scanner dato = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num=dato.nextInt();
        char caracter = (char)num;
        System.out.println(caracter);
    }
}
