package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    //Atributos
    NotificationService NotService;
    //Constructor
    public UserService(NotificationService NotService){
        this.NotService = NotService;

    }
}
