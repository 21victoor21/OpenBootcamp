package com.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificationService = (NotificationService) context.getBean(NotificationService.class);
        String mensaje = notificationService.Saludo();

        System.out.println(mensaje);

        UserService gestor = (UserService) context.getBean(UserService.class);
        System.out.println(gestor.NotService.Saludo());

    }
}
