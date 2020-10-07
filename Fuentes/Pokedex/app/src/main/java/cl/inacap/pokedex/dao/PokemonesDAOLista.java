package cl.inacap.pokedex.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.pokedex.R;
import cl.inacap.pokedex.dto.Pokemon;

public class PokemonesDAOLista implements PokemonesDAO {
    private List<Pokemon> pokemones = new ArrayList<>();
    private static PokemonesDAOLista instancia;
    public static PokemonesDAOLista getInstance(){
        if(instancia==null){
            instancia = new PokemonesDAOLista();
        }
        return instancia;
    }
    private PokemonesDAOLista(){
        Pokemon p = new Pokemon();
        p.setNombre("Pikachu");
        p.setTipo("Electrico");
        p.setFotoTipo(R.drawable.ic_lightning);

        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Bulbasaur");
        p.setTipo("Planta");
        p.setFotoTipo(R.drawable.ic_leaf);

        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Charmander");
        p.setTipo("Fuego");
        p.setFotoTipo(R.drawable.ic_fire);

        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Warturtle");
        p.setTipo("Agua");
        p.setFotoTipo(R.drawable.ic_water_drops);

        pokemones.add(p);
    }


    @Override
    public Pokemon save(Pokemon p) {
        pokemones.add(p);
        return p;
    }

    @Override
    public List<Pokemon> getAll() {
        return pokemones;
    }
}
