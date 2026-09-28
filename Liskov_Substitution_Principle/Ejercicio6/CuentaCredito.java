package Liskov_Substitution_Principle.Ejercicio6;

public class CuentaCredito extends CuentaBancaria implements OperacionesCredito{
    private double limiteCredito;
    private double deuda;
    private double tasaInteres;

    public CuentaCredito(String numeroCuenta, double limiteCredito){
        super(numeroCuenta, limiteCredito);
        if (limiteCredito < 0){
            throw new IllegalArgumentException("El limite debe ser mayor a 0");
        }
        this.limiteCredito = limiteCredito;
        this.deuda = 0;
        this.tasaInteres = 0.03;
    }
    @Override 
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if (deuda + cantidad > limiteCredito){
            throw new IllegalArgumentException("La operacion excede el limite");
        }
        deuda += cantidad;
    }
    @Override 
    public void depositar(double cantidad){
        pagarDeuda(cantidad);
    }
    @Override 
    public double consultarSaldo(){
        return limiteCredito - saldo;
    }
    @Override 
    public double calcularIntereses(){
        if(deuda == 0){
            return 0;
        }
        return deuda * tasaInteres;
    }
    @Override 
    public void pagarDeuda(double cantidad){
        if (deuda == 0){
            throw new IllegalArgumentException("No exite una deuda pendiente");
        }
        if(cantidad > deuda){
            cantidad = deuda;
        }
        deuda -= cantidad;
    }
    public double consultarDeuda(){
        return deuda;
    }
    public double consultarCreditoDisponible(){
        return limiteCredito - deuda;
    }
}
