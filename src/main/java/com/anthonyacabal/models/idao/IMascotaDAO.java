package com.anthonyacabal.models.idao;

import com.anthonyacabal.models.domain.Mascota;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */
public interface IMascotaDAO {
    public List<Mascota> getAll();
    
    // Insertar un registro
    public int add(Mascota mascota);
    
    // Actualizar un registro
    public int update(Mascota mascota);
    
    // Eliminar un registro
    public int delete(Mascota mascota);
}
