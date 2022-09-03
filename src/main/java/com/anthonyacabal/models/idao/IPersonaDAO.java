package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Persona;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 * @date 30/08/22
 * @time 08:55:35 AM
 * Código Técnico: IN5BM
 */
public interface IPersonaDAO {
    
    // Listar todos los registros
    public List<Persona> getAll();
    
    // Insertar un registro
    public boolean add(Persona estudiante);
    
    // Actualizar un registro
    public boolean update(Persona estudiante);
    
    // Eliminar un registro
    public boolean delete(Persona estudiante);
}
