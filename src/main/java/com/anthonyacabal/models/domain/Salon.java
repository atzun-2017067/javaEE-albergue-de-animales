package com.anthonyacabal.models.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anthony Acabal
 */

@Entity
@Table(name = "salones")
@NamedQueries(
        {
            @NamedQuery(name = "Salon.findAll", query = "from Salon" /*Consulta a un objeto de datos*/),
            /*el from estudiante no es una sentencia sql, lo que hace referencia es al nombre de la clase, no al de la tabla*/
            @NamedQuery(name = "Salon.find", query = "from Salon WHERE id = :id")
        /*se deja espacio : y se le asigna un nombre a ese parametro*/
        }
        /*Lo que se acaba de hacer es un mapeo*/
        /*ENTIDADES FUERTES CON JPA Y ENTIDADES DÉBILES CON JDBC*/
)

public class Salon implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_salon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String descripcion;
    
    @Column(name= "capacidad_minima")
    private int capacidadMinima;
    
    @Column(name = "capacidad_maxima")
    private int capacidadMaxima;
    
    @Column
    private String edificio;
    
    @Column
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
