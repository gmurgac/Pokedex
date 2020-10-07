package cl.inacap.pokedex.dao;

import java.util.List;

import cl.inacap.pokedex.dto.Pokemon;

public interface PokemonesDAO {
    Pokemon save (Pokemon p);
    List<Pokemon> getAll();
}
