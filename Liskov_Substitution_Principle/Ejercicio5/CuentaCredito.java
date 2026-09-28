package Liskov_Substitution_Principle.Ejercicio5;

public class CuentaCredito extends CuentaBancaria {
    private double limiteCredito;
    private double deuda;
    private double tasaInteres;

    public CuentaCredito(String numeroCuenta, double limiteCredito){
        super(numeroCuenta, 0);
        if(limiteCredito <= 0){
            throw new IllegalArgumentException("Tu credito debe ser mayor a 0");
        }
        this.limiteCredito = limiteCredito;
        this.deuda = 0;
        this.tasaInteres = 0.03;
    }
    @Override 
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if (deuda + cantidad > limiteCredito){
            throw new IllegalArgumentException("La operación excede el limite de credito");
        }
        deuda -= cantidad;
    }
    @Override 
    public void depositar(double cantidad){
        validarCantidad(cantidad);
        if(deuda == 0 ){
            throw new IllegalArgumentException("No existe deuda que pagar");
        }
        if(cantidad > deuda){
            cantidad = deuda;
        }
        deuda -= cantidad;
    }
    public double consultarSaldo(){
        return limiteCredito - deuda;
    }
    public double calcularIntereses(){
        return deuda * tasaInteres;
    }
    @Override 
    public void pagarDeuda(double cantidad){
        validarCantidad(cantidad);
        if(deuda == 0){
            throw new IllegalArgumentException("No existe una deuda que pagar");
        }
        if (cantidad > deuda){
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
