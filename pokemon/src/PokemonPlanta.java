import java.util.Random;

public class PokemonPlanta extends Pokemon implements Capturable{
    private String tipo = "planta";
    private String debil = "fuego";
    private String fuerte = "agua";


    public PokemonPlanta(String nombre, int ataque, int defensa, int salud) {
        super(nombre, ataque, defensa, salud);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + getNombre() + '\'' +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", salud=" + getPs() +
                "tipo='" + tipo + '\'' +
                ", fuerte contra='" + fuerte + '\'' +
                ", debil contra='" + debil + '\'' +
                '}';
    }

    @Override
    public boolean capturar() {

        int valorObtenido = valorAleatorio();

        if (valorObtenido-getPs() > getDefensa()){
            System.out.println(getNombre()+" capturadooolll!");
            System.out.println("-----------------------------");

            return true;
        }
        else{
            System.out.println(getNombre()+" no capturado...");
            System.out.println("Valor obtenido: "+valorObtenido);
            System.out.println("-----------------------------");

            return false;
        }
    }

    public static int valorAleatorio(){
        Random r = new Random();
        return r.nextInt((120 - 20) + 1) + 20;
    }
}
