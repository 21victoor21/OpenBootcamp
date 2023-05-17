package com.TemaCuatro;

public class SmartWatch extends SmartDevice{
    String colorcorrea;
    public SmartWatch(){

    }

    public SmartWatch(String marca, String color, int fabricacion, double precio, String colorcorrea) {
        super(marca, color, fabricacion, precio);
        this.colorcorrea = colorcorrea;
    }

}
