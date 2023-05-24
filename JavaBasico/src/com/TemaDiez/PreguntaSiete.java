package com.TemaDiez;

import java.util.ArrayList;

public class PreguntaSiete {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo int, y,
        //utilizando un bucle rellénalo con elementos 1..10.
        //A continuación, con otro bucle, recórrelo y elimina
        //los numeros pares. Por último, vuelve a recorrerlo y
        //muestra el ArrayList final. Si te atreves, puedes hacerlo
        //en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            numeros.add(i,i+1);
            System.out.println("posicion["+i+"], tiene el valor: "+numeros.get(i));
        }
        for(int i=0; i<numeros.size(); i++){
            if(numeros.get(i)%2==0){
                numeros.remove(i);
            }
        }
        for(int i=0; i<numeros.size();i++){
            System.out.println("Despues de eliminar los valores pares, nos queda la posicion ["+i+"] con el valor: "+numeros.get(i));
        }
    }
}
