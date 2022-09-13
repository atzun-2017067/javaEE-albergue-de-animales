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
    public int add(Salon salon);
    
    // Actualizar un registro
    public int update(Salon salon);
    
    // Eliminar un registro
    public int delete(Salon salon);
}
