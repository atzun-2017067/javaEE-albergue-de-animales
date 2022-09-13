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
    public int add(Rol rol);
    
    // Actualizar un registro
    public int update(Rol rol);
    
    // Eliminar un registro
    public int delete(Rol rol);
}
