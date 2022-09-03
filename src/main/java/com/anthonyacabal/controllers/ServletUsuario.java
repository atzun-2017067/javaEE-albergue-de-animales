package com.anthonyacabal.controllers;

import com.anthonyacabal.models.dao.UsuarioDaoImpl;
import com.anthonyacabal.models.domain.Usuario;
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

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet{
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
                    listarUsuarios(request, response);
                    break;
                
                case "editar":
                    // Editar otras acciones
                    break;
                    
                case "eliminar":
                    // Eliminar otras acciones
                    break;
            }
        }
    }
    
    private void listarUsuarios(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Usuario> listaUsuarios = new UsuarioDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaUsuarios);
        response.sendRedirect("usuarios/usuario.jsp");
    }
}
