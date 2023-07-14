package com.cuatro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Modifica la aplicación anterior,
        // para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane)
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingresa un nombre:");
        System.out.println("Bienvenido "+nombre);
    }
}
