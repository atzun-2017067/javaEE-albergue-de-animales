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
    public boolean add(Empleado trabajador);
    
    // Actualizar un registro
    public boolean update(Empleado trabajador);
    
    // Eliminar un registro
    public boolean delete(Empleado trabajador);
}
