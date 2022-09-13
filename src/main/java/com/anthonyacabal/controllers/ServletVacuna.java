package com.anthonyacabal.controllers;


import com.anthonyacabal.models.dao.VacunaDaoImpl;
import com.anthonyacabal.models.dao.VacunaDaoJPA;
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
                    eliminarVacuna(request, response);
                    break;
            }
        }
    }
    
    private void listarVacunas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Vacuna> listaVacunas = new VacunaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaVacunas);
        response.sendRedirect("vacunas/vacuna.jsp");
    }
    
    private void eliminarVacuna(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idVacuna = Integer.parseInt(request.getParameter("id"));
        Vacuna vacuna = new VacunaDaoJPA().get(new Vacuna(idVacuna));
        
        int registrosEliminados = new VacunaDaoJPA().delete(vacuna);
        
        if(registrosEliminados >=1) {
            System.out.println("El registro fue eliminado con exito");
        } else {
            System.err.println("Se produjo un error al intentar eliminar el siguiente registro");
        }
        System.out.println("Cantidad de registros eliminados: " + registrosEliminados);
        
        listarVacunas(request, response);
    }
}
