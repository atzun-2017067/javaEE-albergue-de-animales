package com.anthonyacabal.models.domain;

/**
 *
 * @author LUIS
 */
public class Salon {
    private int id;
    private String descripcion;
    private int capacidadMinima;
    private int capacidadMaxima;
    private String edificio;
    private int nivel;
    
    public Salon() {
        
    }

    public Salon(int id) {
        this.id = id;
    }

    public Salon(String descripcion, int capacidadMinima, int capacidadMaxima, String edificio, int nivel) {
        this.descripcion = descripcion;
        this.capacidadMinima = capacidadMinima;
        this.capacidadMaxima = capacidadMaxima;
        this.edificio = edificio;
        this.nivel = nivel;
    }

    public Salon(int id, String descripcion, int capacidadMinima, int capacidadMaxima, String edificio, int nivel) {
        this.id = id;
        this.descripcion = descripcion;
        this.capacidadMinima = capacidadMinima;
        this.capacidadMaxima = capacidadMaxima;
        this.edificio = edificio;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidadMinima() {
        return capacidadMinima;
    }

    public void setCapacidadMinima(int capacidadMinima) {
        this.capacidadMinima = capacidadMinima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Salon{" + "id=" + id + ", descripcion=" + descripcion 
                + ", capacidadMinima=" + capacidadMinima + ", capacidadMaxima=" + capacidadMaxima 
                + ", edificio=" + edificio + ", nivel=" + nivel + '}';
    }
    
    
}
