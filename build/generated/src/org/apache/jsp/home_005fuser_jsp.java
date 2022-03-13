package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write("            />\n");
      out.write("        <title>Netflix</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css\"\n");
      out.write("            integrity=\"sha512-Oy+sz5W86PK0ZIkawrG0iv7XwWhYecM3exvUtMKNJMekGFJtVAhibhRPTpmyTj8+lJCkmWfnpxKgT2OopquBHA==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("        <style>\n");
      out.write("            html {\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("            #header {\n");
      out.write("                padding: 0px 15vw;\n");
      out.write("                align-items: center;\n");
      out.write("                box-shadow: inset 0 0 0 2000px rgb(0 0 0 / 50%);\n");
      out.write("                background: url('./images/cover.jpg');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: top;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            #quote-ava {\n");
      out.write("                max-height: 50px;\n");
      out.write("            }\n");
      out.write("            #main-home-content {\n");
      out.write("                transform: translateY(-17%);\n");
      out.write("            }\n");
      out.write("            #navbar {\n");
      out.write("                min-height: 88px;\n");
      out.write("                min-width: 100%;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("                padding-right: 180px;\n");
      out.write("            }\n");
      out.write("            #header-logo {\n");
      out.write("                position: absolute;\n");
      out.write("                height: 36px;\n");
      out.write("                width: auto;\n");
      out.write("                bottom: 36px;\n");
      out.write("                user-select: none;\n");
      out.write("                -webkit-user-drag: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #login-btn {\n");
      out.write("                padding: 4px 16px;\n");
      out.write("                margin-left: 8px;\n");
      out.write("                /* position: absolute; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #login-btn i {\n");
      out.write("                margin-right: 4px;\n");
      out.write("            }\n");
      out.write("            .hidden {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex flex-column h-100\">\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("            <!-- Navigation-->\n");
      out.write("            <!-- Header-->\n");
      out.write("            <header class=\"vh-100 row justify-content-center\" id=\"header\">\n");
      out.write("                <div class=\"container px-5\">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div\n");
      out.write("                        class=\"row gx-10 align-items-center justify-content-center\"\n");
      out.write("                        id=\"main-home-content\"\n");
      out.write("                        >\n");
      out.write("                        <div class=\"col-lg-8 col-xl-6 col-xxl-6\">\n");
      out.write("                            <div class=\"my-5 text-center text-xl-start\">\n");
      out.write("                                <h1\n");
      out.write("                                    class=\"display-5 fw-bolder text-white mb-2\"\n");
      out.write("                                    style=\"font-size: 42px\"\n");
      out.write("                                    >\n");
      out.write("                                    |𝗧𝗥𝗔𝗡𝗔𝗡𝗛 <br />|𝗣𝗥𝗘𝗠𝗜𝗨𝗠 𝗔𝗖𝗖𝗢𝗨𝗡𝗧\n");
      out.write("                                </h1>\n");
      out.write("                                <p class=\"lead fw-normal text-white-50 mb-4\">\n");
      out.write("                                    Chúng tôi cung cấp tài khoản bản quyền uy\n");
      out.write("                                    tín,<br />\n");
      out.write("                                    chất lượng, giá tốt nhất!\n");
      out.write("                                </p>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start\"\n");
      out.write("                                    >\n");
      out.write("                                    <a\n");
      out.write("                                        class=\"btn btn-danger btn-lg px-4 me-sm-3\"\n");
      out.write("                                        href=\"#\"\n");
      out.write("                                        >Mua ngay</a\n");
      out.write("                                    >\n");
      out.write("                                    <a\n");
      out.write("                                        href=\"#features\"\n");
      out.write("                                        class=\"btn btn-outline-danger btn-lg px-4 me-sm-3\"\n");
      out.write("                                        >\n");
      out.write("                                        Tìm hiểu thêm\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"col-xl-6 col-xxl-6 d-none d-xl-block text-center\"\n");
      out.write("                            ></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <img id=\"header-logo\" src=\"./images/netflix.png\" alt=\"\" />\n");
      out.write("            </header>\n");
      out.write("            <!-- Features section-->\n");
      out.write("            <section class=\"py-5\" id=\"features\">\n");
      out.write("                <div class=\"container px-5 my-5\">\n");
      out.write("                    <div class=\"row gx-5\">\n");
      out.write("                        <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                            <h2 class=\"fw-bolder mb-0\">\n");
      out.write("                                Dịch vụ cho thuê <br />\n");
      out.write("                                tài khoản Netflix giá rẻ.\n");
      out.write("                            </h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <div class=\"row gx-5 row-cols-1 row-cols-md-2\">\n");
      out.write("                                <div class=\"col mb-5 h-100\">\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"\n");
      out.write("                                        >\n");
      out.write("                                        <i class=\"bi bi-collection\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h2 class=\"h5\">Giá rẻ nhất</h2>\n");
      out.write("                                    <p class=\"mb-0\">\n");
      out.write("                                        Cam kết giá rẻ nhất thị trường Việt Nam, chỉ với từ 32k/tháng so với giá gốc 260k/tháng\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col mb-5 h-100\">\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"\n");
      out.write("                                        >\n");
      out.write("                                        <i class=\"bi bi-building\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h2 class=\"h5\">Cam kết hài lòng</h2>\n");
      out.write("                                    <p class=\"mb-0\">\n");
      out.write("                                        100% tài khoản Netflix chính chủ Việt Nam. Slot được tạo riêng biệt cho mỗi khách hàng. Bảo hành 1 đổi 1.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col mb-5 mb-md-0 h-100\">\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"\n");
      out.write("                                        >\n");
      out.write("                                        <i class=\"bi bi-toggles2\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h2 class=\"h5\">Thưởng thức trên TV của bạn</h2>\n");
      out.write("                                    <p class=\"mb-0\">\n");
      out.write("                                        Xem trên TV thông minh, Playstation, Xbox, Chromecast, Apple TV, đầu phát Blu-ray và nhiều thiết bị khác.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col h-100\">\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"\n");
      out.write("                                        >\n");
      out.write("                                        <i class=\"bi bi-toggles2\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h2 class=\"h5\">Tải xuống xem ngoại tuyến</h2>\n");
      out.write("                                    <p class=\"mb-0\">\n");
      out.write("                                        Tải xuống dễ dàng và xem ngoại tuyến tất cả các bộ phim yêu thích. Tiết kiệm dữ liệu tối đa.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Testimonial section-->\n");
      out.write("            <div class=\"py-5 bg-light\">\n");
      out.write("                <div class=\"container px-5 my-5\">\n");
      out.write("                    <div class=\"row gx-5 justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-10 col-xl-7\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <div class=\"fs-4 mb-4 fst-italic\">\n");
      out.write("                                    \"Chúng tôi luôn cố gắng là đơn vị cung cấp\n");
      out.write("                                    dịch vụ tài khoản bản quyền tốt nhất, luôn\n");
      out.write("                                    có được sự tin tưởng của quý khách!\"\n");
      out.write("                                </div>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"d-flex align-items-center justify-content-center\"\n");
      out.write("                                    >\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"rounded-circle me-3\"\n");
      out.write("                                        id=\"quote-ava\"\n");
      out.write("                                        src=\"https://scontent.fhan5-4.fna.fbcdn.net/v/t1.6435-9/121706040_400498104674005_647580325258626460_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=174925&_nc_ohc=Cw6A_FtXMuUAX8VDgKp&_nc_ht=scontent.fhan5-4.fna&oh=00_AT9-7-tIsOzIvjJ2tlu-afhTrvDNb88VmX4wW4E8aS2XDQ&oe=625125B2\"\n");
      out.write("                                        alt=\"...\"\n");
      out.write("                                        />\n");
      out.write("                                    <div class=\"fw-bold\">\n");
      out.write("                                        Trần Văn Thuận\n");
      out.write("                                        <span class=\"fw-bold text-primary mx-1\"\n");
      out.write("                                              >/</span\n");
      out.write("                                        >\n");
      out.write("                                        CEO\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\n");
        out.write("                            <li class=\"nav-item dropdown\">\n");
        out.write("                                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
        out.write("                                <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
        out.write("                                    <li><a class=\"dropdown-item\" href=\"./logout\">Logout</a></li>\n");
        out.write("                                </ul>\n");
        out.write("                            </li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        <nav id=\"navbar\">\n");
        out.write("                            <a\n");
        out.write("                                id=\"login-btn\"\n");
        out.write("                                class=\"btn btn-secondary\"\n");
        out.write("                                href=\"./login\"\n");
        out.write("                                >\n");
        out.write("                                Login\n");
        out.write("                            </a>\n");
        out.write("                            <a\n");
        out.write("                                href=\"./signup\"\n");
        out.write("                                id=\"login-btn\"\n");
        out.write("                                class=\"btn btn-outline-secondary\"\n");
        out.write("                                >\n");
        out.write("                                Register\n");
        out.write("                            </a>\n");
        out.write("                        </nav>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
