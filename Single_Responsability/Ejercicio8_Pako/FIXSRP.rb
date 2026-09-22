class jugador
    attr_accessor :nombre, :puntos, :vidas

    def initialize(nombre)
        @nombre = nombre
        @puntos = puntos
        @vidas = vidas
    end
end
class moneda
    def valor_puntos; 100; end
end
class Goomba
    def dano_ataque; 1; end
end
class SistemaAudio
    def reproducir(evento)
        sonidos ={
            moneda: "'ding.mp3'",
            dano: "'ouch.mp3",
            game_over: "'game_over.mp3"
        }
        puts sonidos[evento]
    end
end
class SistemaDePuntuacion
    def sumar_puntos(jugador, cantidad)
        jugador.puntos += cantidad
        puts "[+#{cantidad} pts Marcador: #{jugador.puntos}]"
    end
end
class SistemaDeSalud
    def recibido_dano(jugador, cantidad)
        return if cantidad <= 0

        jugador.vidas -= cantidad
        jugador.vidas = 0 if jugador.vidas < 0

        puts "Daño recibido: #{cantidad}. Vidas restantes: #{jugador.vidas}"
    end
end
mario = jugador.new("Mario")
audio = SistemaDeAudio.new
marcador = SistemaDePuntuacion.new
salud = SistemaDeSalus.new
moneda = Moneda.new
goomba = Goomba.new
puts "--- INICIA NIVEL 1-1 ---"
marcador.sumar_puntos(mario, moneda.valor_puntos)
audio.reproducir(:moneda)

print "¿Cuantos Goombas balean a Mario de golpe?:"
cantidad_goombas = gets.chomp.to_i

if cantidad_goombas < 0 
    puts "¿Goombas negativos? Mejor digamos que lo atacaron 0 Goombas"
    cantidad_goombas = 0
end
puts "#{cantidad_goombas} Goombas atacan al mismo tiempo!"
dano_total = goombas.dano_ataque*cantidad_goombas

if cantidad_goombas > 0
    audio.reproducir(:dano)
    salud.recibir_dano(mario, dano_total)
end
puts "---Resultado Final"
if mario.vida <= 0
    auto.reproducir(:game_over)
    puts"GG. Game Over, mario fue aplastado"
else
    puts "Mario sobrevivio"
end
    