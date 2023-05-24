package com.TemaDiez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreguntaDiez {
    public static void main(String[] args) {
        //Sorpréndenos creando un programa de tu elección que utilice
        // InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        try {
            BufferedReader leerDato = new BufferedReader(new InputStreamReader(System.in));
            PrintStream imprimeDato = System.out;

            Map<String, Integer> datoMap = new HashMap<>();
            List<Integer> datoList = new ArrayList<>();

            imprimeDato.println("Ingresa el nombre del Usuario:");
            String nombre = leerDato.readLine();

            imprimeDato.println("Ingrese la edad del Usuario:");
            int edad = Integer.parseInt(leerDato.readLine());

            datoMap.put(nombre, edad);
            datoList.add(edad);

            imprimeDato.println("Valores ingresados al HashMap:");
            for (Map.Entry<String, Integer> datos : datoMap.entrySet()) {
                imprimeDato.println(datos.getKey() + " : " + datos.getValue());
            }
            imprimeDato.println("Valores ingresados al ArrayList:");
            for (Integer lista : datoList) {
                imprimeDato.println(lista);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

}


