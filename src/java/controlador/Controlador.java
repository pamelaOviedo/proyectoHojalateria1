/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.productoDAO;

/**
 *
 * @author Usuario
 */
public class Controlador extends HttpServlet {
    String nombredefecto="pame";
    String passdefecto="rocio";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       // String menu=requesl.getparamet("menu");
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Ingresar":
                String nombre = request.getParameter("txtuser");
                String contra = request.getParameter("txtpass");
                if (nombredefecto.equals(nombre) && passdefecto.equals(contra)) {
                    response.sendRedirect("PantallaPrincipal.jsp");
                }
                break;
                case "ListarProducto":
                    productoDAO pDAO= new productoDAO();
                    List listaProductos= pDAO.listar();
                    request.setAttribute("lista2", listaProductos);
                    request.getRequestDispatcher("producto.jsp").forward(request, response);
                break;
                
                case "Agregar":
                    
                    
                    
                    request.getRequestDispatcher("producto.jsp").forward(request, response);
                    
                    break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
