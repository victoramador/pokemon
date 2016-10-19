import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        PokemonFuego charizard = new PokemonFuego("charizard",70,20,100);
        PokemonAgua blastoise =  new PokemonAgua("blastoise",37,20,93);
        PokemonPlanta venusaur = new PokemonPlanta("venusaur",40,40,90);
        PokemonFuego typlosion = new PokemonFuego("typlosion",45,34,79);
        PokemonPlanta meganium = new PokemonPlanta("meganium",37,20,80);
        PokemonAgua feraligart =  new PokemonAgua("feraligart",45,38,88);


        ArrayList<Capturable> pok = new ArrayList<Capturable>();

        pok.add(charizard);
        pok.add(blastoise);
        pok.add(venusaur);
        pok.add(typlosion);
        pok.add(meganium);
        pok.add(feraligart);

        for (Capturable pokemon2: pok){
            System.out.println(pokemon2);
        }


        Constipado constipado = new Constipado();
        ArrayList<Capturable> equipo = new ArrayList<Capturable>();

        equipo.add(charizard);
        equipo.add(blastoise);
        equipo.add(venusaur);
        equipo.add(typlosion);
        equipo.add(meganium);
        equipo.add(feraligart);

        equipo.add(constipado);


        for (Capturable Pokemon: equipo){
            //System.out.println(pokemon);
            Pokemon.capturar();
        }

    }
}