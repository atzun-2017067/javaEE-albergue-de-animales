package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Salon;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 * @date 30/08/22
 * @time 08:55:35 AM
 * Código Técnico: IN5BM
 */
public interface ISalonDAO {
    
    // Listar todos los registros
    public List<Salon> getAll();
    
    // Insertar un registro
    public boolean add(Salon lugar);
    
    // Actualizar un registro
    public boolean update(Salon lugar);
    
    // Eliminar un registro
    public boolean delete(Salon lugar);
}
