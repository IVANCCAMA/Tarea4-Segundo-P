
public class Animal{
    private String nombre;
    private boolean domestico;
    private int edad;
    public Animal(String mombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.domestico = domestico;
    }
    
    public boolean domestico(){
        return domestico;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
}
