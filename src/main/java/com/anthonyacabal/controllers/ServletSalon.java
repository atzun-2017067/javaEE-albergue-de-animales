package com.anthonyacabal.controllers;


import com.anthonyacabal.models.dao.SalonDaoImpl;
import com.anthonyacabal.models.domain.Salon;
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
 * @author informatica
 */

@WebServlet("/ServletSalon")
public class ServletSalon extends HttpServlet {
    
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
                    listarSalones(request, response);
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
    
    private void listarSalones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Salon> listaSalones = new SalonDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaSalones);
        response.sendRedirect("salones/salon.jsp");
    }
     
}

// La información puede viajar por 2 vías, en el get se va con la URL, el método POS viaja en una serie de paquetes; implementar un metodo para el get y el POS;