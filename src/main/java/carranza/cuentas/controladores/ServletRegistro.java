/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carranza.cuentas.controladores;

import com.registro.model.Perro;
import com.registro.model.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletRegistro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Perro perro=new Perro();
        perro.setNombre("kukis");
        Persona p=new Persona();
        p.setPerro(perro);
        request.setAttribute("registro", p);
        RequestDispatcher despachador= request.getRequestDispatcher("/registro.jsp");
        despachador.forward(request, response);
        
    }
}