package com.SpringEjercicio5.ejercicio5.controlador;

import com.SpringEjercicio5.ejercicio5.entidad.Laptop;
import com.SpringEjercicio5.ejercicio5.repositorio.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LaptopController {
    private LaptopRepository laptopRepositoryrepo;
    public LaptopController(LaptopRepository laptopRepositoryrepo){
        this.laptopRepositoryrepo=laptopRepositoryrepo;
    }
    @GetMapping("/api/laptops")
    public List<Laptop> findLaptops(){
        return laptopRepositoryrepo.findAll();
    }
    //Ejercicio 6
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepositoryrepo.save(laptop);
    }
}
