package com.example;

import org.springframework.stereotype.Component;
@Component
public class CalculatorService {
    public CalculatorService(){

        System.out.println("Se esta ejeutando el constructor de la clase CalculatorService");
    }
    public String Mensaje(){

        return "Hola Mundo";
    }
}
