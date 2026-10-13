package Factory.Bad;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        int opcion = -1;

        while(opcion != 0) {
            System.out.println("Bienvenido . Elige el nivel al que deseas jugar:");
            System.out.println("1. Bosque oscuro (Lobo)");  
            System.out.println("2. Castillo embrujado (Esqueleto)");
            System.out.println("3. Volcán Infernal (Dragon)");
            System.out.println("0. Salir");
            System.out.print("Ingresa tu opción: ");    
            opcion = sc.nextInt();

            if(option )

            opcion = scanner.nextInt();

            Enemigo enemigo = null;

            switch(opcion) {
                case 1:
                    enemigo = new Lobo();
                    break;
                case 2:
                    enemigo = new Esqueleto();
                    break;
                case 3:
                    enemigo = new Dragon();
                    break;
                case 0:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intenta de nuevo.");
            }

            if(enemigo != null) {
                System.out.println("Has elegido luchar contra: " + enemigo.getNombre());
                enemigo.atacar();
                // Aquí podrías agregar más lógica de combate
            }
        }


}
