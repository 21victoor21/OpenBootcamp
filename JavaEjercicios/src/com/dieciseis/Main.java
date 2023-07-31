package com.dieciseis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escribe una aplicación con un String que contenga una contraseña cualquiera.
        // Después se te pedirá que introduzcas la contraseña, con 3 intentos.
        // Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
        // «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale,
        // aunque le queden intentos).
        Scanner s = new Scanner(System.in);
        String pass = "Curso123";
        int intento=1;
        do{
            System.out.println("Ingrese su contraseña:");
            String dato = s.nextLine();
            if(!dato.equals(pass) && intento<4){
            }else if(dato.equals(pass)){
                System.out.println("Bienvenido");
                break;
            }
            intento++;
        }while(intento<=3);


    }
}
