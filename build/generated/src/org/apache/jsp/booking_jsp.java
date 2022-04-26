package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;
import dal.OrderDAO;
import model.Car;
import dal.CommentDAO;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:split", org.apache.taglibs.standard.functions.Functions.class, "split", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\" data-menu=\"leftalign\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"pagesport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>Car Rental System</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Font_Awesome_5_regular_smile-wink.svg/768px-Font_Awesome_5_regular_smile-wink.svg.png\">\n");
      out.write("        <link rel='stylesheet' href='css/style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/leftalignmenu.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/kirki.css' type='text/css' media='all' />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
 request.setAttribute("error", "Not found information <br> about the car!");
          out.write("\n");
          out.write("        ");
 request.setAttribute("mess", "Go to home");
          out.write("\n");
          out.write("        ");
 request.setAttribute("href", "home.jsp");
          out.write("\n");
          out.write("        ");
 request.getRequestDispatcher("error.jsp").forward(request, response);
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("    <div id=\"wrapper\" class=\"hasbg transparent\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\" data-menu=\"leftalign\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"pagesport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>Car Rental System</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Font_Awesome_5_regular_smile-wink.svg/768px-Font_Awesome_5_regular_smile-wink.svg.png\">\n");
      out.write("        <link rel='stylesheet' href='css/style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/leftalignmenu.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/kirki.css' type='text/css' media='all' />\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ec811f6ffe.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header_style_wrapper\" id=\"menu\">\n");
      out.write("            <div class=\"above_top_bar\" id=\"top_bar\">\n");
      out.write("                <div class=\"page_content_wrapper\">\n");
      out.write("                    <div class=\"social_wrapper\" style=\"height: 45.29px;\" >\n");
      out.write("                        <ul style=\"margin: 0;\">\n");
      out.write("                            <li><a target=\"_blank\" href=\"https://www.facebook.com/\"><i class=\"fab fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a target=\"_blank\" href=\"http://twitter.com/\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a target=\"_blank\" href=\"http://instagram.com/\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top_contact_info\">\n");
      out.write("                        <div><span><i class=\"fas fa-map-marker-alt\"></i></span>FPT University</div>\n");
      out.write("                        <div><a href=\"tel:012.345.6789\"><span ><i class=\"fas fa-mobile-alt\"></i></span>012.345.6789</a></div>\n");
      out.write("                        <div><span><i class=\"far fa-clock\"></i></span>Mon-Fri 09.00 - 17.00</div>\n");
      out.write("                    </div>\n");
      out.write("                    <br class=\"clear\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top_bar hasbg\" id=\"menu_bar\">\n");
      out.write("                <div class=\"standard_wrapper\">\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"home.jsp\">\n");
      out.write("                            <img class = \"logo\" src=\"image/logo.png\" alt=\"Logo\">\n");
      out.write("                        </a>\n");
      out.write("                        <div id=\"menu_wrapper\">\n");
      out.write("                            <div class=\"menu-main-menu-container\" >\n");
      out.write("                                <ul class=\"nav\" >\n");
      out.write("                                    <li><a href=\"home.jsp\" style=\"padding-top: 15px;\">Home</a></li>\n");
      out.write("                                    <li><a href=\"search?brand=&type=&sort_by=asc\" style=\"padding-top: 15px;\">Cars&ensp;</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <script>\n");
      out.write("            var menu = document.getElementById('menu');\n");
      out.write("            var topbar = document.getElementById('top_bar');\n");
      out.write("            var menubar = document.getElementById('menu_bar');\n");
      out.write("            var origOffsetY = menu.offsetHeight;\n");
      out.write("\n");
      out.write("            function onScroll(e) {\n");
      out.write("                if (window.scrollY >= origOffsetY) {\n");
      out.write("                    topbar.style.display = \"none\";\n");
      out.write("                    menubar.style.backgroundColor = \"#000\";\n");
      out.write("                } else {\n");
      out.write("                    topbar.style.display = \"block\";\n");
      out.write("                    menubar.style.backgroundColor = \"rgba(0, 0, 0, 0)\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.addEventListener('scroll', onScroll);\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide my-4\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("                        <img class=\"d-block img-fluid\" src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 100%; height: 700px;\">\n");
      out.write("                </div>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_4.setPageContext(_jspx_page_context);
      _jspx_th_c_if_4.setParent(null);
      _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <!-- Begin content -->\n");
          out.write("            <div id=\"page_content_wrapper\" class=\"hasbg withtopbar \">\n");
          out.write("                <div class=\"inner\">\n");
          out.write("                    <div class=\"sidebar_content\">\n");
          out.write("                        <h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.model}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h1>\n");
          out.write("                        <div class=\"single_car_attribute_wrapper\">\n");
          out.write("                            <div class=\"one_fourth\">\n");
          out.write("                                <div class=\"car_attribute_icon\"><i class=\"fas fa-user\"></i></div>\n");
          out.write("                                <div class=\"car_attribute_content\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.seat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nbsp;Passengers </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"one_fourth \">\n");
          out.write("                                <div class=\"car_attribute_icon\"><i class=\"fas fa-car-side\"></i></div>\n");
          out.write("                                <div class=\"car_attribute_content\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.door}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nbsp; Doors </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"one_fourth\">\n");
          out.write("                                <div class=\"car_attribute_icon\"><i class=\"fab fa-steam\"></i></div>\n");
          out.write("                                <div class=\"car_attribute_content\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"one_fourth last\">\n");
          out.write("                                <div class=\"car_attribute_icon\"><i class=\"fas fa-cogs\"></i></div>\n");
          out.write("                                <div class=\"car_attribute_content\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.tranmission}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <br class=\"clear\" />\n");
          out.write("                        <div>\n");
          out.write("                            ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <h4>Overview</h4>\n");
          out.write("                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${description[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <h4>Engine, Transmission, and Performance</h4>\n");
          out.write("                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${description[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        </div>\n");
          out.write("                        <div>\n");
          out.write("                            ");
CommentDAO cmdb = new CommentDAO();
          out.write("\n");
          out.write("                            ");
OrderDAO odb = new OrderDAO();
          out.write("\n");
          out.write("                            ");
Car car = (Car) request.getAttribute("car");
          out.write("\n");
          out.write("                            ");
request.setAttribute("listComment", cmdb.getCommentByCarId(car.getId()));
          out.write("\n");
          out.write("                            ");
request.setAttribute("countComment", cmdb.countCommentByCarId(car.getId()));
          out.write("\n");
          out.write("                            <h3 class=\"comment_title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countComment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Review(s)</h3>\n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <div id=\"respond\" class=\"comment-respond\">\n");
          out.write("                                <h3 id=\"reply-title\" class=\"comment-reply-title\">Write A Review <small><a rel=\"nofollow\" id=\"cancel-comment-reply-link\" href=\"#\" style=\"display:none;\">Cancel reply</a></small></h3>\n");
          out.write("                                <form action=\"comment?carid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\" id=\"commentform\" >\n");
          out.write("                                    <p class=\"comment-form-comment\">\n");
          out.write("                                        Comment\n");
          out.write("                                        <textarea name=\"comment\" cols=\"45\" rows=\"8\" maxlength=\"65525\" required=\"required\"></textarea>\n");
          out.write("                                    </p>\n");
          out.write("                                    ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_5.setPageContext(_jspx_page_context);
          _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
          _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null && sessionScope.user.type == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
          if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
Account account = (Account) session.getAttribute("user");
              out.write("\n");
              out.write("                                        ");
request.setAttribute("isValidComment", cmdb.validComment(account.getUsername(), car.getId()));
              out.write("\n");
              out.write("                                        ");
              if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                                        ");
              if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </form>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("                    <div class=\"sidebar_wrapper\">\n");
          out.write("                        <div class=\"single_car_booking_wrapper\">\n");
          out.write("                            <div class=\"single_car_header_content\">\n");
          out.write("                                <div class=\"standard_wrapper\">\n");
          out.write("                                    <div class=\"single_car_header_price\">\n");
          out.write("                                        <span class=\"single_car_currency\">$</span><span class=\"single_car_price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        <span class=\"single_car_price_per_unit\">\n");
          out.write("                                            <span id=\"single_car_unit\">Per Day</span>\n");
          out.write("                                        </span>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <form name=\"f\" method=\"post\" class=\"wpcf7-form\" >\n");
          out.write("                                <p> \n");
          out.write("                                    <label> Full Name <br/>\n");
          out.write("                                        <input type=\"text\" id=\"rFullname\" name=\"rFullname\"\n");
          out.write("                                               placeholder=\"Charles Calhoun\"\n");
          out.write("                                               value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" \n");
          out.write("                                               size=\"40\" class=\"wpcf7-text\" required/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Email Address <br/>\n");
          out.write("                                        <input type=\"email\" required class=\"wpcf7-text\"\n");
          out.write("                                               name=\"rEmail\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" \n");
          out.write("                                               size=\"40\" placeholder=\"sample@yourcompany.com\" \n");
          out.write("                                               id=\"rEmail\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Address <br />\n");
          out.write("                                        <input type=\"text\" required class=\"wpcf7-text\" size=\"40\" \n");
          out.write("                                               name=\"rAddress\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" \n");
          out.write("                                               placeholder=\"34 Mainfield Road\" id=\"rAddress\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> City\n");
          out.write("                                        <br />\n");
          out.write("                                        <input type=\"text\" required class=\"wpcf7-text\"\n");
          out.write("                                               name=\"rCity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" \n");
          out.write("                                               size=\"40\" placeholder=\"Washington\" id=\"rCity\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Phone Number <br />\n");
          out.write("                                        <input type=\"number\" name=\"rPhone\" required\n");
          out.write("                                               value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"40\" \n");
          out.write("                                               class=\"wpcf7-text\" placeholder=\"0123456789\" \n");
          out.write("                                               style=\"border-color: #dce0e0;\" id=\"rPhone\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Pick Up Address<br />\n");
          out.write("                                        <input type=\"text\" required class=\"wpcf7-text\"\n");
          out.write("                                               name=\"pickupAddress\" size=\"40\"\n");
          out.write("                                               placeholder=\"Heatrow Airport\" \n");
          out.write("                                               id=\"pickupAddress\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Pickup Date<br />\n");
          out.write("                                        <input type=\"date\" id=\"fromDate\" required\n");
          out.write("                                               name=\"pickupDate\" value=\"mm/dd/yyyy\"\n");
          out.write("                                               class=\"wpcf7-date\" onchange=\"getTotal(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Drop Off Address<br />\n");
          out.write("                                        <input type=\"text\" required size=\"40\"\n");
          out.write("                                               name=\"dropoffAddress\" class=\" wpcf7-text\"\n");
          out.write("                                               placeholder=\"Heatrow Airport\"\n");
          out.write("                                               id=\"dropoffAddress\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Drop Off Date<br />\n");
          out.write("                                        <input type=\"date\" id =\"toDate\"\n");
          out.write("                                               name=\"dropoffDate\" required\n");
          out.write("                                               class=\" wpcf7-date\" onchange=\"getTotal(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\"/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    <label> Total<br />\n");
          out.write("                                        <input id =\"total\" name=\"total\" type=\"text\" readonly/>\n");
          out.write("                                    </label>\n");
          out.write("                                </p>\n");
          out.write("                                ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                <script>\n");
          out.write("                                    function validForm(action, id) {\n");
          out.write("                                        var fromDate = new Date(document.getElementById(\"fromDate\").value);\n");
          out.write("                                        var toDate = new Date(document.getElementById(\"toDate\").value);\n");
          out.write("                                        var currentDate = new Date();\n");
          out.write("                                        if (fromDate === currentDate) {\n");
          out.write("                                            window.alert('The pick up date must be greater than the current date');\n");
          out.write("                                        } else if (fromDate > toDate) {\n");
          out.write("                                            window.alert('The pick up date must be greater than the drop off date');\n");
          out.write("                                        } else {\n");
          out.write("                                            document.f.action = \"author?action=\" + action + \"&carid=\" + id;\n");
          out.write("                                            document.f.submit();\n");
          out.write("                                        }\n");
          out.write("                                    }\n");
          out.write("                                    function getTotal(price) {\n");
          out.write("                                        var fromDate = new Date(document.getElementById(\"fromDate\").value) !== '' ? new Date(document.getElementById(\"fromDate\").value) : null;\n");
          out.write("                                        var toDate = document.getElementById(\"toDate\").value !== '' ? new Date(document.getElementById(\"toDate\").value) : null;\n");
          out.write("                                        if (toDate && fromDate) {\n");
          out.write("                                            document.getElementById(\"total\").value = (toDate - fromDate) / 86400000 * price;\n");
          out.write("                                        }\n");
          out.write("                                    }\n");
          out.write("                                </script>\n");
          out.write("                            </form>\n");
          out.write("                            <br class=\"clear\" />\n");
          out.write("                        </div> \n");
          out.write("                        <br class=\"clear\" />\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\" data-menu=\"leftalign\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"pagesport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>Car Rental System</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Font_Awesome_5_regular_smile-wink.svg/768px-Font_Awesome_5_regular_smile-wink.svg.png\">\n");
      out.write("        <link rel='stylesheet' href='css/style.css' type='text/css' media='all' />\n");
      out.write("                <link rel='stylesheet' href='css/leftalignmenu.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/kirki.css' type='text/css' media='all' />\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ec811f6ffe.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"footer\" class=\" ppb_wrapper\">\n");
      out.write("            <ul class=\"sidebar_widget three\">\n");
      out.write("                <li>\n");
      out.write("                    <h2 class=\"widgettitle\">About Us</h2>\n");
      out.write("                    <p>Getting dressed up and traveling with good friends makes for a shared, unforgettable experience. </p>\n");
      out.write("                    <img src=\"image/logo.png\" alt=\"\" width=\"175\" height=\"24\">\n");
      out.write("                </li>\n");
      out.write("                <li style=\"margin-left: 150px;\">\n");
      out.write("                    <h2 class=\"widgettitle\">Contact Info</h2>\n");
      out.write("                    <div><i class=\"fas fa-map-marker-alt\"></i>&ensp;FPT University</div>\n");
      out.write("                    <div><a href=\"tel:012.345.6789\"><i class=\"fas fa-mobile-alt\"></i>&ensp;012.345.6789</a></div>\n");
      out.write("                    <div><i class=\"far fa-clock\"></i>&ensp;Mon-Fri 09.00 - 17.00</div>\n");
      out.write("                </li>\n");
      out.write("                <li style=\"width: 30px;\">\n");
      out.write("                    <div class=\"social_wrapper shortcode\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"facebook\"><a target=\"_blank\" title=\"Facebook\" href=\"https://www.facebook.com/\"><i class=\"fa fa-facebook\"></i></a></li><br>\n");
      out.write("                            <li class=\"twitter\"><a target=\"_blank\" title=\"Twitter\" href=\"https://twitter.com/\"><i class=\"fa fa-twitter\"></i></a></li><br>\n");
      out.write("                            <li class=\"instagram\"><a target=\"_blank\" title=\"Instagram\" href=\"https://instagram.com/\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer_bar\">\n");
      out.write("            <div class=\"footer_bar_wrapper \">\n");
      out.write("                <div class=\"menu-footer-menu-container\">\n");
      out.write("                    <ul id=\"footer_menu\" class=\"\">\n");
      out.write("                        <li><a href=\"aboutUs.jsp\">About Us</a></li>\n");
      out.write("                        <li><a href=\"faqs.jsp\">FAQs</a></li>\n");
      out.write("                        <li><a href=\"contactUs.jsp\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"copyright\">© Copyright buihieu - Project</div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><a href=\"login.jsp\" style=\"padding-top: 15px;\">Log in</a></li>\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><a href=\"author?action=addCar\" style=\"padding-top: 15px;\">Register car</a></li>\n");
        out.write("                                        <li><a href=\"author?action=manageCar\" style=\"padding-top: 15px;\">Manage car</a></li>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        <li><a href=\"#\"style=\"padding-top: 15px;\">Trips&ensp;<i class=\"fas fa-angle-down\"></i></a>\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li><a href=\"booked.jsp\" >Booked</a></li>\n");
        out.write("                                                <li><a href=\"history.jsp\" >History</a></li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li><a href=\"#\" style=\"padding-top: 15px;\"><i class=\"far fa-user-circle fa-2x\"></i></i></a>\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li><a href=\"profile.jsp\" > Profile</a></li>\n");
        out.write("                                                <li><a href=\"logout\" >Log out</a></li>\n");
        out.write("                                            </ul> \n");
        out.write("                                        </li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><a href=\"profileForAdmin?action=view\" style=\"padding-top: 15px;\">Manage profile</a></li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listImage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"carousel-item\">\n");
          out.write("                        <img class=\"d-block img-fluid\" src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 100%; height: 700px;\">\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_set_0.setVar("description");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(requestScope.car.description, '/')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listComment}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("cm");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div  id=\"comment-1\">\n");
          out.write("                                    <p style=\"font-size:125%; font-weight: bold; margin: 0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cm.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <div class=\"comment_date\" style=\"font-size: 13px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cm.createOn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cm.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <br class=\"clear\">\n");
          out.write("                                </div>\n");
          out.write("                                <hr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.isValidComment}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <p class=\"form-submit\" > <input type=\"submit\" value=\"Post Review\"> </p>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!requestScope.isValidComment}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <p class=\"button\" style=\"width: 226.19px; height: 45.45px; margin: 25px;\">\n");
        out.write("                                                You need to rent this car\n");
        out.write("                                            </p>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null || (sessionScope.user != null && sessionScope.user.type == 2)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <button class=\"button\" style=\"width: 226.19px; height: 45.45px; margin: 25px;\">\n");
        out.write("                                            <a href=\"login.jsp\" style=\"color: #fff;\">Sign in to renter account</a>\n");
        out.write("                                        </button>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null && (sessionScope.user.type == 1 || sessionScope.user.type == 3)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <input type=\"submit\" onclick=\"validForm('requestOrder',");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.car.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(")\" value=\"Request for Booking\"/>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null || (sessionScope.user != null && sessionScope.user.type == 2)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"button\" style=\"width: 226.19px; height: 45.45px;\">\n");
        out.write("                                        <a href=\"login.jsp\" style=\"color: #fff;\">Sign in to renter account</a>\n");
        out.write("                                    </button>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }
}
