package Liskov_Substitution_Principle.Ejemplo;

public class Main {
    public static void main(String[] args) {
        ave Aguila = new aguila("Águila Real", 5);
        ave Pinguino = new pinguino("Pingüino Emperador", 3);

        System.out.println(Aguila.getNombre() + " " + Aguila.volar());
        System.out.println(Pinguino.getNombre() + " " + Pinguino.volar());
    }
}