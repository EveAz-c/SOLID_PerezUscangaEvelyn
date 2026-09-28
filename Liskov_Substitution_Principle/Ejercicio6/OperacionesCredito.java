package Liskov_Substitution_Principle.Ejercicio6;

/**
 * OperacionesCredito
 */
public interface OperacionesCredito {
    void pagarDeuda(double cantidad);
    double consultarDeuda();
    double consultarCreditoDisponible();
    
}
