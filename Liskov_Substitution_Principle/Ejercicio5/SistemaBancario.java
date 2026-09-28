package Liskov_Substitution_Principle.Ejercicio5;

public class SistemaBancario {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     BANCO - LSP NO CUMPLE");
        System.out.println("================================");

        CuentaBancaria ahorro =
            new CuentaAhorro(
                "AH-001",
                10000
            );

        CuentaBancaria corriente =
            new CuentaCorriente(
                "CO-001",
                5000,
                2000
            );

        CuentaBancaria credito =
            new CuentaCredito(
                "CR-001",
                15000
            );

        Cliente cliente1 =
            new Cliente(
                "Ana",
                "CLI-001",
                ahorro
            );

        Cliente cliente2 =
            new Cliente(
                "Luis",
                "CLI-002",
                corriente
            );

        Cliente cliente3 =
            new Cliente(
                "Sofia",
                "CLI-003",
                credito
            );


        // -----------------------------
        // CUENTA DE AHORRO
        // -----------------------------

        cliente1.mostrarInformacion();

        cliente1.depositar(2000);
        cliente1.retirar(1000);

        System.out.println(
            "Intereses: $" +
            cliente1.calcularIntereses()
        );


        // -----------------------------
        // CUENTA CORRIENTE
        // -----------------------------

        cliente2.mostrarInformacion();

        cliente2.retirar(6000);

        System.out.println(
            "Saldo después del retiro: $" +
            cliente2.consultarSaldo()
        );

        System.out.println(
            "Intereses por sobregiro: $" +
            cliente2.calcularIntereses()
        );


        // -----------------------------
        // CUENTA DE CRÉDITO
        // -----------------------------

        cliente3.mostrarInformacion();

        cliente3.retirar(5000);

        System.out.println(
            "Deuda: $" +
            ((CuentaCredito) credito).consultarDeuda()
        );

        System.out.println(
            "Intereses: $" +
            cliente3.calcularIntereses()
        );


        // -----------------------------
        // DEMOSTRACIÓN DE LSP
        // -----------------------------

        System.out.println(
            "\n--- PRUEBA DE SUSTITUCIÓN ---"
        );

        CuentaBancaria cuenta =
            new CuentaAhorro(
                "AH-002",
                5000
            );

        try {

            /*
             * Java permite esta operación porque
             * CuentaAhorro es CuentaBancaria.
             *
             * Sin embargo, el comportamiento falla.
             */
            cuenta.pagarDeuda(1000);

        } catch (UnsupportedOperationException e) {

            System.out.println(
                "LSP VIOLADO: " +
                e.getMessage()
            );
        }
    }
}