package Liskov_Substitution_Principle.Ejercicio4;

class Cliente{
    private String nombre;
    private CuentaBancaria cuenta;

    public Cliente (String nombre, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    public void consultarCuenta(){

    }

}
class CuentaBancaria{
    protected double saldo;
    
    public CuentaBancaria (double saldoInicial){
        this.saldo = saldoInicial;
    }
    public void depositar (double cantidad){
        saldo += cantidad;
    }
    public void retirar (double cantidad){
        saldo -= cantidad;
    }
    public double consultarSaldo(){
        return saldo;
    }
    public double calcularIntereses(){
        return saldo * 1.1;
    }
    public void solicitarCredito(){
        System.out.println("Solicitud de credito procesada");
    }
}

class CuentaAhorro extends CuentaBancaria{
    public CuentaAhorro(double saldoInicial){
        super(saldoInicial);
    }
    @Override 
    public double calcularIntereses(){
        return saldo * 1.1;
    }

}
class cuentaCorriente extends CuentaBancaria{
    public cuentaCorriente(double saldoInicial){
        super(saldoInicial);
    }
    @Override 
    public double calcularIntereses(){
        return saldo * 1.1;
    }

}
class cuentaCredito extends CuentaAhorro{
    private double limiteCredito;

    public cuentaCredito (double saldoInicial, double limiteCredito){
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }
    @Override 
    public double calcularIntereses(){
        return saldo * 1.1;
    }
    @Override 
    public void retirar(double cantidad){
        saldo -= cantidad;
    }

}

public class Main {
    public static void main(String[] args){
        CuentaAhorro ahorro = new

    }
}
