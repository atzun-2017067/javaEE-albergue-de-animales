package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.ConexionPU;
import com.anthonyacabal.models.domain.Vacuna;
import com.anthonyacabal.models.idao.IVacunaDAO;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public class VacunaDaoJPA implements IVacunaDAO {
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Vacuna> getAll() {
        return con.getEntityManager().createNamedQuery("Vacuna.findAll").getResultList();
    }

    @Override
    public int add(Vacuna vacuna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Vacuna vacuna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Vacuna vacuna) {
        System.out.println(vacuna);
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(vacuna);
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
    
    public Vacuna get(Vacuna vacuna) {
        return (Vacuna) con.getEntityManager().createNamedQuery("Vacuna.find")
                .setParameter("id", vacuna.getId()).getSingleResult();
    }
}
