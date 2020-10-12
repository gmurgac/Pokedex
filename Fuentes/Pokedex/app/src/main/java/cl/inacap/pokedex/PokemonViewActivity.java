package cl.inacap.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import cl.inacap.pokedex.dto.Pokemon;

public class PokemonViewActivity extends AppCompatActivity {
TextView numeroYNombrePokemonTv;
Pokemon pokemon;
Toolbar toolbar;
ImageView tipoPokeIv;
ImageView pokeIv;
TextView descripcionPoke;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_view);
        //traer layouts
        this.numeroYNombrePokemonTv = findViewById(R.id.numero_y_nombre_pokeTxt);
        this.tipoPokeIv = findViewById(R.id.tipo_poke_iv);
        this.pokeIv = findViewById(R.id.pokemon_imagen);
        this.descripcionPoke = findViewById(R.id.descPokeTxt);
        //Activar toolbar y boton volver
        this.toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(this.toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        //traer el pokemon al activity y mostrar sus atributos
        if(getIntent().getExtras() != null){
            this.pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");
            this.numeroYNombrePokemonTv.setText(""+pokemon.getNumero()+"."+pokemon.getNombre());
            this.tipoPokeIv.setImageResource(pokemon.getFotoTipo());
            Picasso.get().load(this.pokemon.getFoto())
                    .resize(450,450)
                    .centerCrop()
                    .into(this.pokeIv);
            this.descripcionPoke.setText(pokemon.getDescripcion());
        }
    }
}