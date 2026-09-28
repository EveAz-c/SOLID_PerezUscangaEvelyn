package Liskov_Substitution_Principle.Ejercicio3;

abstract class T{
    public String getName(){
        return "T";
    };
}
class S1 extends T{
    @Override 
    public String getName(){
        return "S1";
    }
}
class S2 extends T{
    @Override 
    public String getName(){
        return "S2";
    }
}
public class Main {
    public static void main(String[] args){
        T t = new S1();
        System.out.println(t.getName());
        T t2 = new S2();
        System.out.println(t2.getName());
    }
    
}
