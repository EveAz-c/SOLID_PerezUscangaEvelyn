package Liskov_Substitution_Principle.Ejercicio5;

public class Cliente {

    private String nombre;
    private String identificacion;
    private CuentaBancaria cuenta;

    public Cliente(
            String nombre,
            String identificacion,
            CuentaBancaria cuenta) {

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void depositar(double cantidad) {

        cuenta.depositar(cantidad);
    }

    public void retirar(double cantidad) {

        cuenta.retirar(cantidad);
    }

    public double consultarSaldo() {

        return cuenta.consultarSaldo();
    }

    public double calcularIntereses() {
        return cuenta.calcularIntereses();
    }

    public void pagarDeuda(double cantidad) {

        cuenta.pagarDeuda(cantidad);
    }

    public void mostrarInformacion() {

        System.out.println("\n--- INFORMACIÓN DEL CLIENTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println(
            "Cuenta: " +
            cuenta.getNumeroCuenta()
        );
        System.out.println(
            "Saldo: $" +
            String.format("%.2f", consultarSaldo())
        );
    }
}