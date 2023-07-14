package com.uno;

public class Main {
    public static void main(String[] args){
        //Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
        // multiplicación, división y módulo (resto de la división)
        int num1 = 100;
        int num2 = 30;
        double suma = num1+num2;
        double resta = num1-num2;
        double mult = num1*num2;
        double div = num1/num2;
        double resto = (num1/num2)%2;
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+mult);
        System.out.println("la division es: "+div);
        System.out.println("el resto es: "+resto);

    }
}
