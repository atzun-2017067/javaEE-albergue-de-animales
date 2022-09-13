package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Mascota;
import com.anthonyacabal.models.idao.IMascotaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony Acabal
 */

public class MascotaDaoImpl implements IMascotaDAO {
    private static final String SQL_SELECT = "SELECT id_mascota, nombre, tipo_mascota_id, raza,"
            + "genero, edad, salon_id FROM mascotas";
    private static final String SQL_DELETE = "DELETE FROM mascotas WHERE id_mascota = ?";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Mascota mascota = null;
    private List<Mascota> listaMascota = new ArrayList<>();

    @Override
    public List<Mascota> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                mascota = new Mascota(rs.getInt("id_mascota"), rs.getString("nombre"), rs.getInt("tipo_mascota_id"),
                rs.getString("raza"), rs.getString("genero"), rs.getInt("edad"), rs.getInt("salon_id"));
                listaMascota.add(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
        return listaMascota;
        
    }

    @Override
    public int add(Mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Mascota mascota) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, mascota.getIdMascota());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + mascota.getIdMascota());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }
}
