package com.example;

public class GestorFacturas {
    //atributos
    CalculatorService calcular;
    //constructor
    public GestorFacturas(CalculatorService calcular){
        System.out.println("Estoy en el constructor de GestorFactura");
        this.calcular=calcular;
    }
    //metodos ...
}
