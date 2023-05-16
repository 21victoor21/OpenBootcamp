package com.TemaTres;

public class Tarea {
    public static void main(String[] args) {
        String[] nombres = {"Victor", "Jesus", "Juan", "Pedro", "Raul"};
        //for (int i=0;i< nombres.length;i++)
        //    System.out.println("Bienvenido: "+nombres[i]);
        //}
        for (String var : nombres) {
            System.out.println("Bienvenio: " + var);
        }
    }
}