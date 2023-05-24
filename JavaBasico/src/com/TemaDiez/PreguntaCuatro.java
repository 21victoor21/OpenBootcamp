package com.TemaDiez;

import java.util.Vector;

public class PreguntaCuatro {
    public static void main(String[] args) {
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> notas = new Vector<>();
        notas.add(13);
        notas.add(15);
        notas.add(11);
        notas.add(10);
        notas.add(19);
        System.out.println(notas);
        notas.remove(2);
        notas.remove(3);
        System.out.println(notas);
        System.out.println("Tamaño: "+ notas.size()+"; Capacidad: "+notas.capacity());
    }
}
