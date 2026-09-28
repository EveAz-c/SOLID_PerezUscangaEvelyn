package Liskov_Substitution_Principle.Ejercicio1;

public class Main {
    public static void main(String[] args){

        T t = new S1();
        System.out.println(t.getName());
        T t2 = new S2();
        System.out.println(t2.getName());
    }
    
}
