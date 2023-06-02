package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1 forma con clase sin parametros
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calc = (CalculatorService) context.getBean("calculatorServices");
        String texto = calc.Mensaje();
        System.out.println(texto);
        //2 forma con clases con parametros - cargas un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calcular.Mensaje());
        //3 Scope o alcance.
        /* los beans por defecto son singleton, se crea el objeto y se usa para toda la aplicacion
        podemos cambiarlo a scope = "prototype" si queremos que se cree un nuevo objeto cada vez.
        Se verifica viendo como se ejecuta varias veces el constructor.
        */
    }
}
