import java.util.Random;

public class Constipado implements Capturable {
    public Constipado() {
    }

    @Override
    public boolean capturar() {
        int valor = valorAleatorio();

        if (valor > 60){
            System.out.println(valor);
            System.out.println("te has resfriado");
            return true;
        }

        else{
            System.out.println(valor);
            System.out.println("pues no te has resfriado");
            return false;
        }
    }
    public static int valorAleatorio(){
        Random r = new Random();
        return r.nextInt((45 - 1) + 1) + 45;
    }
}