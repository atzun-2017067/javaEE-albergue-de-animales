package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Adopcion;
import com.anthonyacabal.models.idao.IAdopcionDAO;
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


public class AdopcionDaoImpl implements IAdopcionDAO{
    private static final String SQL_SELECT = "SELECT id_adopcion, empleado_id, cliente_id, mascota_id, fecha_adopcion FROM adopciones";
    private static final String SQL_DELETE = "DELETE FROM adopciones WHERE id_adopcion = ?";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Adopcion adopcion = null;
    private List<Adopcion> listaAdopcion = new ArrayList<>();

    @Override
    public List<Adopcion> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                adopcion = new Adopcion(rs.getInt("id_adopcion"), rs.getInt("empleado_id"), rs.getInt("cliente_id"),
                        rs.getInt("mascota_id"), rs.getDate("fecha_adopcion"));
                listaAdopcion.add(adopcion);
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
        
        return listaAdopcion;
        
    }

    @Override
    public int add(Adopcion adopcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Adopcion adopcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Adopcion adopcion) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, adopcion.getId());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + adopcion.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }
}
