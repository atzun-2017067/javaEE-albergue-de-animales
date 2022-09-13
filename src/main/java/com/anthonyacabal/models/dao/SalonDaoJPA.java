package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.ConexionPU;
import com.anthonyacabal.models.domain.Salon;
import com.anthonyacabal.models.idao.ISalonDAO;
import java.util.List;

/**
 *
 * @author LUIS
 */
public class SalonDaoJPA implements ISalonDAO {
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Salon> getAll() {
        return con.getEntityManager().createNamedQuery("Salon.findAll").getResultList();
    }

    @Override
    public int add(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Salon salon) {
        System.out.println(salon);
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(salon);
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
    
    public Salon get(Salon salon) {
        return (Salon) con.getEntityManager().createNamedQuery("Salon.find")
                .setParameter("id", salon.getId()).getSingleResult();
    }
}
