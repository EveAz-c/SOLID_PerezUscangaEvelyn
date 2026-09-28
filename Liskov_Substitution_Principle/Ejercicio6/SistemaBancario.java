package Liskov_Substitution_Principle.Ejercicio6;

public class SistemaBancario {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       BANCO - LSP CUMPLE");
        System.out.println("================================");


        /*
         * Todas pueden almacenarse como
         * CuentaBancaria.
         */

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


        // =================================
        // CUENTA DE AHORRO
        // =================================

        cliente1.mostrarInformacion();

        cliente1.depositar(2000);
        cliente1.retirar(1000);

        System.out.println(
            "Intereses: $" +
            String.format(
                "%.2f",
                cliente1.calcularIntereses()
            )
        );


        // =================================
        // CUENTA CORRIENTE
        // =================================

        cliente2.mostrarInformacion();

        cliente2.retirar(6000);

        System.out.println(
            "Saldo después del retiro: $" +
            String.format(
                "%.2f",
                cliente2.consultarSaldo()
            )
        );

        System.out.println(
            "Intereses por sobregiro: $" +
            String.format(
                "%.2f",
                cliente2.calcularIntereses()
            )
        );


        // =================================
        // CUENTA DE CRÉDITO
        // =================================

        cliente3.mostrarInformacion();

        cliente3.retirar(5000);

        System.out.println(
            "Deuda: $" +
            String.format(
                "%.2f",
                ((CuentaCredito) credito)
                    .consultarDeuda()
            )
        );

        System.out.println(
            "Intereses: $" +
            String.format(
                "%.2f",
                cliente3.calcularIntereses()
            )
        );


        // =================================
        // PRUEBA DIRECTA DE LSP
        // =================================

        System.out.println(
            "\n--- PRUEBA DE SUSTITUCIÓN ---"
        );

        probarCuenta(ahorro);
        probarCuenta(corriente);
        probarCuenta(credito);
    }


    /*
     * Este método recibe CuentaBancaria,
     * pero puede trabajar con cualquier subtipo.
     */
    public static void probarCuenta(
            CuentaBancaria cuenta) {

        System.out.println(
            "\nCuenta: " +
            cuenta.getNumeroCuenta()
        );

        cuenta.depositar(500);

        System.out.println(
            "Saldo después de depositar: $" +
            String.format(
                "%.2f",
                cuenta.consultarSaldo()
            )
        );

        double intereses =
            cuenta.calcularIntereses();

        System.out.println(
            "Intereses: $" +
            String.format(
                "%.2f",
                intereses
            )
        );
    }
}