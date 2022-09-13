package com.anthonyacabal.controllers;

import com.anthonyacabal.models.dao.ClienteDaoImpl;
import com.anthonyacabal.models.domain.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anthony Acabal
 */

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch (accion) {
                case "listar":
                    //Acciones para listar registros
                    listarClientes(request, response);
                    break;
                
                case "editar":
                    // Editar otras acciones
                    break;
                    
                case "eliminar":
                    // Eliminar otras acciones
                    eliminarCliente(request, response);
                    break;
            }
        }
    }
    
    private void listarClientes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Cliente> listaClientes = new ClienteDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaClientes);
        response.sendRedirect("clientes/cliente.jsp");
    }
    
    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idCliente = Integer.parseInt(request.getParameter("id"));
        Cliente cliente = new Cliente(idCliente);
        
        int registrosEliminados = new ClienteDaoImpl().delete(cliente);
        
        if(registrosEliminados >= 1) {
            System.out.println("El registro fue eliminado con exito");
        } else {
            System.err.println("Se produjo un error al intentar eliminar el siguiente registro: " + cliente.toString());
        }
        System.out.println("Cantidad de registros eliminados: " + registrosEliminados);
        
        listarClientes(request, response);
    }
}
