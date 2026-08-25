package Ejercicio2;
public class Lampara implements ActivarPorRedstone {
	private boolean activado;
	
	public Lampara() {
		this.activado = false;
	}
	
	@Override
	public void activar() {
		this.activado = true;
		System.out.println("Lampara activada se enciende e ilumina");
	}
	
	@Override
	public void desactivar() {
		this.activado = false;
		System.out.println("Lampara se apaga");
	}
}