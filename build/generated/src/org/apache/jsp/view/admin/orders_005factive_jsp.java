package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Order;
import java.util.ArrayList;

public final class orders_005factive_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
 ArrayList<Order> orders_active = (ArrayList<Order>) request.getAttribute("orders_active");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>List oders active</h1>\n");
      out.write("        <table border=\"1px\">\n");
      out.write("            <tr>\n");
      out.write("                <td>STT</td>\n");
      out.write("                <td>Full Name</td>\n");
      out.write("                <td>User Name</td>\n");
      out.write("                <td>Gmail User</td>\n");
      out.write("                <td>Phone Number</td>\n");
      out.write("                <td>Account Netflix</td>\n");
      out.write("                <td>Slot</td>\n");
      out.write("                <td>Start Date</td>\n");
      out.write("                <td>Time</td>\n");
      out.write("                <td>Type</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 
                int i=1;
                for (Order o : orders_active) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getFullname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getUsername());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getGmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getSdt());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getAccNetf());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getSlot());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getStartDate());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getTime());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(o.getType());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 i++;
                    }
      out.write("\n");
      out.write("        </table>    \n");
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
