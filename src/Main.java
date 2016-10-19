
public class Main {
    public static void main(String[] args) {
        SeguridadSocialArrayList seguridadSocialArrayList = new SeguridadSocialArrayList();
        SeguridadSocialHashMap seguridadSocialHashMap = new SeguridadSocialHashMap();

        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria =  new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);


        seguridadSocialArrayList.altaPersona(jose);
        seguridadSocialArrayList.altaPersona(maria);
        seguridadSocialArrayList.altaPersona(carlos);
        seguridadSocialArrayList.altaPersona(anna);

        System.out.println("Altas a la seguridad social: " + seguridadSocialArrayList.obtenerTodas());

        System.out.println("Baja a la seguridad social: " + anna);
        seguridadSocialArrayList.bajaPersona(anna.getDNI());

        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocialArrayList.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocialArrayList.obtenerPersonaPorDNI(jose.getDNI()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocialArrayList.obtenerPersonaPorNumSS(maria.getNum_seguridad_social()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocialArrayList.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocialArrayList.obtenerPersonasMayoresQue(25));

        System.out.println("obtenerSalarioMinimo: "+ seguridadSocialArrayList.obtenerPersonaPorSalarioMinimo());
        System.out.println("obtenerSalarioMaximo: "+ seguridadSocialArrayList.obtenerPersonaPorSalarioMaximo());


        System.out.println("--------------------------------------------");
        System.out.println("---HASHMAP:---");

        seguridadSocialHashMap.altaPersona(jose);
        seguridadSocialHashMap.altaPersona(maria);
        seguridadSocialHashMap.altaPersona(carlos);
        seguridadSocialHashMap.altaPersona(anna);

        System.out.println("Altas a la seguridad social: " + seguridadSocialHashMap.obtenerTodas());

        System.out.println("Baja a la seguridad social: " + anna);
        seguridadSocialHashMap.bajaPersona(anna.getDNI());

        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocialHashMap.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocialHashMap.obtenerPersonaPorDNI(jose.getDNI()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocialHashMap.obtenerPersonaPorNumSS(maria.getNum_seguridad_social()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocialHashMap.obtenerPersonasRangoSalarial(23.00, 450000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocialHashMap.obtenerPersonasMayoresQue(25));

        System.out.println("obtenerSalarioMinimo: "+ seguridadSocialHashMap.obtenerPersonaPorSalarioMinimo());
        //System.out.println(seguridadSocialHashMap.obtenerPersonaPorSalarioMaximo());

        System.out.println("--------------------------------------------");
        System.out.println("---ORDENAR:---");

        System.out.println("Ordenar por salario"+seguridadSocialHashMap.ordenarPorSalario());
        System.out.println("Ordenar por edad"+seguridadSocialHashMap.ordenarPorEdad());
        System.out.println("Ordenar por DNI"+seguridadSocialHashMap.ordenarPorDNI());
        System.out.println("Ordenar por SS"+seguridadSocialHashMap.ordenarPorSS());

    }
}

