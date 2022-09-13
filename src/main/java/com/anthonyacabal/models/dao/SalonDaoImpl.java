package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Salon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.anthonyacabal.models.idao.ISalonDAO;


/**
 *
 * @author Anthony Acabal
 */

public class SalonDaoImpl implements ISalonDAO {
    
    private static final String SQL_SELECT = "SELECT id_salon, descripcion, capacidad_minima, capacidad_maxima, edificio, nivel FROM salones";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Salon salon = null;
    private List<Salon> listaSalon = new ArrayList<>();

    @Override
    public List<Salon> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                salon = new Salon(rs.getInt("id_salon"), rs.getString("descripcion"), rs.getInt("capacidad_minima"),
                        rs.getInt("capacidad_maxima"), rs.getString("edificio"), rs.getInt("nivel"));
                listaSalon.add(salon);
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
        
        return listaSalon;
        
    }

    @Override
    public int add(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}