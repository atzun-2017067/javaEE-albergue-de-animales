package com.anthonyacabal.models.domain;

/**
 *
 * @author Anthony Acabal
 */
public class Empleado {
    private int id;
    private int personaId;
    private String tipoEmpleado;
    
    public Empleado() {
        
    }
    
    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(int personaId, String tipoEmpleado) {
        this.personaId = personaId;
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleado(int id, int personaId, String tipoEmpleado) {
        this.id = id;
        this.personaId = personaId;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", personaId=" + personaId + ", tipoEmpleado=" + tipoEmpleado + '}';
    }
    
}