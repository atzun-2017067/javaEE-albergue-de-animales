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
@Table(name = "vacunas")
@NamedQueries(
        {
            @NamedQuery(name = "Vacuna.findAll", query = "from Vacuna" /*Consulta a un objeto de datos*/),
            /*el from estudiante no es una sentencia sql, lo que hace referencia es al nombre de la clase, no al de la tabla*/
            @NamedQuery(name = "Vacuna.find", query = "from Vacuna WHERE id = :id")
        /*se deja espacio : y se le asigna un nombre a ese parametro*/
        }
        /*Lo que se acaba de hacer es un mapeo*/
        /*ENTIDADES FUERTES CON JPA Y ENTIDADES DÉBILES CON JDBC*/
)

public class Vacuna implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_vacuna")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "tipo_vacuna")
    private String tipoVacuna;
    
    public Vacuna() {
        
    }
    
    public Vacuna(int id) {
        this.id = id;
    }

    public Vacuna(int id, String tipoVacuna) {
        this.id = id;
        this.tipoVacuna = tipoVacuna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "id=" + id + ", tipoVacuna=" + tipoVacuna + '}';
    }
    
}
