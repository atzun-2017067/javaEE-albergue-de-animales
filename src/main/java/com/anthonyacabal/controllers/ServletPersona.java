package com.anthonyacabal.controllers;

import com.anthonyacabal.models.domain.Persona;
import com.anthonyacabal.models.dao.PersonaDaoImpl;
import com.anthonyacabal.models.dao.PersonaDaoJPA;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; //Clase que va a permitir las peticiones
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; // Manejar sesiones y estados, redireccionar una petición hacia otra petiición
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Anthony Acabal
 */

@WebServlet("/ServletPersona")
public class ServletPersona extends HttpServlet {
    
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
                    listarPersonas(request, response);
                    break;
                
                case "editar":
                    // Editar otras acciones
                    break;
                    
                case "eliminar":
                    // Eliminar otras acciones
                    eliminarPersona(request, response);
                    break;
            }
        }
    }
    
    private void listarPersonas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Persona> listaPersonas = new PersonaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaPersonas);
        response.sendRedirect("personas/persona.jsp");
    }
    
    private void eliminarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idPersona = Integer.parseInt(request.getParameter("id"));
        Persona persona = new PersonaDaoJPA().get(new Persona(idPersona));
        
        //Estudiante estudiante = new Estudiante(idEstudiante);
        //int registrosEliminados = new EstudianteDaoImpl().delete(estudiante/*es el método que se creó a la línea anterior*/);
        
        int registrosEliminados = new PersonaDaoJPA().delete(persona);
        
        if(registrosEliminados >= 1) {
            System.out.println("El registro fue eliminado con exito");
        } else {
            System.err.println("Se produjo un error al intentar eliminar el siguiente registro");
        }
        System.out.println("Cantidad de registros eliminados: " + registrosEliminados);
        
        listarPersonas(request, response);
    }
    
}

// La información puede viajar por 2 vías, en el get se va con la URL, el método POS viaja en una serie de paquetes; implementar un metodo para el get y el POS;