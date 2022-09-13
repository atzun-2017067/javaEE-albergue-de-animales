package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.anthonyacabal.models.idao.IPersonaDAO;

/**
 *
 * @author Anthony Acabal
 */
public class PersonaDaoImpl implements IPersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre1, nombre2, nombre3, apellido1, apellido2, direccion, cui, telefono FROM personas";
    private static final String SQL_DELETE = "DELETE FROM estudiantes WHERE id = ?";

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Persona persona = null;
    private List<Persona> listaPersona = new ArrayList<>();

    @Override
    public List<Persona> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Persona(rs.getInt("id_persona"), rs.getString("nombre1"), rs.getString("nombre2"),
                        rs.getString("nombre3"), rs.getString("apellido1"), rs.getString("apellido2"),
                        rs.getString("direccion"), rs.getString("cui"), rs.getString("telefono"));
                listaPersona.add(persona);
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

        return listaPersona;

    }

    @Override
    public int add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Persona persona) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, persona.getId());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + persona.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }

}
