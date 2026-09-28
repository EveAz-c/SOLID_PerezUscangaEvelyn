package Liskov_Substitution_Principle.Ejercicio5;

public class CuentaBancaria {

    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {

        if (saldoInicial < 0) {
            throw new IllegalArgumentException(
                "El saldo inicial no puede ser negativo."
            );
        }

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {

        validarCantidad(cantidad);

        saldo += cantidad;
    }

    public void retirar(double cantidad) {

        validarCantidad(cantidad);

        if (cantidad > saldo) {
            throw new IllegalArgumentException(
                "Saldo insuficiente."
            );
        }

        saldo -= cantidad;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /*
     * Todas las cuentas supuestamente calculan intereses.
     */
    public double calcularIntereses() {

        return saldo * 0.05;
    }

    /*
     * PROBLEMA DE LSP:
     * Se supone que cualquier CuentaBancaria puede
     * pagar una deuda.
     */
    public void pagarDeuda(double cantidad) {

        throw new UnsupportedOperationException(
            "Esta cuenta no tiene una deuda de crédito."
        );
    }

    protected void validarCantidad(double cantidad) {

        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad debe ser mayor que cero."
            );
        }
    }
}
