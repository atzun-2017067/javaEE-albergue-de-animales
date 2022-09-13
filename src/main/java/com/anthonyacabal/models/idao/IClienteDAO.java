package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Cliente;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public interface IClienteDAO {
    public List<Cliente> getAll();
    
    // Insertar un registro
    public int add(Cliente compra);
    
    // Actualizar un registro
    public int update(Cliente compra);
    
    // Eliminar un registro
    public int delete(Cliente compra);
}
