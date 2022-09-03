package com.anthonyacabal.models.domain;

/**
 *
 * @author Anthony Acabal
 */
public class Vacuna {
    private int id;
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
