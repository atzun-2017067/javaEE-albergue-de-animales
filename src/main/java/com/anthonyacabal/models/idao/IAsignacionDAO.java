package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Asignacion;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public interface IAsignacionDAO {
    public List<Asignacion> getAll();
    
    // Insertar un registro
    public int add(Asignacion asignacion);
    
    // Actualizar un registro
    public int update(Asignacion asignacion);
    
    // Eliminar un registro
    public int delete(Asignacion asignacion);
}
