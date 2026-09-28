package OpenClose.Ejercicio11_Justin;

public class Caja {
    public double calcularPrecio(String tipoBebida, double monto){
        if(tipoBebida.equals("agua")){
            return precioBebida;
        } else if (tipoBebida.equals("refresco")){
            return precioBebida * 1.16;
        } else if (tipoBebida.equals("cerveza")){
            return precioBebida * 1.16 *1.25;
        } else if(tipoBebida.equals("tepache")){
            return precioBebida * 1.16;
        }
    }
    
}
