package com.ejercicio3.SpringEjercicio3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    //constructor
    public Persona(){

    }
    public Persona(Long id, String nombre, String apellido, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    //to string

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
