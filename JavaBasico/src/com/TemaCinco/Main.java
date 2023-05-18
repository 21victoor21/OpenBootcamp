package com.TemaCinco;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl cochecrud = new CocheCRUDImpl();
        cochecrud.save();
        cochecrud.findAll();
        cochecrud.delete();
    }

}
