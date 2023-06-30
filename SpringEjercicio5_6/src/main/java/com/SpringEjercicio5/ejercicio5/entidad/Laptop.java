package com.SpringEjercicio5.ejercicio5.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private int costo;

    public Laptop(){

    }
    public Laptop(Long id, String marca, int costo){
        this.id=id;
        this.marca=marca;
        this.costo=costo;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public int getCosto(){
        return costo;
    }
    public void setCosto(){
        this.costo=costo;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                '}';
    }
}
