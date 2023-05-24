package com.TemaDiez;

public class PreguntaUno {
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh"
    public static void main(String[] args) {
        String text = "hola mundo";
        String invertido = "";
        for(int i = text.length()-1;i>=0;i--){
            invertido=invertido+text.charAt(i);
        }
        System.out.println(invertido);
    }
}
