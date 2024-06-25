package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AuditorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            * { box-sizing: border-box; padding:0; margin: 0; }\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tfont-family: \"HelveticaNeue-Light\",\"Helvetica Neue Light\",\"Helvetica Neue\",Helvetica,Arial,\"Lucida Grande\",sans-serif;\n");
      out.write("  color:white;\n");
      out.write("  font-size:12px;\n");
      out.write("  background:#333 ;\n");
      out.write("}\n");
      out.write("body { \n");
      out.write("\tbackground: #2F0916; \n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write(" \tbackground:#111; \n");
      out.write("  width:400px;\n");
      out.write("  margin:140px auto;\n");
      out.write("  border-radius:0.4em;\n");
      out.write("  border:1px solid #191919;\n");
      out.write("  overflow:hidden;\n");
      out.write("  position:relative;\n");
      out.write("  box-shadow: 0 5px 10px 5px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("form:after {\n");
      out.write("  content:\"\";\n");
      out.write("  display:block;\n");
      out.write("  position:absolute;\n");
      out.write("  height:1px;\n");
      out.write("  width:100px;\n");
      out.write("  left:20%;\n");
      out.write("  background:linear-gradient(left, #111, #444, #b6b6b8, #444, #111);\n");
      out.write("  top:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form:before {\n");
      out.write(" \tcontent:\"\";\n");
      out.write("  display:block;\n");
      out.write("  position:absolute;\n");
      out.write("  width:8px;\n");
      out.write("  height:5px;\n");
      out.write("  border-radius:50%;\n");
      out.write("  left:34%;\n");
      out.write("  top:-7px;\n");
      out.write("  box-shadow: 0 0 6px 4px #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inset {\n");
      out.write(" \tpadding:20px; \n");
      out.write("  border-top:1px solid #19191a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form h1 {\n");
      out.write("  font-size:18px;\n");
      out.write("  text-shadow:0 1px 0 black;\n");
      out.write("  text-align:center;\n");
      out.write("  padding:15px 0;\n");
      out.write("  border-bottom:1px solid rgba(0,0,0,1);\n");
      out.write("  position:relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form h1:after {\n");
      out.write(" \tcontent:\"\";\n");
      out.write("  display:block;\n");
      out.write("  width:250px;\n");
      out.write("  height:100px;\n");
      out.write("  position:absolute;\n");
      out.write("  top:0;\n");
      out.write("  left:50px;\n");
      out.write("  pointer-events:none;\n");
      out.write("  transform:rotate(70deg);\n");
      out.write("  -webkit-transform: rotate(70deg);\n");
      out.write("  background:linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));\n");
      out.write("   background-image: -webkit-linear-gradient(50deg, rgba(255,255,255,0.05), rgba(0,0,0,0)); /* For Safari */\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write(" \tcolor:#666;\n");
      out.write("  display:block;\n");
      out.write("  padding-bottom:9px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text],\n");
      out.write("input[type=password] {\n");
      out.write(" \twidth:100%;\n");
      out.write("  padding:8px 5px;\n");
      out.write("  background:linear-gradient(#1f2124, #27292c);\n");
      out.write("  border:1px solid #222;\n");
      out.write("  box-shadow:\n");
      out.write("    0 1px 0 rgba(255,255,255,0.1);\n");
      out.write("  border-radius:0.3em;\n");
      out.write("  margin-bottom:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label[for=remember]{\n");
      out.write(" \tcolor:white;\n");
      out.write("  display:inline-block;\n");
      out.write("  padding-bottom:0;\n");
      out.write("  padding-top:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=checkbox] {\n");
      out.write(" \tdisplay:inline-block;\n");
      out.write("  vertical-align:top;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".p-container {\n");
      out.write(" \tpadding:0 20px 20px 20px; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".p-container:after {\n");
      out.write(" \tclear:both;\n");
      out.write("  display:table;\n");
      out.write("  content:\"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".p-container span {\n");
      out.write("  display:block;\n");
      out.write("  float:left;\n");
      out.write("  color:#0d93ff;\n");
      out.write("  padding-top:8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write(" \tpadding:5px 20px;\n");
      out.write("  border:1px solid rgba(0,0,0,0.4);\n");
      out.write("  text-shadow:0 -1px 0 rgba(0,0,0,0.4);\n");
      out.write("  box-shadow:\n");
      out.write("    inset 0 1px 0 rgba(255,255,255,0.3),\n");
      out.write("    inset 0 10px 10px rgba(255,255,255,0.1);\n");
      out.write("  border-radius:0.3em;\n");
      out.write("  background:#0184ff;\n");
      out.write("  color:blue;\n");
      out.write("  float:right;\n");
      out.write("  font-weight:bold;\n");
      out.write("  cursor:pointer;\n");
      out.write("  font-size:13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  box-shadow:\n");
      out.write("    inset 0 1px 0 rgba(255,255,255,0.3),\n");
      out.write("    inset 0 -10px 10px rgba(255,255,255,0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:hover,\n");
      out.write("input[type=password]:hover,\n");
      out.write("label:hover ~ input[type=text],\n");
      out.write("label:hover ~ input[type=password] {\n");
      out.write(" \tbackground:#27292c;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/images24.jpg>\n");
      out.write("        <center>\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"AuditorLoginServlet\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\"><font size=\"5\" face=\"Andalus\"><h1>Auditor Login Form</h1></font></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"inset\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">UserName:</div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"username\"></label>\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">Password:</div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"password\"></label>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"p-container\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\">\n");
      out.write("                                <!--<input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">-->\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </p>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
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
