/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-08-08 05:42:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class student_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Student Login</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <div class=\"hero\">\r\n");
      out.write("        <img src=\"logo.png\" alt=\"\" class=\"logo\">\r\n");
      out.write("        <p class=\"events\">EVENTS</p>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                <li><a href=\"clubs.jsp\">Clubs</a></li>\r\n");
      out.write("                <li><a href=\"cover.jsp\">Login</a></li>\r\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- FEATURED EVENTS -->\r\n");
      out.write("<div class=\"eventc\">\r\n");
      out.write("    <div class=\"present\">\r\n");
      out.write("        <h2>FEATURED EVENTS</h2>\r\n");
      out.write("        <hr>        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("          <div class=\"card\" id=\"myBtn\"><img src=\"pronetixevent.png\">\r\n");
      out.write("            <div class=\"info\">\r\n");
      out.write("              <h2>TECH-NEW-KAL</h2>\r\n");
      out.write("              <p>PRONETIX</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"myModal\" class=\"modal\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close\">&times;</span>\r\n");
      out.write("                <img src=\"pronetixevent.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">TECH-NEW-KAL</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  TECH-NEW-KAL event is organized by PRONETIX Club. It is a technical event </p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Aditya Vikram\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7827482395\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Ms Kanika Taneja, AP,  ECE Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"registration.jsp\"><button value=\"submit\" class=\"button\" >REGISTER NOW</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- <div class=\"butt\">\r\n");
      out.write("                  \r\n");
      out.write("                </div> -->\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card\" id=\"myBtn2\"><img src=\"Sanskriti.jpg\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Sanskriti</h1>\r\n");
      out.write("                <p>KHUSHIYA BAATON </p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"myModal2\" class=\"modal2\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close2\">&times;</span>\r\n");
      out.write("                <img src=\"Sanskriti.jpg\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Sanskriti Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The music club is specializes in hosting live music performances by various artists and bands.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Sahil Sharma \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 9728681020\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr Himanshu Yadav, AP, ECE Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <a href=\"registration.jsp\"><button value=\"submit\" class=\"button\" >REGISTER NOW</button></a>\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\" id=\"myBtn3\"><img src=\"hack-niet.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Hack-X-Niet</h1>\r\n");
      out.write("                <p>GDSC</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal3\" class=\"modal3\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close3\">&times;</span>\r\n");
      out.write("                <img src=\"hack-niet.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">HACK-X-NIET</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The  theatre club  focuses on producing and showcasing theatrical productions. </p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Astha Gupta \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7017036949\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Dr. Amba , AP IT Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <a href=\"registration.jsp\"><button value=\"submit\" class=\"button\" >REGISTER NOW</button></a>\r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- UPCOMING EVENTS -->\r\n");
      out.write("    <div class=\"present\">\r\n");
      out.write("        <h2>UPCOMING  EVENTS</h2>\r\n");
      out.write("        <hr>        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"card\" id=\"myBtn4\"><img src=\"greenry.png\">\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>MISS EARTH</h1>\r\n");
      out.write("                <p>GREEN GOLD SOCIETY</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal4\" class=\"modal4\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close4\">&times;</span>\r\n");
      out.write("                <img src=\"greenry.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">MR & MISS EARTH</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The  theatre club  focuses on producing and showcasing theatrical productions.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Astha Gupta \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7017036949\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Dr. Amba , AP IT Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\" id=\"myBtn5\"><img src=\"juv.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>FLAWLESS FEET</h1>\r\n");
      out.write("                <p>JUVENTAS</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal5\" class=\"modal5\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close5\">&times;</span>\r\n");
      out.write("                <img src=\"juv.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Theatre Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The  theatre club  focuses on producing and showcasing theatrical productions.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Astha Gupta \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7017036949\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Dr. Amba , AP IT Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\" id=\"myBtn6\"><img src=\"reelscape.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Reelscape</h1>\r\n");
      out.write("                <p>REBOOT</p>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal6\" class=\"modal6\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close6\">&times;</span>\r\n");
      out.write("                <img src=\"reelscape.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Reelscape</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The  theatre club  focuses on producing and showcasing theatrical productions. </p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Astha Gupta \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7017036949\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Dr. Amba , AP IT Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- PAST EVENTS -->\r\n");
      out.write("    <div class=\"past\">\r\n");
      out.write("        <h2>PAST  EVENTS</h2>\r\n");
      out.write("        <hr>        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"card\"><img src=\"edition.png\">\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Event Name</h1>\r\n");
      out.write("                <p>FOOTBALL</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\"><img src=\"protinex.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Event Name</h1>\r\n");
      out.write("                <p>PRONETIX</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\"><img src=\"reboot.jpg\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>Event Names</h1>\r\n");
      out.write("                <p>REBOOT</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"about\">\r\n");
      out.write("      <div class=\"logo2\">\r\n");
      out.write("        <img src=\"logo.png\" alt=\"\" class=\"footerlogo\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"contact\">\r\n");
      out.write("        <p><a href=\"tel:+4733378901\" class=\"phone\"><i class=\"fa fa-phone\" style=\"font-size:48px;color: black\"></i></a></p>\r\n");
      out.write("        <p class=\"icon\">CALL US</p>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("        <p><a href=\"mailto:0901tanvi@gmail.com\" class=\"mail\"><i class=\"fa fa-envelope\" style=\"font-size:48px;color:black\"></i></a></p>\r\n");
      out.write("        <p class=\"icon\">MAIL US</p>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("        <p><a href=\"https://wa.me/917895715075\" class=\"whatsapp\"><i class=\"fa fa-whatsapp\" style=\"font-size:48px;color:black\"></i></i></a></p>\r\n");
      out.write("        <p class=\"icon\">WHATSAPP US</p>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"indeex.js\"></script>\r\n");
      out.write("  \r\n");
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
