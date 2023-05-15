package com.TemaDos;

public class Tarea {
public static void main(String[] args){
    double resultado = PrecioIva(10.5);
    System.out.println("El precio del producto + iva es: "+resultado);

}

    private static double PrecioIva(double precio) {
        double iva = precio*0.21;
        return precio+iva;
    }

}
