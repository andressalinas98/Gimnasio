package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <title>Gimnasio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"javascript/javascript.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"GET\"  action=\"GimnasioServlet\" name=\"form1\" id=\"form1\" >\n");
      out.write("            <p id=\"Titulo1\">GIMNASIO</p>\n");
      out.write("            <p id=\"Subtitulos\">DATOS PERSONALES</p>\n");
      out.write("            <table border=\"3\" name=\"tabla1\" id=\"tabla1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <p id=\"ST1\">INFORMACION PERSONAL</p>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td >\n");
      out.write("                        <p>Nombres</br></p>\n");
      out.write("                        <input type=\"text\" name=\"nombre\" id=\"nombre\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Apellidos</br></p>\n");
      out.write("                        <input type=\"text\" name=\"apellido\" id=\"apellido\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Direccion</p>\n");
      out.write("                        <input type=\"text\" name=\"direccion\" id=\"direccion\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Tipo de identificacion</p>\n");
      out.write("                        <label><input type=\"radio\" name=\"identificacion\" id=\"identificacion\" value=\"Cedula\" required>Cedula</label>\n");
      out.write("                        <label><input type=\"radio\" name=\"identificacion\" id=\"identificacion\" value=\"Tarjeta de identidad\">Tarjeta de identidad</label></br>\n");
      out.write("                        <input type=\"number\" name=\"numeroid\" id=\"numeroid\" placeholder=\"Numero\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Numero telefonico</p>\n");
      out.write("                        <input type=\"number\" name=\"numeroTelefonico\" id=\"numeroTelefonico\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Sexo</p>\n");
      out.write("                        <label>Masculino<input type=\"radio\" name=\"sexo\" id=\"sexo\" value=\"Masculino\" required></label>\n");
      out.write("                        <label>Femenino<input type=\"radio\" name=\"sexo\" id=\"sexo\" value=\"Femenino\"></label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <p id=\"ST1\">INFORMACION FISICA</p>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Estatura (En centimetros)</p>\n");
      out.write("                        <input type=\"number\" name=\"estatura\" id=\"estatura\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Peso (En Kilogramos)</p>\n");
      out.write("                        <input type=\"number\" name=\"peso\" id=\"peso\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <p>Tipo De Rutina</p>\n");
      out.write("\t\t\t\t<select name=\"rutina\" id=\"rutina\">\n");
      out.write("\t\t\t\t\t<option value=\"Ganar Masa Muscular\" selected>--Seleccionar--</option>\n");
      out.write("\t\t\t\t\t<option value=\"Perder Peso\">En curso</option>\n");
      out.write("                       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <td colspan=\"3\"><input type=\"submit\" value=\"Enviar\"  onclick=\"validarFormulario()\"></input>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
