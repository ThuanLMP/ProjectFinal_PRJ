package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Account_netf;

public final class list_005faccounts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>List User Page</title>\n");
      out.write("        ");

            ArrayList<Account_netf> accs = (ArrayList<Account_netf>) request.getAttribute("accs");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>List account</h1>\n");
      out.write("        <table boder=\"1px\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>GMAIL</th>\n");
      out.write("                    <th>PASSWORD</th>\n");
      out.write("                    <th>PURCHASE PRICE</th>\n");
      out.write("                    <th>SALE PRICE</th>\n");
      out.write("                    <th>SLOT</th>\n");
      out.write("                    <th>TYPE</th>\n");
      out.write("                    <th>ACTIVE</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("           ");
 
                for (Account_netf a : accs ) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print(a.getId());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getGmail());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getPassword());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getPurPrice());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getSalePrice());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getSlot());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getType());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(a.getActive());
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
