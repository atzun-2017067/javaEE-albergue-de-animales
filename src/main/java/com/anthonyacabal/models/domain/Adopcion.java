package com.anthonyacabal.models.domain;

import java.sql.Date;

/**
 *
 * @author Anthony Acabal
 */

public class Adopcion {
    private int id;
    private int empleadoId;
    private int clienteId;
    private int mascotaId;
    private Date fecha;

    public Adopcion() {
        
    }

    public Adopcion(int id) {
        this.id = id;
    }

    public Adopcion(int empleadoId, int clienteId, int mascotaId, Date fecha) {
        this.empleadoId = empleadoId;
        this.clienteId = clienteId;
        this.mascotaId = mascotaId;
        this.fecha = fecha;
    }

    public Adopcion(int id, int empleadoId, int clienteId, int mascotaId, Date fecha) {
        this.id = id;
        this.empleadoId = empleadoId;
        this.clienteId = clienteId;
        this.mascotaId = mascotaId;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
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
        return "Adopcion{" + "id=" + id + ", empleadoId=" + empleadoId + ", clienteId=" + clienteId 
                + ", mascotaId=" + mascotaId + ", fecha=" + fecha + '}';
    }
    
}
