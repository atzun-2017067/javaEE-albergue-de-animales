package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.ConexionPU;
import com.anthonyacabal.models.domain.Persona;
import com.anthonyacabal.models.idao.IPersonaDAO;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public class PersonaDaoJPA implements IPersonaDAO{
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Persona> getAll() {
        return con.getEntityManager().createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public int add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Persona persona) {
        System.out.println(persona);
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(persona);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
            /*regresar a como estaba antes de hacer la eliminación para que
            no se dañe la base de datos
            */
        }
        
        return rows;
    }
    
    public Persona get(Persona persona) {
        return (Persona) con.getEntityManager().createNamedQuery("Persona.find")
                .setParameter("id", persona.getId()).getSingleResult();
    }
}
