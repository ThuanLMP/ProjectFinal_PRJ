package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Products</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <style>\n");
      out.write("            .content {\n");
      out.write("                height: 200px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                background-color: azure;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                height: 190px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bn11 {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 0.5em 1.7em;\n");
      out.write("                margin: 0 0.1em 0.1em 0;\n");
      out.write("                border: 0.16em solid rgba(255, 255, 255, 0);\n");
      out.write("                background-color: rgb(80, 10, 172);\n");
      out.write("                border-radius: 2em;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: \"Roboto\", sans-serif;\n");
      out.write("                font-weight: 300;\n");
      out.write("                color: #ffffff;\n");
      out.write("                text-shadow: 0 0.04em 0.04em rgba(0, 0, 0, 0.35);\n");
      out.write("                text-align: center;\n");
      out.write("                transition: all 0.2s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.bn11:hover {\n");
      out.write("                border-color: rgb(255, 255, 255);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container px-4 px-lg-5\">\n");
      out.write("                <h2 class=\"navbar-brand\">Netflix Store</h2>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                        data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                        aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"./home\">Home</a></li>\n");
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"d-flex\">\n");
      out.write("                        <button class=\"btn btn-outline-dark\" type=\"submit\">\n");
      out.write("                            <i class=\"bi-cart-fill me-1\"></i>\n");
      out.write("                            Cart\n");
      out.write("                            <span class=\"badge bg-dark text-white ms-1 rounded-pill\">0</span>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Header-->\n");
      out.write("        <header class=\"card\">\n");
      out.write("\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h4>TẠI SAO NÊN CHỌN CHÚNG TÔI</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 card text-info content\">\n");
      out.write("\n");
      out.write("                        <h5>Giá rẻ nhất</h5>\n");
      out.write("                        Cam kết giá rẻ nhất thị trường Việt Nam, chỉ với từ 60k/tháng rẻ gấp 4 lần so với giá gốc 260k/tháng\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 card text-warning content\">\n");
      out.write("                        <h5>Chất lượng 4k</h5>\n");
      out.write("                        Cam kết chỉ bán tài khoản Netflix Premium 4K gói 3 tháng, 6 tháng Netflix chính chủ\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 card text-danger content\">\n");
      out.write("                        <h5>Cam kết hài lòng</h5>\n");
      out.write("                        100% tài khoản Netflix chính chủ. Khách hàng sử dụng slot riêng biệt trên mỗi tk. Bảo hành 1 đổi 1.\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- Section-->\n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("                    <div class=\"col mb-5\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <!-- Product image-->\n");
      out.write("                            <img class=\"card-img-top\"\n");
      out.write("                                 src=\"https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686\"\n");
      out.write("                                 alt=\"...\" />\n");
      out.write("                            <!-- Product details-->\n");
      out.write("                            <div class=\"card-body p-4\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <!-- Product name-->\n");
      out.write("                                    <h5 class=\"fw-bolder\">7SHARE</h5>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                    32.000 đ/tháng\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                <div class=\"text-center\"><a href=\"/\" class=\"bn11\">Buy it</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col mb-5\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <!-- Product image-->\n");
      out.write("                            <img class=\"card-img-top\"\n");
      out.write("                                 src=\"https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686\"\n");
      out.write("                                 alt=\"...\" />\n");
      out.write("                            <!-- Product details-->\n");
      out.write("                            <div class=\"card-body p-4\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <!-- Product name-->\n");
      out.write("                                    <h5 class=\"fw-bolder\">STANDARD</h5>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                    55.000 đ/ tháng\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                <div class=\"text-center\"><a href=\"/\" class=\"bn11\">Buy it</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col mb-5\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <!-- Product image-->\n");
      out.write("                            <img class=\"card-img-top\"\n");
      out.write("                                 src=\"https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686\"\n");
      out.write("                                 alt=\"...\" />\n");
      out.write("                            <!-- Product details-->\n");
      out.write("                            <div class=\"card-body p-4\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <!-- Product name-->\n");
      out.write("                                    <h5 class=\"fw-bolder\">2-END</h5>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                    70.000 đ/tháng\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                <div class=\"text-center\"><a href=\"/\" class=\"bn11\">Buy it</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Footer-->\n");
      out.write("    <footer class=\"py-5 bg-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"m-0 text-center text-white\">Contact: FACEBOOK - SDT: 0388684080</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Bootstrap core JS-->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- Core theme JS-->\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
