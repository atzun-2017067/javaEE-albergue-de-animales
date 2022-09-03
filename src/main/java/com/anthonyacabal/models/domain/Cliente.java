package com.anthonyacabal.models.domain;

/**
 *
 * @author Anthony Acabal
 */
public class Cliente {
    private int id;
    private int personaId;
    private String nit;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int personaId, String nit) {
        this.personaId = personaId;
        this.nit = nit;
    }

    public Cliente(int id, int personaId, String nit) {
        this.id = id;
        this.personaId = personaId;
        this.nit = nit;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", personaId=" + personaId 
                + ", nit=" + nit + '}';
    }
    
}
