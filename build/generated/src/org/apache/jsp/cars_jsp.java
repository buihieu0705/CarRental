package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import dal.CarDAO;

public final class cars_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:containsIgnoreCase", org.apache.taglibs.standard.functions.Functions.class, "containsIgnoreCase", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCar == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
 request.setAttribute("error", "Not found any car!");
          out.write("\n");
          out.write("            ");
 request.setAttribute("mess", "Go to home");
          out.write("\n");
          out.write("            ");
 request.setAttribute("href", "home.jsp");
          out.write("\n");
          out.write("            ");
 request.getRequestDispatcher("error.jsp").forward(request, response);
          out.write("\n");
          out.write("        ");
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
      out.write("        <div id=\"wrapper\" class=\"hasbg transparent\">\n");
      out.write("            ");
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
      out.write("            ");
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
      out.write("                <link rel='stylesheet' href='css/leftalignmenu.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' href='css/kirki.css' type='text/css' media='all' />\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ec811f6ffe.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        ");
CarDAO db = new CarDAO();
      out.write("\n");
      out.write("        ");
request.setAttribute("listCarBrand", db.getCarBrand());
      out.write("\n");
      out.write("        ");
request.setAttribute("listCarType", db.getCarType());
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <video autoplay=\"autoplay\" muted=\"muted\" loop=\"loop\" width=\"100%\">\n");
      out.write("            <source src=\"video/header.mp4\" type=\"video/mp4\" >\n");
      out.write("            Your browser does not support the video tag. I suggest you upgrade your browser.\n");
      out.write("        </video> \n");
      out.write("        <div id=\"page_content_wrapper\">\n");
      out.write("            <form class=\"car_search_form\" action=\"../../Demo/search\">\n");
      out.write("                <div class=\"one_fourth \">\n");
      out.write("                    <select name=\"brand\">\n");
      out.write("                        <option value=\"\">Any Brand</option>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <i class=\"fas fa-chevron-down\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"one_fourth \">\n");
      out.write("                    <select name=\"type\">\n");
      out.write("                        <option value=\"\">Any Type</option>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <i class=\"fas fa-chevron-down\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"one_fourth\">\n");
      out.write("                    <select name=\"sort_by\">\n");
      out.write("                        <option value=\"asc\">Price Low to High</option>\n");
      out.write("                        <option value=\"desc\">Price High to Low</option>\n");
      out.write("                    </select>\n");
      out.write("                    <i class=\"fas fa-chevron-down\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"one_fourth last \">\n");
      out.write("                    <input type=\"submit\" value=\"Search\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <div class=\"standard_wrapper sidebar_content gallery classic two_cols\" style=\"margin-top: 100px;\" >\n");
      out.write("                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br class=\"clear\" />\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"pagination\" style=\"margin-left: 500px;\">\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
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
      out.write("        </div>\n");
      out.write("    </body>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCarBrand}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("brand");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCarType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("type");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCar != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCar}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("c");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"element portfolio_type\">\n");
          out.write("                            <a  href=\"cardetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 346.29px;\"/>\n");
          out.write("                            </a>\n");
          out.write("                            <div class=\"portfolio_info_wrapper\">\n");
          out.write("                                <div class=\"car_attribute_wrapper\">\n");
          out.write("                                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.model}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                    <div class=\"one_fourth\">\n");
          out.write("                                        <div ><i class=\"far fa-user\"></i></div>\n");
          out.write("                                        <div style=\"font-size: 20px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.seat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"one_fourth\">\n");
          out.write("                                        <div ><i class=\"fas fa-car-side\"></i></div>\n");
          out.write("                                        <div style=\"font-size: 20px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.door}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"one_fourth\">\n");
          out.write("                                        <div><i class=\"fas fa-cogs\"></i></div>\n");
          out.write("                                        <div style=\"font-size: 20px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:containsIgnoreCase(c.tranmission, \"Automatic\")?\"Auto\":c.tranmission}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("</div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"car_attribute_price\">\n");
          out.write("                                    <div class=\"car_attribute_price_day\">\n");
          out.write("                                        <span class=\"single_car_currency\">$</span><span class=\"single_car_price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span><br>\n");
          out.write("                                        <span>Per Day</span>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("size");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.parseInt(requestScope.size)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("i");
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.parseInt(requestScope.numPage)}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a href=\"search?brand=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.searchByBrand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.searchByType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&sort_by=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.searchBySortBy}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&start=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(i - 1) * 6}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&end=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${((i * 6) > size) ? size : (i * 6)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
