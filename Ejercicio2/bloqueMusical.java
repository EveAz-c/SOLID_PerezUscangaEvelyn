package Ejercicio2;
public class bloqueMusical implements ActivarPorRedstone {
	private boolean activado;
	
	public bloqueMusical() {
		this.activado = false;
	}
	
	@Override
	public void activar() {
		this.activado = true;
		System.out.println("El bloque musical está activado.");
	}
	
	@Override
	public void desactivar() {
		this.activado = false;
		System.out.println("El bloque musical está desactivado.");
	}
	
	public boolean isActivado() {
		return activado;
	}
}