package Liskov_Substitution_Principle.Ejercicio6;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria (String numeroCuenta, double saldoInicial){
        if (saldo < 0){
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad){
        validarCantidad(cantidad);
        saldo += cantidad;
    }
    public abstract void retirar(double cantidad);
    public double consultarSaldo(){
        return saldo;
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public abstract double calcularIntereses();
    protected void validarCantidad(double cantidad){
        if(cantidad < 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
    }
    
}
