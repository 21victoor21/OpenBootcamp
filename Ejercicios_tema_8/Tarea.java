public class Tarea{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("Victor");
        persona.setTelefono(991925033);
        System.out.println(persona.getEdad()+ " " + "años");
        System.out.println(persona.getNombre()); 
        System.out.println(persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}