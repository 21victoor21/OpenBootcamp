public class SegundaParte{
    public static void main(String[] args){
        coche micoche = new coche();
        micoche.AumentarPuerta();
        System.out.println("La cantidad de puertas actual es: " + micoche.puertas);
    }
}

class coche {
    int puertas =2; //minimo numero de puertas de un coche

    public void AumentarPuerta() {
        this.puertas++;

    }

}