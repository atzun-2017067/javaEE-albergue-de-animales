package com.anthonyacabal.controllers;


import com.anthonyacabal.models.dao.VacunaDaoImpl;
import com.anthonyacabal.models.domain.Vacuna;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LUIS
 */

@WebServlet("/ServletVacuna")
public class ServletVacuna extends HttpServlet {
    
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
                    listarVacunas(request, response);
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
    
    private void listarVacunas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Vacuna> listaVacunas = new VacunaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaVacunas);
        response.sendRedirect("vacunas/vacuna.jsp");
    }
}
