package com.catorce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Realiza una aplicación que nos calcule una ecuación de segundo grado.
        // Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante
        // (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.
        // Te recomiendo que uses mensajes de traza.
        Scanner r = new Scanner (System.in);
        int a, b, c;
        System.out.println("Ingrese a:");
        a=r.nextInt();
        System.out.println("Ingrese b:");
        b=r.nextInt();
        System.out.println("Ingrese c:");
        c=r.nextInt();
        Double dis = Math.sqrt(Math.pow(b,2)-4*a*c);
        System.out.println("La discriminante de la ecuación es: "+dis);
        Double x1=(-b+dis)/2*a;
        Double x2=(-b-dis)/2*a;
        System.out.println("La primera raiz es: "+x1);
        System.out.println("La segunda raiz es: "+x2);
    }
}
