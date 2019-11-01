/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.DatosPersonales;
import logica.Rutina;

/**
 *
 * @author eandr
 */
@WebServlet(name = "GimnasioServlet", urlPatterns = {"/GimnasioServlet"})
public class GimnasioServlet extends HttpServlet {

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
        Rutina TypeRutina = new Rutina();
        DatosPersonales DatosPe = new DatosPersonales();
        response.setContentType("text/html;charset=UTF-8");
        DatosPe.setNombre(request.getParameter("nombre"));
        DatosPe.setApellido(request.getParameter("apellido"));
        DatosPe.setDireccion(request.getParameter("direccion"));
        DatosPe.setIdentificacion(request.getParameter("identificaion"));
        DatosPe.setNumeroid(request.getParameter("numeroid"));
        DatosPe.setNumeroTelefonico(request.getParameter("numeroTelefonico"));
        DatosPe.setSexo(request.getParameter("sexo"));
        DatosPe.setEstatura(request.getParameter("estatura"));
        DatosPe.setPeso(request.getParameter("peso"));
        DatosPe.setRutina(request.getParameter("rutina"));
        TypeRutina.setTipoRutina(DatosPe.getRutina());
        TypeRutina.RutinaDias(DatosPe.getRutina());
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GimnasioServlet</title>"); 
             out.println("<link rel='stylesheet' type='text/css' href='css/font2.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p id='T1'>TU RUTINA</p>");
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 1</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Biceps" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio2() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Triceps" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio3() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 2</p></td></tr>");
            out.println("<tr>");
           out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Pecho" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio4() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Abdominales" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio5() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 3</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Pierna" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio6() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Gluteos" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio7() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 4</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Espalda" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio8() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Hombros" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio9() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 5</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Pecho" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio4() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Espalda" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio8() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 6</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Pierna" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio6() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Abdominales" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio5() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            
            TypeRutina.RutinaDias(DatosPe.getRutina());
            out.println("<table border='3'>");
            out.println("<tr><td colspan='4'><p id='ST1'>Dia 7</p></td></tr>");
            out.println("<tr>");
            out.println("<td>" + "<p id='ST2'>Parte Del Cuerpo</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Ejercicio</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Repeticiones</p>" + "</td>");
            out.println("<td>" + "<p id='ST2'>Peso</p>" + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Calentamiento" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio1() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones1() + "</td>");
            out.println("<td>" + TypeRutina.getPeso1() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Biceps" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio2() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones2() + "</td>");
            out.println("<td>" + TypeRutina.getPeso2() + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + "Pecho" + "</td>");
            out.println("<td>" + TypeRutina.getEjercicio4() + "</td>");
            out.println("<td>" + TypeRutina.getRepeticiones3() + "</td>");
            out.println("<td>" + TypeRutina.getPeso3() + "</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
