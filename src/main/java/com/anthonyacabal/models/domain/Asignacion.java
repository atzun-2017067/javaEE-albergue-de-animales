package com.anthonyacabal.models.domain;

import java.sql.Date;

/**
 *
 * @author Anthony Acabal
 */
public class Asignacion {
    private int id;
    private int vacunaId;
    private int mascotaId;
    private Date fecha;

    public Asignacion() {
        
    }

    public Asignacion(int id) {
        this.id = id;
    }

    public Asignacion(int vacunaId, Date fecha) {
        this.vacunaId = vacunaId;
        this.fecha = fecha;
    }

    public Asignacion(int id, int vacunaId, int mascotaId, Date fecha) {
        this.id = id;
        this.vacunaId = vacunaId;
        this.mascotaId = mascotaId;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVacunaId() {
        return vacunaId;
    }

    public void setVacunaId(int vacunaId) {
        this.vacunaId = vacunaId;
    }

    public int getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(int mascotaId) {
        this.mascotaId = mascotaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "id=" + id + ", vacunaId=" + vacunaId 
                + ", mascotaId=" + mascotaId + ", fecha=" + fecha + '}';
    }
    
}
