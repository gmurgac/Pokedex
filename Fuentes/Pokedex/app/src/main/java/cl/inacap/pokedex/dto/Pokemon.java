package cl.inacap.pokedex.dto;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String nombre;
    private String tipo;
    private int numero; //agregar numero del pokemon
    private String foto;   //foto del pokemon
    private int fotoTipo;
    private String descripcion;




    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }




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
//TODO: agregar atributo foto del pokemon