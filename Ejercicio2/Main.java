package Ejercicio2;
public class Main{
	public static void main(String[] args) {
		
	Piston miPiston = new Piston();
	Puerta miPuerta = new Puerta();
	Lampara miLampara = new Lampara();
	BloqueMusical miBloqueMusical = new bloqueMusical();
	
	System.out.println("Se activa la palanca");
	miPiston.activar();
	miPuerta.activar();
	miLampara.activar();
	miBloqueMusical.activar();

	System.out.println("Se desactiva la palanca");
	miPiston.desactivar();
	miPuerta.desactivar();
	miLampara.desactivar();
	miBloqueMusical.desactivar();

	Zombie miZombie = new Zombie();
	Esqueleto miEsqueleto = new Esqueleto();


	miZombie.atacar();
	miEsqueleto.atacar();
	}