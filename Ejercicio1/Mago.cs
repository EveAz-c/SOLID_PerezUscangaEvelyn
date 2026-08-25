class Mago : Persona
{
    public Mago (string nombre) : base(nombre)
    {

    }
    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} ataca con la espada "
    }
}