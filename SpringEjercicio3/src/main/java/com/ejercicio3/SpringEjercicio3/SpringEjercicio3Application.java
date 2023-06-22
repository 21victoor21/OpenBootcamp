package com.ejercicio3.SpringEjercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEjercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringEjercicio3Application.class, args);
		PersonaRepository repo = context.getBean(PersonaRepository.class);

		//creamos y almacenamos una persona en BD
		Persona humano1 = new Persona(null,"Victor","Gonzales",31);
		Persona humano2 = new Persona(null,"Melarry","Gonzales",19);
		Persona humano3 = new Persona(null,"Maruja","Contreras",53);

		repo.save(humano1);
		repo.save(humano2);
		repo.save(humano3);

		System.out.println("La cantidad de personas registradas es: "+repo.count());
		System.out.println(repo.findAll());
	}

}
