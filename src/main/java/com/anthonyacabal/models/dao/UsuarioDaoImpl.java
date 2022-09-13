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
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE usuario = ?";
    
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
    public int add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Usuario usuario) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setString(1, usuario.getUsuario());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + usuario.getUsuario());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }
}
