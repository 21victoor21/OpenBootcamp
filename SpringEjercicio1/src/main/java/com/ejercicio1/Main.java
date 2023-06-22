package com.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo mensaje = (Saludo)context.getBean("sld");
        String texto = mensaje.imprimirSaludo();
        System.out.println(texto);

    }
}
