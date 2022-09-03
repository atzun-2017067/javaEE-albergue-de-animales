package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Rol;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 * @date 3/09/22
 * @time 01:7:00 AM
 * Código Técnico: IN5BM
 */
public interface IRolDAO {
    
    // Listar todos los registros
    public List<Rol> getAll();
    
    // Insertar un registro
    public boolean add(Rol area);
    
    // Actualizar un registro
    public boolean update(Rol area);
    
    // Eliminar un registro
    public boolean delete(Rol area);
}
