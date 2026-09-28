package Liskov_Substitution_Principle.Ejercicio5;

public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobreGiro;
    private double tasaInteres;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro){
        super(numeroCuenta, saldoInicial);
        if (limiteSobregiro < 0){
            throw new IllegalArgumentException("El limite sobregiro no puede ser negativo");
        }
        this.limiteSobreGiro = limiteSobregiro;
        this.tasaInteres = 0.02;
    }
    @Override 
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if (cantidad > saldo + limiteSobreGiro){
            throw new IllegalArgumentException("La operación excede el limite sobregiro");
        }
        saldo -= cantidad;
    }
    @Override 
    public double calcularIntereses(){
        if (saldo < 0 ){
            double sobregiro = Math.abs(saldo);
            return sobregiro * 0.02;
        }
        return 0;
    }
    @Override 
    public void pagarDeuda(double cantidad){
        throw new UnsupportedOperationException("Una cuenta corrienta no puede realizar un pago de credito");
    }

    public double consultarSobregiroUtilizado(){
        if (saldo < 0){
            return Math.abs(saldo);
        }
        return 0;
    }
    public double getLimiteSobregiro(){
        return limiteSobreGiro;
    }

}
