package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormServlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Silownia</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<body>\n");
      out.write("  <form method=\"post\" action=\"DataServlet.jsp\">\n");
      out.write("        Podaj nazwe cwiczenia: <br />\n");
      out.write("        <input type=\"text\" name=\"nazwaCwieczenia\" /><br />\n");
      out.write("        Podaj wage ciezaru: <br />\n");
      out.write("        <input type=\"text\" name=\"ciezar\" /><br />\n");
      out.write("        Doswiadczenie: <br />\n");
      out.write("        Brak <input type=\"radio\" name=\"doswiadczenie\" value=\"Brak\">\n");
      out.write("        Srednie <input type=\"radio\" name =\"doswiadczenie\" value = \"Srednie\">\n");
      out.write("        Duze <input type=\"radio\" name = \"doswiadczenie\" value = \"Duze\">\n");
      out.write("        <br/>\n");
      out.write("        Sprzet: <br/>\n");
      out.write("        Hantle <input type=\"checkbox\" name=\"sprzet\" value=\"Hantle\">\n");
      out.write("        Sztanga <input type=\"checkbox\" name=\"sprzet\" value=\"Sztanga\">\n");
      out.write("        Maszyny <input type=\"checkbox\" name=\"sprzet\" value=\"Maszyny\">\n");
      out.write("        <br/>\n");
      out.write("        Laweczka <input type=\"checkbox\" name=\"sprzet\" value=\"Laweczka\">\n");
      out.write("        Wyciag <input type=\"checkbox\" name=\"sprzet\" value=\"Wyciag\">\n");
      out.write("        Bieznia <input type=\"checkbox\" name=\"sprzet\" value=\"Bieznia\">\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        Trening wybranych partii miesni:\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <select name =\"miesnie\" multiple=\"multiple\">\n");
      out.write("        \n");
      out.write("    \n");
      out.write("         <option value=\"Triceps\">Triceps</option>\n");
      out.write("         <option value=\"Biceps\">Biceps</option>\n");
      out.write("         <option value = \"Klatka Piersiowa\">Klatka Piersiowa</option>\n");
      out.write("         <option value=\"Uda\">Uda</option>\n");
      out.write("         <option value=\"Lydki\">Lydki</option>\n");
      out.write("         <option value=\"Barki\">Barki</option>\n");
      out.write("         <option value=\"Brzuch\">Brzuch</option>\n");
      out.write("        \n");
      out.write("        </select>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("         <input type=\"submit\" value=\"Akceptuj\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
