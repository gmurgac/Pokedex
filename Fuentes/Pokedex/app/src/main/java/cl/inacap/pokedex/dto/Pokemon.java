package cl.inacap.pokedex.dto;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String nombre;
    private String tipo;
    private int fotoTipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFotoTipo() {
        return fotoTipo;
    }

    public void setFotoTipo(int fotoTipo) {
        this.fotoTipo = fotoTipo;
    }
}
