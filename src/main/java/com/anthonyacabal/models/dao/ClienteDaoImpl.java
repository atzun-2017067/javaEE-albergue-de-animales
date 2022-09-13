package com.anthonyacabal.models.dao;

import com.anthonyacabal.db.Conexion;
import com.anthonyacabal.models.domain.Cliente;
import com.anthonyacabal.models.idao.IClienteDAO;
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
public class ClienteDaoImpl implements IClienteDAO {

    private static final String SQL_SELECT = "SELECT id_cliente, persona_id, nit FROM clientes";
    private static final String SQL_DELETE = "DELETE FROM clientes WHERE id_cliente = ?";

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Cliente cliente = null;
    private List<Cliente> listaCliente = new ArrayList<>();

    @Override
    public List<Cliente> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getInt("persona_id"), rs.getString("nit"));
                listaCliente.add(cliente);
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

        return listaCliente;

    }

    @Override
    public int add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Cliente cliente) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, cliente.getId());
            System.out.println(pstmt.toString());
            /*cantidad de líneas afectadas*/
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id:" + cliente.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return rows;
    }
}
