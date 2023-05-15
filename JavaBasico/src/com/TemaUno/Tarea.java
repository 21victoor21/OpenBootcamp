package com.TemaUno;

public class Tarea {
    public static void main(String[] args){
        //Enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        System.out.println("La variable byte tiene el valor de: "+variable1);
        System.out.println("La variable short tiene el valor de: "+variable2);
        System.out.println("La variable int tiene el valor de: "+variable3);
        System.out.println("La variable long tiene el valor de: "+variable4);

        //Deciamales
        float variable5 = 5.5f;
        double variable6 = 20.9d;
        System.out.println("La variable float tiene el valor de: "+ variable5);
        System.out.println("La variable double tiene el valor de: "+ variable6);

        //Boolean
        boolean variable7 = true;
        boolean variable8 = false;
        System.out.println("La variable boolean puede ser "+variable7+ " o "+ variable8);

        //Textos
        char variable9 = 'a';
        String varaible10 = "Victor Gonzales Contreras";
        System.out.println("El valor de la varaible char es: "+variable9+" ;y el valor de la variable String es: " + varaible10);
    }
}
