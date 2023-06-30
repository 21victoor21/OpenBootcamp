package com.SpringEjercicio5.ejercicio5.repositorio;

import com.SpringEjercicio5.ejercicio5.entidad.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
