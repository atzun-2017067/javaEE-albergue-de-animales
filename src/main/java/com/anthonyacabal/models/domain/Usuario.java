package com.anthonyacabal.models.domain;

/**
 *
 * @author Anthony Acabal
 */
public class Usuario {
    private String usuario;
    private String pass;
    private int rolId;
    private int empleadoId;

    public Usuario() {
        
    }    

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario(String pass, int rolId, int empleadoId) {
        this.pass = pass;
        this.rolId = rolId;
        this.empleadoId = empleadoId;
    }

    public Usuario(String usuario, String pass, int rolId, int empleadoId) {
        this.usuario = usuario;
        this.pass = pass;
        this.rolId = rolId;
        this.empleadoId = empleadoId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", pass=" + pass 
                + ", rolId=" + rolId + ", empleadoId=" + empleadoId + '}';
    }
    
    
    
}
