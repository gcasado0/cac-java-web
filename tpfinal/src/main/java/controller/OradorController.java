package controller;

//import database.OradorDAO;
import database.OradorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Orador;

/**
 *
 * @author gcasado0
 */
@WebServlet(name = "OradorController", urlPatterns = {"/orador/*"})
public class OradorController extends HttpServlet {

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
        try {
            String action = request.getPathInfo();
            OradorDAO odao = new OradorDAO();
            switch (action) {
                case "/create":
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String titulo = request.getParameter("titulo");
                    String resumen = request.getParameter("resumen");
                    String inicio = request.getParameter("inicio");
                    Orador o = new Orador(0L,nombre, apellido, titulo, resumen, inicio);                    
                    int salida = odao.createOrador(o);
                    if (salida>0){
                        //actualizar lista de oradores en sesion
                        HttpSession session = request.getSession();
                        session.setAttribute("oradores", odao.getAll());                        
                        //asi esta jsp puede mostrar la lista de oradores actualizada
                        response.sendRedirect(request.getContextPath()+"/views/list-oradores.jsp");
                    }                    
                    break;  
                case "/list":                    
                    HttpSession session = request.getSession();
                    session.setAttribute("oradores", odao.getAll());        
                    response.sendRedirect(request.getContextPath()+"/views/list-oradores.jsp");
            }
            
        } catch (Exception ex) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prueba</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet prueba at " + request.getContextPath() + "</h1>");
            out.println("<h2>Error: " + ex.getMessage() + "</h2>");
            out.println("</body>");
            out.println("</html>");
            Logger.getLogger(OradorController.class.getName()).log(Level.SEVERE, null, ex);
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
