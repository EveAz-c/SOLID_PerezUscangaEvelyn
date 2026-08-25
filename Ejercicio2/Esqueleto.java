package Ejercicio2;
public class Esqueleto extends MobHostil {

	public Esqueleto(){
		super("Esqueleto", 20);
	}
	
	@Override
	public void atacar() {
		System.out.println("El esqueleto dispara una flecha hacia ti.");
	}
}