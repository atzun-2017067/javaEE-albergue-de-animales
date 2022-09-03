package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Usuario;
import com.anthonyacabal.models.idao.IUsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUIS
 */
public class UsuarioDaoImpl implements IUsuarioDAO {
    private static final String SQL_SELECT = "SELECT usuario, pass, rol_id, empleado_id FROM usuarios";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Usuario usuario = null;
    private List<Usuario> listaUsuario = new ArrayList<>();

    @Override
    public List<Usuario> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                usuario = new Usuario(rs.getString("usuario"), rs.getString("pass"), rs.getInt("rol_id"),
                        rs.getInt("empleado_id"));
                listaUsuario.add(usuario);
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
        
        return listaUsuario;
        
    }

    @Override
    public boolean add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
