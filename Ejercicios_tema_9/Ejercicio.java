public class Ejercicio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador =new Trabajador();
        cliente.setNombre("Victor");
        cliente.setEdad(24);
        cliente.setTelefono(991925033);
        cliente.setCredito(1500);
        trabajador.setNombre("Raul");
        trabajador.setEdad(34);
        trabajador.setTelefono(991925036);
        trabajador.setSalario(2000);

        cliente.MostrarDatoC();
        System.out.println(" ");
        trabajador.MostrarDatoT();
        
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad (int edad){
        this.edad=edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona{
    private int credito;
    public void setCredito( int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return this.credito;
    }
    public void MostrarDatoC(){
        System.out.println("Datos del Cliente");
        System.out.println("Nombre:"+" "+getNombre());
        System.out.println("Edad:"+" "+getEdad()+" "+"años");
        System.out.println("Telefono:"+" "+getTelefono());
        System.out.println("Credito:"+" "+getCredito());
    }

}
class Trabajador extends Persona{
    private int salario;
    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }
    public void MostrarDatoT(){
        System.out.println("Datos del Trabajador");
        System.out.println("Nombre:"+" "+getNombre());
        System.out.println("Edad:"+" "+getEdad()+" "+"años");
        System.out.println("Telefono:"+" "+getTelefono());
        System.out.println("Salario:"+" "+getSalario());
    }
}
