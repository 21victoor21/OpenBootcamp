package com.example.SpringDataJPA;

import jakarta.persistence.*;

//convertir en "identidad" con @Entity - para que se pueda
//almacenar en una BD
@Entity
@Table(name="COCHE")
public class Coche {
    //atributos encapsulados
    //indicamos que es una tabla con @Id
    //Sprig JPA es una especificacion para el
    //acceso de BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufactura;
    private String modelo;
    private Integer year;

    //constuctor
    public Coche(){
    }

    public Coche(Long id, String manufactura, String modelo, Integer year) {
        this.id = id;
        this.manufactura = manufactura;
        this.modelo = modelo;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufactura() {
        return manufactura;
    }

    public void setManufactura(String manufactura) {
        this.manufactura = manufactura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    //meotodo tostring

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufactura='" + manufactura + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
