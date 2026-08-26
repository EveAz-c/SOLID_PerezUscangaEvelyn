from abc import ABC, abstractmethod
class Personaje(ABC):
    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida
        
        def recibir_danio(self, cantidad):
            self.vida -= cantidad
            print("recibe {cantidad} de daño, vida restante: {self.vida}")
    
    @abstractmethod
    def atacar(self):
        pass
    
class ICurable(ABC):
    @abstractmethod
    def curar(self, objetivo):
        pass

class Guerrero(Personaje):
   def atacar(self):
       print(f"{self.nombre} ataca con su espada")

class Mago(Personaje):
    def atacar(self):
        print(f"{self.nombre} lanza un hechizo mágico")

class Soporte(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con su bastón mágico")
    
    def curar(self, objetivo):
            objetivo.vida += 10
            print(f"{self.nombre} cura a {objetivo.nombre}")

    guerrero = Guerrero("Guerrero1", 100)
    mago = Mago("Mago1", 60)
    soporte = Soporte("Soporte1", 90)

    guerrero.atacar()
    mago.atacar()
    soporte.atacar()

    guerrero.recibir_danio(30)
    mago.curar(guerrero)
    soporte.curar(guerrero)

    print(f"Vida final de {guerrero.nombre}: {guerrero.vida}")
