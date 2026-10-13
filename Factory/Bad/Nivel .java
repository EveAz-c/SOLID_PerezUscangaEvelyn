package Factory.Bad;

public class Nivel  {
    private int tipoNivel;

    public tipoNivel getTipoNivel() {
        return tipoNivel;
    }
    public void jugar(){
        String nombre = "";
        Enemigo enemigo = null;

        if(tipoNivel == 1){
            nombre = "Bosque oscuro";
            enemigo = new Lobo();
        }else if(tipoNivel == 2){
            nombre = "Castillo embrujado";
            enemigo = new Esqueleto();    
        }else if(tipoNivel == 3){
            nombre = "volcan Infernal";
            enemigo = new Dragon();
        }else{
            return;
        }
        System.out.println("Bienvenido al nivel: " + nombre);
        int vidaJugador = 1500;

        while(enemigo.estaVivo() && vidaJugador > 0){
            enemigo.recibirDano(200);

            if(enemigo.estaVivo()){
                enemigo.atacar();
                vidaJugador -= enemigo.getAtaque();
            }
        }
        if(vidaJugador > 0){
            System.out.println("Felicidades, has derrotado al enemigo y completado el nivel: " + nombre);
        } else {
            System.out.println("Has sido derrotado por el enemigo en el nivel: " + nombre);
        }
    }
}
