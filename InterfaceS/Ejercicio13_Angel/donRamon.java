package InterfaceS.Ejercicio13_Angel;

public class donRamon implements  AccionesPersonaje {
    private final String nombre = "Don Ramon";

    @Override 
    public void darGolpe(){
        System.out.println(nombre + ": Toma!, toma!");
    }
    @Override 
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre + "Nunca paga renta");
    }
    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException("No es el dueño de la vencidad");
    }
    @Override 
    public void jugar(){
        throw new UnsupportedOperationException("No juega nada");
    }
    @Override 
    public void llorar(){
        throw new UnsupportedOperationException("No juega a llorar");
    }
    
    
}
