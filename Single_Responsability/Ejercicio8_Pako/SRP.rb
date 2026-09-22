class jugador
    attr_accesor: nombre, :puntos, :vidas

    def initialize(nombre)
        @nombre = nombre
        @puntos = 0
        @vidas = 3
    end
end
class monedaMutante
    def recolectar(jugador)
        jugador.puntos += 100
        puts "Marcador: #{jugador.nombre}"
        
        puts "'ding.mp3'"
    end
end
class GoombaMutante
    def atacar(jugador)
        jugador.vidas -= 1
        puts "Daño recibido: 1. Vidas restantes: #{jugador.vidas}"
        puts "'ouch.mp3'"
        
        if jugador.vidas <= 0
            puts "'game_over.mp3'"
            puts "game over. mario fue aplastado"
        end
    end
end
mario = jugador.new("Mario")
moneda = monedaMutante.new
goomba = GoombaMutante.new

puts "--Iniciando nivel 1-1--"
puts "Mario tiene #{mario.vidas}"
moneda.recolectar(mario)

print "¿Cuantos goombas emboscan a mario de golpe?"
cantidad_goombas = gets.chomp.to_i

cantidad_goombas.times do
    goomba.atacar(mario)
end

