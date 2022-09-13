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
    public int add(Usuario tipo);
    
    // Actualizar un registro
    public int update(Usuario tipo);
    
    // Eliminar un registro
    public int delete(Usuario tipo);
}
