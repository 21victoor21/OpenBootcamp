package com.TemaDiez;

public class PreguntaTres {
    public static void main(String[] args){
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int numeros[][]=new int[3][3];
        numeros[0][0]=2;
        numeros[0][1]=3;
        numeros[0][2]=7;
        numeros[1][0]=6;
        numeros[1][1]=25;
        numeros[1][2]=12;
        numeros[2][0]=11;
        numeros[2][1]=10;
        numeros[2][2]=100;
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.println("En la posicion ["+i+"]["+j+"] tiene el valor de: "+numeros[i][j]);
            }
        }
    }
}
