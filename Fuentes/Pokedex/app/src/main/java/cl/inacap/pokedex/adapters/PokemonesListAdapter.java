package cl.inacap.pokedex.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.pokedex.R;
import cl.inacap.pokedex.dto.Pokemon;

public class PokemonesListAdapter extends ArrayAdapter<Pokemon> {
    private List<Pokemon> pokemones;
    private Activity activity;

    public PokemonesListAdapter(@NonNull Activity context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        this.pokemones = objects;
        this.activity = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.pokemon_list,null,true);

        TextView nombreTv = fila.findViewById(R.id.nombre_pokemon_txt);
        TextView tipoTv = fila.findViewById(R.id.tipo_pokemon_txt);
        ImageView imagenPoke = fila.findViewById(R.id.imagen_tipo_poke);

        Pokemon actual = pokemones.get(position);
        nombreTv.setText(actual.getNombre());
        tipoTv.setText(actual.getTipo());
        imagenPoke.setImageResource(actual.getFotoTipo());



        return fila;
    }
}
