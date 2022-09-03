package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Usuario;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public interface IUsuarioDAO {
    public List<Usuario> getAll();
    
    // Insertar un registro
    public boolean add(Usuario tipo);
    
    // Actualizar un registro
    public boolean update(Usuario tipo);
    
    // Eliminar un registro
    public boolean delete(Usuario tipo);
}
