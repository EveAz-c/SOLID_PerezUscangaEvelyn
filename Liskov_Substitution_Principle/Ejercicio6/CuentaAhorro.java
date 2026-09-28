package Liskov_Substitution_Principle.Ejercicio6;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldoInicial){
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = 0.05;
    }
    @Override 
    public void retirar (double cantidad){
        validarCantidad(cantidad);
        if(saldo < cantidad){
            throw new IllegalArgumentException("La operacion excedio el limite");
        }
        saldo -= cantidad;
    }
    @Override 
    public double calcularIntereses(){
        return saldo * tasaInteres;
    }
}
