package com.anthonyacabal.controllers;

import com.anthonyacabal.models.dao.AsignacionVacunaMascotaDaoImpl;
import com.anthonyacabal.models.domain.Asignacion;
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

@WebServlet("/ServletAsignacion")
public class ServletAsignacion extends HttpServlet {
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
                    listarAsignacion(request, response);
                    break;
                
                case "editar":
                    // Editar otras acciones
                    break;
                    
                case "eliminar":
                    // Eliminar otras acciones
                    eliminarAsignacion(request, response);
                    break;
            }
        }
    }
    
    private void listarAsignacion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Asignacion> listaAsignaciones = new AsignacionVacunaMascotaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaAsignaciones);
        response.sendRedirect("asignacionesVacunasMascotas/asignacion-vacuna-mascota.jsp");
    }
    
    private void eliminarAsignacion(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idAsignacion = Integer.parseInt(request.getParameter("id"));
        Asignacion asignacion = new Asignacion(idAsignacion);
        
        int registrosEliminados = new AsignacionVacunaMascotaDaoImpl().delete(asignacion);
        
        if(registrosEliminados >= 1) {
            System.out.println("El registro fue eliminado con exito");
        } else {
            System.err.println("Se produjo un error al intentar eliminar el siguiente registro: " + asignacion.toString());
        }
        System.out.println("Cantidad de registros eliminados: " + registrosEliminados);
        
        listarAsignacion(request, response);
    }
}
