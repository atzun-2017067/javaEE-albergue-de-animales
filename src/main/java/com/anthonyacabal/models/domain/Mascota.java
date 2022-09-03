package com.anthonyacabal.models.domain;

/**
 *
 * @author Anthony Acabal
 */


public class Mascota {
    private int idMascota;
    private String nombre;
    private int tipoMascotaId;
    private String raza;
    private String genero;
    private int edad;
    private int salonId;

    public Mascota() {
        
    }

    public Mascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Mascota(String nombre, int tipoMascotaId, String raza, String genero, int edad, int salonId) {
        this.nombre = nombre;
        this.tipoMascotaId = tipoMascotaId;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.salonId = salonId;
    }

    public Mascota(int idMascota, String nombre, int tipoMascotaId, String raza, String genero, int edad, int salonId) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipoMascotaId = tipoMascotaId;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.salonId = salonId;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoMascotaId() {
        return tipoMascotaId;
    }

    public void setTipoMascotaId(int tipoMascotaId) {
        this.tipoMascotaId = tipoMascotaId;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalonId() {
        return salonId;
    }

    public void setSalonId(int salonId) {
        this.salonId = salonId;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", nombre=" + nombre 
                + ", tipoMascotaId=" + tipoMascotaId + ", raza=" + raza 
                + ", genero=" + genero + ", edad=" + edad + ", salonId=" + salonId + '}';
    }
    
}
