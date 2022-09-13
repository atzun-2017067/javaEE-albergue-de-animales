package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.ConexionPU;
import com.anthonyacabal.models.domain.Rol;
import com.anthonyacabal.models.idao.IRolDAO;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public class RolDaoJPA implements IRolDAO {
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Rol> getAll() {
        return con.getEntityManager().createNamedQuery("Rol.findAll").getResultList();
    }

    @Override
    public int add(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Rol rol) {
        System.out.println(rol);
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(rol);
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
    
    public Rol get(Rol rol) {
        return (Rol) con.getEntityManager().createNamedQuery("Rol.find")
                .setParameter("id", rol.getId()).getSingleResult();
    }
}
