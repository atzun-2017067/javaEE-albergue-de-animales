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
    public int add(Persona persona);
    
    // Actualizar un registro
    public int update(Persona persona);
    
    // Eliminar un registro
    public int delete(Persona persona);
}
