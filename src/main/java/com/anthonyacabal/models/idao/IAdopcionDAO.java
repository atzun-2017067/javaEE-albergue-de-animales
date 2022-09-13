package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Adopcion;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */

public interface IAdopcionDAO {
    public List<Adopcion> getAll();
    
    // Insertar un registro
    public int add(Adopcion adopcion);
    
    // Actualizar un registro
    public int update(Adopcion adopcion);
    
    // Eliminar un registro
    public int delete(Adopcion adopcion);
}
