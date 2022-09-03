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
            
            while(rs.next()){
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
    public boolean add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
