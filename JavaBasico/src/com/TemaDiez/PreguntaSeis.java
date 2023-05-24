package com.TemaDiez;

import java.util.ArrayList;
import java.util.LinkedList;

public class PreguntaSeis {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Victor");
        nombres.add("Jose");
        nombres.add("Melarry");
        nombres.add("Maruja");
        System.out.println("Valores del ArrayList:");
        for(int i=0; i< nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        System.out.println();
        LinkedList<String> copia = new LinkedList<>(nombres);
        System.out.println("Valores del LinkedList:");
        for(int i=0;i<copia.size();i++){
            System.out.println(copia.get(i));
        }
    }
}
