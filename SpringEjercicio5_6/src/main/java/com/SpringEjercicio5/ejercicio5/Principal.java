package com.SpringEjercicio5.ejercicio5;

import com.SpringEjercicio5.ejercicio5.entidad.Laptop;
import com.SpringEjercicio5.ejercicio5.repositorio.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Principal.class, args);
		LaptopRepository repo = context.getBean(LaptopRepository.class);
		Laptop lap1 = new Laptop(null,"Lenovo",2500);
		Laptop lap2 = new Laptop(null,"Sony",4500);
		Laptop lap3 = new Laptop(null,"Asus",3200);
		Laptop lap4 = new Laptop(null,"HP",2000);
		Laptop lap5 = new Laptop(null,"Dell",1500);
		repo.save(lap1);
		repo.save(lap2);
		repo.save(lap3);
		repo.save(lap4);
		repo.save(lap5);
		System.out.println("Datos de la laptop: "+repo.findAll());
	}

}
