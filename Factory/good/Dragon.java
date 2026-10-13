package Factory.Bad;

public class Dragon extends Enemigo {
    public Dragon() {
        super("Dragon", 1000, 300);
    }

    @Override
    public void atacar() {
        System.out.println("El dragon lanza fuego y te quita " + this.ataque + " de vida.");
    }
    
}
