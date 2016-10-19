
import java.util.*;
import java.util.stream.Collectors;

public class SeguridadSocialHashMap{
    private HashMap<String, Persona> personasMapPorSS;
    private HashMap<String, Persona> personasMapPorDNI;
    public SeguridadSocialHashMap() {
          personasMapPorDNI = new HashMap<String, Persona>();
        personasMapPorSS = new HashMap<String, Persona>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        if (!personasMapPorDNI.containsKey((persona.getNum_seguridad_social())) && !personasMapPorSS.containsKey(persona.getNum_seguridad_social())){
            personasMapPorSS.put(persona.getNum_seguridad_social(),persona);
            personasMapPorDNI.put(persona.getDNI(),persona);
        }else{
            System.out.println("DUPLICADO");
        }
    }

    public void bajaPersona(String dni) {
        if (personasMapPorDNI.containsKey((dni))){
            personasMapPorSS.remove(obtenerPersonaPorDNI(dni));
            personasMapPorDNI.remove(dni);
        }else{
            System.out.println("No existe ese DNI");
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personasMapPorDNI.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personasMapPorSS.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        /*List<Persona> personasListRangoSalarial = new ArrayList<>();
        Iterator iterator = personasMapPorSS.values().iterator();
        while (iterator.hasNext()) {
            Persona p = (Persona)iterator.next();
            if (p.getSalario() >= min && p.getSalario() <= max){
                personasListRangoSalarial.add(p);
            }
        }
        return personasListRangoSalarial;*/
        return personasMapPorSS.values()
                .stream()
                .filter(persona -> persona.getSalario() >= min && persona.getSalario() < max)
                .collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        /*List<Persona> personasListMayoresQue= new ArrayList<>();
        Iterator iterator = personasMapPorSS.values().iterator();
        while (iterator.hasNext()) {
            Persona p = (Persona)iterator.next();
            if (p.getEdad() >edad){
                personasListMayoresQue.add(p);
            }
        }
        return personasListMayoresQue;*/
        return personasMapPorSS.values()
                .stream()
                .filter(persona -> persona.getEdad() >= edad)
                .collect(Collectors.toList());
    }

    public HashMap<String,Persona> obtenerTodas(){
        return personasMapPorSS;
    }

    public Optional<Persona> obtenerPersonaPorSalarioMaximo(){
       /* Persona personaMaximo = null;
        double doubleMaximo = 0;
        Iterator iterator = personasMapPorSS.values().iterator();
        while (iterator.hasNext()) {
            Persona p = (Persona)iterator.next();
            if (p.getSalario() >=doubleMaximo){
                personaMaximo = p;
                doubleMaximo = p.getSalario();
            }
        }
        return personaMaximo;*/
       return personasMapPorDNI.values().stream().max(Comparator.comparing(Persona::getSalario));
    }

    public Optional<Persona> obtenerPersonaPorSalarioMinimo(){
        /*Persona personaMinimo = null;
        double doubleMinimo = 0;
        Iterator iterator = personasMapPorSS.values().iterator();
        while (iterator.hasNext()) {
            Persona p = (Persona)iterator.next();
            if (p.getSalario() >=doubleMinimo){
                personaMinimo = p;
                doubleMinimo = p.getSalario();
            }
        }
        return personaMinimo;*/
        return personasMapPorDNI.values().stream().min(Comparator.comparing(Persona::getSalario));

    }

    public List<Persona> ordenarPorDNI(){
        List<Persona> personasPorDNI = new ArrayList<>(personasMapPorDNI.values());

        personasPorDNI.sort(Comparator.comparing(Persona::getDNI));

        return personasPorDNI;
    }
    public List<Persona> ordenarPorSS(){
        List<Persona> personasPorSS = new ArrayList<>(personasMapPorDNI.values());

        personasPorSS.sort(Comparator.comparing(Persona::getNum_seguridad_social));

        return personasPorSS;
    }

    public List<Persona> ordenarPorSalario(){
        List<Persona> personasPorSalario = new ArrayList<>(personasMapPorDNI.values());

        personasPorSalario.sort(Comparator.comparing(Persona::getSalario));

        return personasPorSalario;
    }

    public List<Persona> ordenarPorEdad(){
        List<Persona> personasPorEdad = new ArrayList<>(personasMapPorDNI.values());

        personasPorEdad.sort(Comparator.comparing(Persona::getEdad));

        return personasPorEdad;
    }

    @Override
    public String toString() {
        return "SeguridadSocialArrayList{" +
                "personasMapPorSS=" + personasMapPorSS +
                '}';
    }

}