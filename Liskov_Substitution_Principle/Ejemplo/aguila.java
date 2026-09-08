package Liskov_Substitution_Principle.Ejemplo;

public class aguila extends ave{
    public aguila(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    public String volar(){
        return "está volando";
    }
    
}
