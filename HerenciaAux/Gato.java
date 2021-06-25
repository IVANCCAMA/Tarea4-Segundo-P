
public class Gato extends Animal{
    private double tamanio;
    public Gato(String nombre, int edad, double tamanio){
        super(nombre,edad);
        this.tamanio = tamanio;
    }
    public double getTamanio(){
        return tamanio;
    }
}
