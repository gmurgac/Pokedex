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
        p.setDescripcion("Cuanto más potente es la energía eléctrica que genera este Pokémon, más suaves y elásticas se vuelven las bolsas de sus mejillas.");
        p.setNumero(25);
        p.setFoto("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftwinfinite.net%2Fwp-content%2Fuploads%2F2017%2F08%2Fpikachu.jpg&f=1&nofb=1");

        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Torterra");
        p.setTipo("Planta");
        p.setFotoTipo(R.drawable.ic_leaf);
        p.setDescripcion("Las gentes de antaño creían que el planeta se sustentaba en la espalda de un gran Torterra.");
        p.setNumero(389);
        p.setFoto("https://assets.pokemon.com/assets/cms2/img/pokedex/full/389.png");
        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Charizard");
        p.setTipo("Fuego");
        p.setFotoTipo(R.drawable.ic_fire);
        p.setDescripcion("Escupe un fuego tan caliente que funde las rocas. Causa incendios forestales sin querer.");
        p.setNumero(6);
        p.setFoto("https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png");
        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Warturtle");
        p.setTipo("Agua");
        p.setFotoTipo(R.drawable.ic_water_drops);
        p.setDescripcion("Se lo considera un símbolo de longevidad. Los ejemplares más ancianos tienen musgo sobre el caparazón.");
        p.setNumero(8);
        p.setFoto("https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F1.bp.blogspot.com%2F_1NXwOQwKrko%2FTF06TqjfgrI%2FAAAAAAAAABU%2FGhA5NqbBH1U%2Fs1600%2F008Wartortle.png&f=1&nofb=1");
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
