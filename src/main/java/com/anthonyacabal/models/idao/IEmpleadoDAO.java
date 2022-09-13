package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Empleado;
import com.anthonyacabal.models.domain.Vacuna;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 * @date 30/08/22
 * @time 08:55:35 AM
 * Código Técnico: IN5BM
 */
public interface IEmpleadoDAO {
    
    // Listar todos los registros
    public List<Empleado> getAll();
    
    // Insertar un registro
    public int add(Empleado empleado);
    
    // Actualizar un registro
    public int update(Empleado empleado);
    
    // Eliminar un registro
    public int delete(Empleado empleado);
}
