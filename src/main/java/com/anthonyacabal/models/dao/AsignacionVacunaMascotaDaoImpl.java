package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Asignacion;
import com.anthonyacabal.models.idao.IAsignacionDAO;
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
public class AsignacionVacunaMascotaDaoImpl implements IAsignacionDAO {
    private static final String SQL_SELECT = "SELECT id_asignacion_vacuna, vacuna_id, mascota_id, fecha_vacuna FROM asignaciones_vacunas_mascotas";
    private static final String SQL_DELETE = "DELETE FROM asignaciones_vacunas_mascotas WHERE id_asignacion_vacuna = ?";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Asignacion asignacion = null;
    private List<Asignacion> listaAsignacion = new ArrayList<>();

    @Override
    public List<Asignacion> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                asignacion = new Asignacion(rs.getInt("id_asignacion_vacuna"), rs.getInt("vacuna_id"),
                rs.getInt("mascota_id"), rs.getDate("fecha_vacuna"));
                listaAsignacion.add(asignacion);
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
        
        return listaAsignacion;
        
    }

    @Override
    public int add(Asignacion asignacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Asignacion asignacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Asignacion asignacion) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, asignacion.getId());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + asignacion.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }
}
