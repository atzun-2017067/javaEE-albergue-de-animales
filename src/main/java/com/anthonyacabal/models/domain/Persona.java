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
@Table(name = "personas")
@NamedQueries(
        {
            @NamedQuery(name = "Persona.findAll", query = "from Persona" /*Consulta a un objeto de datos*/),
            /*el from estudiante no es una sentencia sql, lo que hace referencia es al nombre de la clase, no al de la tabla*/
            @NamedQuery(name = "Persona.find", query = "from Persona WHERE id = :id")
        /*se deja espacio : y se le asigna un nombre a ese parametro*/
        }
        /*Lo que se acaba de hacer es un mapeo*/
        /*ENTIDADES FUERTES CON JPA Y ENTIDADES DÉBILES CON JDBC*/
)
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre1;
    
    @Column
    private String nombre2;
    
    @Column
    private String nombre3;
    
    @Column
    private String apellido1;
    
    @Column
    private String apellido2;
    
    @Column
    private String direccion;
    
    @Column
    private String cui;
    
    @Column
    private String telefono;
    
    public Persona() {
        
    }
    
    public Persona(int id) {
        this.id = id;
    }

    public Persona(String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, String direccion, String cui, String telefono) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.cui = cui;
        this.telefono = telefono;
    }

    public Persona(int id, String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, String direccion, String cui, String telefono) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.cui = cui;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 
                + ", nombre3=" + nombre3 + ", apellido1=" + apellido1 
                + ", apellido2=" + apellido2 + ", direccion=" + direccion 
                + ", cui=" + cui + ", telefono=" + telefono + '}';
    }
    
}
