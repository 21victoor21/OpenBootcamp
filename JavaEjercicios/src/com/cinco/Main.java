package com.cinco;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
        // (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y
        // el método pow de Math.
        System.out.println("El valor de PI es: "+Math.PI);
        double radio;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));
        double area = (Math.PI)*radio;
        JOptionPane.showMessageDialog(null,"El area del circulo es:"+area);
    }
}
