package com.TemaDiez;

public class PreguntaOcho {
    public static void main(String[] args) {
        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        //ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
        //la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
        //"Demo de código".

        DividePorCero(10, 0);
    }

    static void DividePorCero(int numerador, int denominador) {
        double resultado;
        try {
            resultado = numerador / denominador;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse por la siguiente razón: "+ e.getClass());
        }
    }
    }

