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
    public boolean add(Adopcion adopcion);
    
    // Actualizar un registro
    public boolean update(Adopcion adopcion);
    
    // Eliminar un registro
    public boolean delete(Adopcion adopcion);
}
