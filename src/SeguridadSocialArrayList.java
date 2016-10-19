
import java.util.ArrayList;
import java.util.List;

public class SeguridadSocialArrayList {
    private List<Persona> personasList;
    public SeguridadSocialArrayList() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        personasList.add(persona);
    }

    public void bajaPersona(String dni) {
        personasList.remove(obtenerIndexPersonaPorDNI(dni));
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personasList.get(obtenerIndexPersonaPorDNI(dni));
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        boolean encontrado = false;
        int contador = 0;
        Persona persona_nueva;
        do {
            persona_nueva = personasList.get(contador);
            if (persona_nueva.getNum_seguridad_social().equals(numSS)){
                encontrado = true;
            }else{
                contador++;
            }
        }while (!encontrado && contador < personasList.size());

        if (encontrado){
            return persona_nueva;
        }else{
            return null;
        }
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> personasListRangoSalarial= new ArrayList<>();
        for (int i = 0; i < personasList.size(); i++){
            Persona persona = personasList.get(i);
            if (persona.getSalario() >= min || persona.getSalario() <= max){
                personasListRangoSalarial.add(personasList.get(i));
            }
        }
        return personasListRangoSalarial;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> personasListMayoresQue= new ArrayList<>();
        for (int i = 0; i < personasList.size(); i++){
            Persona persona = personasList.get(i);
            if (persona.getEdad()>edad){
                personasListMayoresQue.add(personasList.get(i));
            }
        }
        return personasListMayoresQue;
    }

    public List<Persona> obtenerTodas(){
        return personasList;
    }

    public int obtenerIndexPersonaPorDNI(String dni){
        boolean encontrado = false;
        int contador = 0;
        do {
            Persona persona_nueva = personasList.get(contador);
            if (persona_nueva.getDNI().equals(dni)){
                encontrado = true;
            }else{
                contador++;
            }
        }while (!encontrado && contador < personasList.size());

        if (encontrado){
            return contador;
        }else{
            return -1;
        }
    }

    public Persona obtenerPersonaPorSalarioMaximo(){
        int indexMaximo = 0;
        double doubleMaximo = 0;
        Persona persona_nueva;
        for (int i = 0; i < personasList.size(); i++){
            persona_nueva = personasList.get(i);
            if (persona_nueva.getSalario()>doubleMaximo){
                indexMaximo = i;
                doubleMaximo = persona_nueva.getSalario();
            }
        }
        return personasList.get(indexMaximo);
    }

    public Persona obtenerPersonaPorSalarioMinimo(){
        int indexMinimo = 0;
        double doubleMinimo = 0;
        Persona persona_nueva;
        for (int i = 0; i < personasList.size(); i++){
            persona_nueva = personasList.get(i);
            if (persona_nueva.getSalario()<doubleMinimo){
                indexMinimo = i;
                doubleMinimo = persona_nueva.getSalario();
            }
        }
        return personasList.get(indexMinimo);
    }


    @Override
    public String toString() {
        return "SeguridadSocialArrayList{" +
                "personasList=" + personasList +
                '}';
    }
}
