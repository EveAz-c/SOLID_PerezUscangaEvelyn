package Liskov_Substitution_Principle.Ejercicio5;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;
    
    public CuentaAhorro(String numeroCuenta, double saldoInicial){
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = 0.05;
    }
    @Override 
    public double calcularIntereses(){
        return saldo * tasaInteres;
    }
    @Override 
    public void pagarDeuda(double cantidad){
        throw new UnsupportedOperationException("No se puede pagar deuda");
    }   
}
