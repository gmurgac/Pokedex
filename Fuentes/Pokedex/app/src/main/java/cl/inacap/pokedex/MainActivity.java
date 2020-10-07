package cl.inacap.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

import cl.inacap.pokedex.adapters.PokemonesListAdapter;
import cl.inacap.pokedex.dao.PokemonesDAO;
import cl.inacap.pokedex.dao.PokemonesDAOLista;
import cl.inacap.pokedex.dto.Pokemon;

public class MainActivity extends AppCompatActivity {
private ListView pokemonesLv;
private PokemonesListAdapter adapter;
private List<Pokemon> pokemones;
private PokemonesDAO pokeDAO = PokemonesDAOLista.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.pokemones = this.pokeDAO.getAll();
        this.pokemonesLv = findViewById(R.id.list_view_pokemones);
        this.adapter = new PokemonesListAdapter(this,R.layout.pokemon_list,this.pokemones);
        this.pokemonesLv.setAdapter(adapter);
        this.pokemonesLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pokemon pokemon = pokemones.get(i);
                Intent intent = new Intent(MainActivity.this,PokemonViewActivity.class);
                intent.putExtra("pokemon",pokemon);
                startActivity(intent);
            }
        });
    }
}