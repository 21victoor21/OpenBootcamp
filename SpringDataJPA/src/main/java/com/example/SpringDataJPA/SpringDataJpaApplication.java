package com.example.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);
		System.out.println("fin");
		//System.out.println(repository.count());
		//creamos y almacenamos un coche en BD.
		Coche toyota = new Coche(null,"toyota","Prius",2010);
		//guardamos los datos del carro
		repository.save(toyota);
		System.out.println("La cantidad de registros en la base de datos es:"+repository.count());
		//mostramos los datos de la BD
		System.out.println(repository.findAll());
	}

}
