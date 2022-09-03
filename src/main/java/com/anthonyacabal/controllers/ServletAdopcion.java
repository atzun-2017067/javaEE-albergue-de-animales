package com.anthonyacabal.controllers;

import com.anthonyacabal.models.dao.AdopcionDaoImpl;
import com.anthonyacabal.models.domain.Adopcion;
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

@WebServlet("/ServletAdopcion")
public class ServletAdopcion extends HttpServlet {
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
                    listarAdopciones(request, response);
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
    
    private void listarAdopciones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Adopcion> listaAdopciones = new AdopcionDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaAdopciones);
        response.sendRedirect("adopciones/adopcion.jsp");
    }
}
