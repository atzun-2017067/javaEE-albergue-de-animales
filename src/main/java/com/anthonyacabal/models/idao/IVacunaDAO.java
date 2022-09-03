package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Vacuna;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 * @date 30/08/22
 * @time 08:55:35 AM
 * Código Técnico: IN5BM
 */
public interface IVacunaDAO {
    
    // Listar todos los registros
    public List<Vacuna> getAll();
    
    // Insertar un registro
    public boolean add(Vacuna dosis);
    
    // Actualizar un registro
    public boolean update(Vacuna dosis);
    
    // Eliminar un registro
    public boolean delete(Vacuna dosis);
}
