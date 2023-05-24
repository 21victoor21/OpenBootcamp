package com.TemaDiez;

import java.io.*;

public class PreguntaNueve {
    public static void main(String[] args) {
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
        // "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
        // dado en el parámetro "fileIn" al fichero dado en "fileOut".

        CopiarArchivo("C:/Users/VICTOR/Desktop/CursoJava/tex.txt","C:/Users/VICTOR/Desktop/CursoJava/copiatex.txt");
    }
    static void CopiarArchivo(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            try {
                byte[] datos = in.readAllBytes();
                in.close();
                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}




