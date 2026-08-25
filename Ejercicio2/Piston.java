package Ejercicio2;
public class Piston implements ActivarPorRedstone {
	private boolean activado;
	
	public Piston() {
		this.activado = false;
	}
	
	@Override
	public void activar() {
		this.activado = true;
		System.out.println("Piston activado y empuja bloque");
	}
	
	@Override
	public void desactivar() {
		this.activado = false;
		System.out.println("Piston desactivado y deja de empujar bloque");
	}
}