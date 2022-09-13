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
@Table(name = "roles")
@NamedQueries(
        {
            @NamedQuery(name = "Rol.findAll", query = "from Rol" /*Consulta a un objeto de datos*/),
            /*el from estudiante no es una sentencia sql, lo que hace referencia es al nombre de la clase, no al de la tabla*/
            @NamedQuery(name = "Rol.find", query = "from Rol WHERE id = :id")
        /*se deja espacio : y se le asigna un nombre a ese parametro*/
        }
        /*Lo que se acaba de hacer es un mapeo*/
        /*ENTIDADES FUERTES CON JPA Y ENTIDADES DÉBILES CON JDBC*/
)
public class Rol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String rol;
    
    public Rol() {
        
    }
    
    public Rol(int id) {
        this.id = id;
    }

    public Rol(int id, String rol) {
        this.id = id;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", rol=" + rol + '}';
    }
    
}
