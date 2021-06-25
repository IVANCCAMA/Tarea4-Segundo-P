
public class Leon extends Animal{
    private String hubicacion;
    public Leon(String nombre, int edad, String hubicacion){
        super(nombre, edad);
        this.hubicacion = hubicacion;
    }
    public String getHubicacion(){
        return hubicacion;
    }
}
