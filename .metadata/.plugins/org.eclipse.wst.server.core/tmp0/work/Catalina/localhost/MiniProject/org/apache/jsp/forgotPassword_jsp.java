/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-07 19:54:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset='utf-8'>\r\n");
      out.write("<meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("<title>Snippet - BBBootstrap</title>\r\n");
      out.write("<link\r\n");
      out.write("	href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'\r\n");
      out.write("	rel='stylesheet'>\r\n");
      out.write("<link href='' rel='stylesheet'>\r\n");
      out.write("<script type='text/javascript'\r\n");
      out.write("	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	background-position: center;\r\n");
      out.write("	background-color: #eee;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	color: #505050;\r\n");
      out.write("	font-family: \"Rubik\", Helvetica, Arial, sans-serif;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	font-weight: normal;\r\n");
      out.write("	line-height: 1.5;\r\n");
      out.write("	text-transform: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".forgot {\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	padding: 12px;\r\n");
      out.write("	border: 1px solid #dfdfdf\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".padding-bottom-3x {\r\n");
      out.write("	padding-bottom: 72px !important\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-footer {\r\n");
      out.write("	background-color: #fff\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	font-size: 13px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control:focus {\r\n");
      out.write("	color: #495057;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border-color: #76b7e9;\r\n");
      out.write("	outline: 0;\r\n");
      out.write("	box-shadow: 0 0 0 0px #28a745\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu='return false' class='snippet-body'>\r\n");
      out.write("	<div class=\"container padding-bottom-3x mb-2 mt-5\">\r\n");
      out.write("		<div class=\"row justify-content-center\">\r\n");
      out.write("			<div class=\"col-lg-8 col-md-10\">\r\n");
      out.write("				<div class=\"forgot\">\r\n");
      out.write("					<h2>Forgot your password?</h2>\r\n");
      out.write("					<p>Change your password in three easy steps. This will help you\r\n");
      out.write("						to secure your password!</p>\r\n");
      out.write("					<ol class=\"list-unstyled\">\r\n");
      out.write("						<li><span class=\"text-primary text-medium\">1. </span>Enter\r\n");
      out.write("							your email address below.</li>\r\n");
      out.write("						<li><span class=\"text-primary text-medium\">2. </span>Our\r\n");
      out.write("							system will send you an OTP to your email</li>\r\n");
      out.write("						<li><span class=\"text-primary text-medium\">3. </span>Enter the OTP on the \r\n");
      out.write("						next page</li>\r\n");
      out.write("					</ol>\r\n");
      out.write("				</div>\r\n");
      out.write("				<form class=\"card mt-4\" action=\"forgotPassword\" method=\"GET\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"email-for-pass\">Enter your email address</label> <input\r\n");
      out.write("								class=\"form-control\" type=\"text\" name=\"email\" id=\"email-for-pass\" required=\"\"><small\r\n");
      out.write("								class=\"form-text text-muted\">Enter the registered email address . Then we'll\r\n");
      out.write("								email a OTP to this address.</small>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"card-footer\">\r\n");
      out.write("						<button class=\"btn btn-success\" type=\"submit\">Get New\r\n");
      out.write("							Password</button>\r\n");
      out.write("						<button class=\"btn btn-danger\" type=\"submit\">Back to\r\n");
      out.write("							Login</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type='text/javascript'\r\n");
      out.write("		src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>\r\n");
      out.write("	<script type='text/javascript' src=''></script>\r\n");
      out.write("	<script type='text/javascript' src=''></script>\r\n");
      out.write("	<script type='text/Javascript'></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
