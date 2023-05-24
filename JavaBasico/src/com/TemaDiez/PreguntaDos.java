package com.TemaDiez;

public class PreguntaDos {
    public static void main(String[] args) {
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String nombres[] = new String[5];
        nombres[0] = "Pedro";
        nombres[1] = "Victor";
        nombres[2] = "Maruja";
        nombres[3] = "Robert";
        nombres[4] = "Maria";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Los valores del Array son: " + nombres[i]);
        }
    }
}
