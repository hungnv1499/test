package org.apache.jsp.admin;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/favicon.png\" type=\"image/png\" />\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/media.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/owl.theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/owl.transitions.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/jquery.bxslider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/elegant-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/flexslider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/flexslider-set.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/header.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
      out.write("\n");
      out.write("        <div class=\"container text-center padding-vertical-50\">\n");
      out.write("            <h2 class=\"double-line\"><span>Blog process</span></h2>\n");
      out.write("            <div class=\"container padding-bottom-100\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"tabs\">\n");
      out.write("                            <ul class=\"tab-links text-center\" id=\"tab-header\">\n");
      out.write("                                <li class=\"active\" id=\"contents\">\n");
      out.write("                                    <a href=\"#tab1\">\n");
      out.write("                                        <span>By Content</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\" id=\"article-name\">\n");
      out.write("                                    <a href=\"#tab2\">\n");
      out.write("                                        <span>By Article Name</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <!-- /tab-links -->\n");
      out.write("\n");
      out.write("                            <div class=\"tab-content\">\n");
      out.write("                                <div id=\"tab1\" class=\"tab active\">\n");
      out.write("                                    <div class=\"tab-description\">\n");
      out.write("                                        <div class=\"row justify-content-md-center padding-top-25\">\n");
      out.write("                                            <div class=\"sidebar-search padding-bottom-10\">\n");
      out.write("                                                <div class=\"row justify-content-md-center\">\n");
      out.write("                                                    <div class=\"col-md-6 form-group\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtContentSearch\" class=\"form-control\" placeholder=\"Search by content...\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-4 form-group\">\n");
      out.write("                                                        <select name=\"p_show\" id=\"p_show\" class=\"form-control\">\n");
      out.write("                                                            <option  selected=\"true\">All</option>\n");
      out.write("                                                            <option >Actived</option>\n");
      out.write("                                                            <option >Deleted</option>\n");
      out.write("                                                            <option >New</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-4 form-group\">\n");
      out.write("                                                        <input type=\"button\" class=\" btn btn-block\" value=\"Search\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- /product-search -->\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--filter-->\n");
      out.write("                                        <div class=\"row justify-content-md-center\">\n");
      out.write("                                            <div class=\"product-filter\">\n");
      out.write("                                                <div class=\"container\">\n");
      out.write("                                                    <div class=\"col-md-12\">\n");
      out.write("                                                        <div class=\"filter-content padding-horizontal-25\">\n");
      out.write("                                                            <span>Showing 1-20 of XX results</span>\n");
      out.write("                                                            <ol>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <div class=\"form-group\">\n");
      out.write("                                                                        <select id=\"order-by-date\" class=\"form-control\">\n");
      out.write("                                                                            <option value=\"\"  selected=\"true\">Ascending</option>\n");
      out.write("                                                                            <option value=\"\" >Descending</option>\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                        <!-- /form-control -->\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <!-- /form-group -->\n");
      out.write("                                                                </li>\n");
      out.write("                                                            </ol>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <!-- /filter-content -->\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <!-- /column -->\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- /container -->\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <div class=\"blog-list\">\n");
      out.write("                                                    <div class=\"container padding-vertical-10\">\n");
      out.write("                                                        <table border=\"1\" class=\"table-responsive col-md-12 col-lg-12\">\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th ><h2>Article</h2></th>\n");
      out.write("                                                                    <th><h2>Status</h2></th>\n");
      out.write("                                                                    <th ><h2>Selected</h2></th>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <div class=\"col-md-8 col-sm-8 padding-bottom-30\">\n");
      out.write("                                                                            <div class=\"blog-short-description\">\n");
      out.write("                                                                                <!-- /post-title -->\n");
      out.write("                                                                                <div class=\"post-title padding-vertical-10\" style=\"font-weight: bold;\">\n");
      out.write("                                                                                    <h3><a href=\"#\" ><!-- title here--></a>\n");
      out.write("                                                                                    </h3>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"post-info padding-top-5\">\n");
      out.write("                                                                                    <p><span>Author </span>: <a href=\"#\" ><!-- author here--></a>\n");
      out.write("                                                                                    </p>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <!-- /post-info -->\n");
      out.write("                                                                                <div class=\"post-paragraph padding-top-25\">\n");
      out.write("                                                                                    <p><!-- short description here--></p>\n");
      out.write("                                                                                </div>\n");
      out.write("\n");
      out.write("                                                                                <!-- /post-paragraph -->\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("\n");
      out.write("                                                                        <!-- /blog-short-description -->\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <div class=\"col-md-2 col-sm-2 padding-bottom-30\">\n");
      out.write("\n");
      out.write("                                                                            <label  class=\"label-info\"><h3>New</h3></label>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <div class=\"col-md-2 col-sm-2 padding-bottom-30\">\n");
      out.write("                                                                            <input type=\"checkbox\" class=\"checkbox\" />\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row justify-content-md-center\">\n");
      out.write("                                                        <input type=\"button\" name=\"btnActived\" value=\"Active\" class=\"btn btn-info padding-vertical-10 margin-right-20\"/>\n");
      out.write("                                                        <input type=\"button\" name=\"btnDeleted\" value=\"Delete\" class=\"btn btn-danger padding-vertical-10\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--product list-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"row justify-content-md-center\">\n");
      out.write("                                            <div class=\"pagination padding-top-50\">\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a id=\"firstIndex\">01</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li class=\"no-active\">...</li>\n");
      out.write("                                                    <li><a id=\"lastIndex\">N/A</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /tab-description -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("\n");
      out.write("                                <div id=\"tab2\" class=\"tab\">\n");
      out.write("                                    <div class=\"tab-description\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /tab-description -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /tab-content -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /tabs -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /column -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!--search-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/moderniz.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/scripts.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/jquery.bxslider.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/jquery.flexslider-min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/vendors/smoothscroll.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery_01.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("//                $.ajax({\n");
      out.write("//                    type: 'GET',\n");
      out.write("//                    url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=GetArticleAdmin\",\n");
      out.write("//                    headers: {\n");
      out.write("//                        Accept: \"application/json; charset=utf-8\",\n");
      out.write("//                        \"Content-Type\": \"application/json; charset=utf-8\"\n");
      out.write("//                    },\n");
      out.write("//                    success: function (data, textStatus, jqXHR) {\n");
      out.write("//                        var registration = JSON.parse(JSON.stringify(data));\n");
      out.write("//                        var obj = JSON.parse(data);\n");
      out.write("//                        var name = obj.email;\n");
      out.write("//                        console.log(obj.email + \"\");\n");
      out.write("//                    }\n");
      out.write("//                });\n");
      out.write("//                var firstIndex = $(\"#firstIndex\").text();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
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
