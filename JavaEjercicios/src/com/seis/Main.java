package com.seis;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
        // Si no lo es, también debemos indicarlo.
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para determinar si es divisible entre 2"));
        if(num%2>0){
            System.out.println("El numero no es divisible entre 2");
        }else{
            System.out.println("El numero si es divisible entre 2");
        }

    }
}
