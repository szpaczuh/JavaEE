package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DataServlet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      com.silownia.servletsilownia.domain.Silownia silownia = null;
      synchronized (session) {
        silownia = (com.silownia.servletsilownia.domain.Silownia) _jspx_page_context.getAttribute("silownia", PageContext.SESSION_SCOPE);
        if (silownia == null){
          silownia = new com.silownia.servletsilownia.domain.Silownia();
          _jspx_page_context.setAttribute("silownia", silownia, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write(" \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("silownia"), request);
      out.write("\n");
      out.write(" \n");
      out.write("    <!-- Ponowne użycie tagu jsp:useBean ładujący źródło danych. -->\n");
      out.write("    ");
      com.example.servletsilownia.service.StorageService dataSource = null;
      synchronized (session) {
        dataSource = (com.example.servletsilownia.service.StorageService) _jspx_page_context.getAttribute("dataSource", PageContext.SESSION_SCOPE);
        if (dataSource == null){
          dataSource = new com.example.servletsilownia.service.StorageService();
          _jspx_page_context.setAttribute("dataSource", dataSource, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write(" \n");
      out.write("    <!-- Wyświetlenie nazwy użytkownika. -->\n");
      out.write("    Nazwa Cwiczenia: ");
      out.print( silownia.getNazwaCwiczenia() );
      out.write("<br />\n");
      out.write("    Ciezar ");
      out.print( silownia.getCiezar() );
      out.write("<br />\n");
      out.write("    Doswiadczenie ");
      out.print( silownia.getDoswiadczenie() );
      out.write("<br />\n");
      out.write("    Sprzet ");
      out.print( silownia.getSprzet() );
      out.write("<br />\n");
      out.write("    Miesnie ");
      out.print( silownia.getPartieciala() );
      out.write("<br />\n");
      out.write("    <!-- Logika sprawdzająca poprawność parametrów logowania. -->\n");
      out.write("    ");
 String result = "Dane niepoprawne";
 
    
      out.write("\n");
      out.write(" \n");
      out.write("    <!-- Zwrócenie wynikowego stringa \"result\" -->\n");
      out.write("    ");
      out.print( result );
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
