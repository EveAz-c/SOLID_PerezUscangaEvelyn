abstract class Personaje {
public string nombre {get; private set;}
public int Vida {get; protected sset;}
public boolean EstadoVida {get{return PuntosVida}}

public Personaje (string nombre){
Nombre= nombre;
PuntosVida = 100;
}

public void RecibirDano (int cantidad){
PuntosVida -= cantidad;
	if (PuntosVida < 0) PuntosVida = 0;
	System.Console.WriteLine($"{Nombre}