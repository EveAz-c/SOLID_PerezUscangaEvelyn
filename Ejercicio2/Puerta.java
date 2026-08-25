package Ejercicio2;
public class Puerta implements ActivarPorRedstone {
	private boolean activado;
	
	public Puerta() {
		this.activado = false;
	}
	
	@Override
	public void activar() {
		this.activado = true;
		System.out.println("Puerta activada y se abre");
	}
	
	@Override
	public void desactivar() {
		this.activado = false;
		System.out.println("Puerta desactivada y se cierra");
	}
}