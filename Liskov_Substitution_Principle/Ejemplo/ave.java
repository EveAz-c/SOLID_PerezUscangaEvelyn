package Liskov_Substitution_Principle.Ejemplo;

public class ave {
    String nombre;
    int edad;

    public ave(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String volar(){
        return "está volando";
    }
    
}
