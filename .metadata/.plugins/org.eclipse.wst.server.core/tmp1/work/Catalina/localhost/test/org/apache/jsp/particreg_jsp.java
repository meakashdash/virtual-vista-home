/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-03-27 03:59:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class particreg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<htmL>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" />\r\n");
      out.write("        <title>Participant Registration</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-info-subtle text-emphasis-danger\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"home.html\"><img src=\"https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.somo.nl%2Fwp-content%2Fuploads%2F2012%2F12%2Fhuman-rights-programme-bolsters-grievance-mechanisms-1.jpg&imgrefurl=https%3A%2F%2Fwww.somo.nl%2Fhuman-rights-programme-bolsters-grievance-mechanisms%2F&tbnid=1ox2fegoswr60M&vet=12ahUKEwip97uL8Yf9AhVegtgFHelmD0kQMygMegUIARDXAQ..i&docid=noSUwSjLWVN63M&w=1307&h=1294&q=grievance%20logo&ved=2ahUKEwip97uL8Yf9AhVegtgFHelmD0kQMygMegUIARDXAQ\" /></a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"eventreg.jsp\">Event Registration</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"particreg.jsp\">Participant Registration</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        Events\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"culturalevent.jsp\">Cultural Events</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"technicalevent.jsp\">Technical Events</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"sportsevent.jsp\">Sport Events</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"feedback.jsp\">Feedback</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"body\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <form method=\"post\">\r\n");
      out.write("                    <!-- <div class=\"imgcontainer\">\r\n");
      out.write("                    <img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                    <!-- <div class=\"container\">\r\n");
      out.write("                        <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required><br>\r\n");
      out.write("                    \r\n");
      out.write("                        <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required><br>\r\n");
      out.write("                            \r\n");
      out.write("                        <button type=\"submit\">Login</button><br>\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("                        </label><br>\r\n");
      out.write("                        <button type=\"submit\" onclick=\"window.location.href='signup.html'\">Sign up</button><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("                        <span class=\"psw\"><a href=\"#\">Forgot password?</a></span>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("    \r\n");
      out.write("                    <section class=\"h-100 bg-dark\">\r\n");
      out.write("                        <div class=\"container py-5 h-100\">\r\n");
      out.write("                        <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                            <div class=\"card card-registration my-4\">\r\n");
      out.write("                                <div class=\"row g-0\">\r\n");
      out.write("                                <div class=\"col-xl-6 d-none d-xl-block\">\r\n");
      out.write("                                    <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp\"\r\n");
      out.write("                                    alt=\"Sample photo\" class=\"img-fluid\"\r\n");
      out.write("                                    style=\"border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-xl-6\">\r\n");
      out.write("                                    <div class=\"card-body p-md-5 text-black\">\r\n");
      out.write("                                    <h3 class=\"mb-5 text-uppercase\">Participant Login form</h3>\r\n");
      out.write("                                    <div class=\"col\">\r\n");
      out.write("                                        <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                                        <div class=\"form-outline\">\r\n");
      out.write("                                            <label class=\"form-label\" for=\"form3Example1m\">Email</label>\r\n");
      out.write("                                            <input type=\"text\" id=\"form3Example1m\" class=\"form-control form-control-lg\" required/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                                        <div class=\"form-outline\">\r\n");
      out.write("                                            <label class=\"form-label\" for=\"form3Example1n\">Password</label>\r\n");
      out.write("                                            <input type=\"text\" id=\"form3Example1n\" class=\"form-control form-control-lg\" required/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-center pt-3\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning btn-lg ms-2\">Login</button>\r\n");
      out.write("                                        <button type=\"button\" onclick=\"window.location.href='particactualreg.html'\" class=\"btn btn-lg ms-2\">Sign up</button>\r\n");
      out.write("                                    </div><br>\r\n");
      out.write("                                    <span class=\"psw\"><a href=\"#\">Forgot password?</a></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("    \r\n");
      out.write("                </form>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</htmL>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
