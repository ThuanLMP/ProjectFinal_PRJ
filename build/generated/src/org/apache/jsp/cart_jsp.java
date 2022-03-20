package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.OrderDetail;
import model.OrderCart;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Shopping Cart</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\">\n");
      out.write("        <link href=\" https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            .shopping-cart {\n");
      out.write("                padding-bottom: 50px;\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart.dark {\n");
      out.write("                background-color: #f6f6f6;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .content {\n");
      out.write("                box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .block-heading {\n");
      out.write("                padding-top: 50px;\n");
      out.write("                margin-bottom: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .block-heading p {\n");
      out.write("                text-align: center;\n");
      out.write("                max-width: 420px;\n");
      out.write("                margin: auto;\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .dark .block-heading p {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .block-heading h1,\n");
      out.write("            .shopping-cart .block-heading h2,\n");
      out.write("            .shopping-cart .block-heading h3 {\n");
      out.write("                margin-bottom: 1.2rem;\n");
      out.write("                color: #3b99e0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items {\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info {\n");
      out.write("                padding-top: 0px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info .product-name {\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info .product-name .product-info {\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info .product-name .product-info .value {\n");
      out.write("                font-weight: 400;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info .quantity .quantity-input {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 80px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .items .product .info .price {\n");
      out.write("                margin-top: 15px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary {\n");
      out.write("                border-top: 2px solid #5ea4f3;\n");
      out.write("                background-color: #f7fbff;\n");
      out.write("                height: 100%;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary h3 {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 1.3em;\n");
      out.write("                font-weight: 600;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary .summary-item:not(:last-of-type) {\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                border-bottom: 1px solid rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary .text {\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary .price {\n");
      out.write("                font-size: 1em;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shopping-cart .summary button {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
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
      out.write("            .button{\n");
      out.write("                padding-left: 100px;\n");
      out.write("                padding-right: 100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            @media (min-width: 768px) {\n");
      out.write("                .shopping-cart .items .product .info {\n");
      out.write("                    padding-top: 25px;\n");
      out.write("                    text-align: left;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .shopping-cart .items .product .info .price {\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    font-size: 22px;\n");
      out.write("                    top: 17px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .shopping-cart .items .product .info .quantity {\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .shopping-cart .items .product .info .quantity .quantity-input {\n");
      out.write("                    padding: 4px 10px;\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        ");

            OrderCart orderCart = (OrderCart) session.getAttribute("orderCart");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <main class=\"page\">\n");
      out.write("            <section class=\"shopping-cart dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                        <h2>Netflix Store</h2>\n");
      out.write("                        <p>Chất lượng hàng đầu Việt Nam</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            ");

                                if (orderCart == null) {

                            
      out.write("\n");
      out.write("                            <div> Không có sản phẩm nào được chọn </div>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"cart.jsp\">Quay lại cửa hàng</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");
 } else { 
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-12 col-lg-8\">\n");
      out.write("                                <div class=\"items\">\n");
      out.write("                                    <div class=\"product\">\n");
      out.write("                                        ");

                                            for (OrderDetail detail : orderCart.getDetails()) {
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <div class=\"info\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-5 product-name\">\n");
      out.write("                                                            <div class=\"product-name\">\n");
      out.write("                                                                <a href=\"#\"> Thông tin </a>\n");
      out.write("                                                                <div class=\"product-info\">\n");
      out.write("                                                                    <div>Loại: <span class=\"value\">");
      out.print( detail.getAccount().getType());
      out.write("</span></div>\n");
      out.write("                                                                    <div>Giá: <span class=\"value\">");
      out.print( detail.getAccount().getSalePrice());
      out.write("</span></div>\n");
      out.write("                                                                    <div>Thời gian: <span class=\"value\">1 Tháng</span></div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-2 quantity\">\n");
      out.write("                                                            <label for=\"quantity\">Tháng:</label>\n");
      out.write("                                                            <input id=\"quantity\" type=\"number\" value=\"");
      out.print( detail.getMonth());
      out.write("\"\n");
      out.write("                                                                   class=\"form-control quantity-input\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-md-3 quantity\">\n");
      out.write("                                                            <form action=\"delete_cart\" method=\"get\">\n");
      out.write("                                                                <input type=\"hidden\" value=\"");
      out.print( detail.getAccount().getType());
      out.write("\" name=\"type\"/>\n");
      out.write("                                                                <label>Xóa SP</label>                                                               \n");
      out.write("                                                                <input  type=\"submit\" value=\"Delete\"/>\n");
      out.write("                                                            </form>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-md-2 price\">\n");
      out.write("                                                           \n");
      out.write("                                                            <span>");
      out.print(detail.getTotal());
      out.write(" VND</span>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-12 col-lg-4\">\n");
      out.write("                                <div class=\"summary\">\n");
      out.write("                                    <h3>Hóa đơn</h3>\n");
      out.write("                                    <div class=\"summary-item\"><span class=\"text\">Số lượng tài khoản đã mua: </span><span\n");
      out.write("                                            class=\"price\">");
      out.print(orderCart.count());
      out.write("</span></div>\n");
      out.write("                                    <div class=\"summary-item\"><span class=\"text\">Giá tiền: </span><span\n");
      out.write("                                            class=\"price\">");
      out.print( orderCart.getTotal());
      out.write(" VND</span></div>\n");
      out.write("                                    <div class=\"summary-item\"><span class=\"text\">Giảm giá: </span><span\n");
      out.write("                                            class=\"price\">0 VND</span></div>\n");
      out.write("                                    <div class=\"summary-item\"><span class=\"text\">Thành tiền: </span><span class=\"price\">");
      out.print( orderCart.getTotal());
      out.write(" VND</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <form action=\"cart/payup\" method=\"get\">\n");
      out.write("\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" value=\"Thanh toán\" />\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"button\">\n");
      out.write("                <a type=\"button\" class=\"btn btn-primary btn-lg btn-block\" href=\"products.jsp\">Quay lại cửa hàng</a>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
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
