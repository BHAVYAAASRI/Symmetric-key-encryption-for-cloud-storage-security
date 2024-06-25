package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("    </head>\n");
      out.write("    <body>                      \n");
      out.write("        <form>\n");
      out.write("            <br> \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                        <font size=\"5\" face=\"Comic Sans MS\" color=\"blue\"><u><p>Pantech ProEd Pvt Ltd.<p></u>.</font>\n");
      out.write("                    </div>\n");
      out.write("            </tr>            \n");
      out.write("             <tr>                   \n");
      out.write("                    <p><font size=\"5\" face=\"Comic Sans MS\" color=\"blue\">Pantech Provides Project Guidance for B.E, B.Tech, M.E, M.Tech, Diploma, MCA, B.sc & M.sc Computer Science.</font><p>                    \n");
      out.write("            </tr>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <tr>\n");
      out.write("                    <font size=\"5\" face=\"Comic Sans MS\" color=\"blue\">\n");
      out.write("                        <p>It is a Matter of pride that pantech Group of companies founded Ten years ago, has been complementing its\n");
      out.write("                           academic activity at undergraduate, graduate and doctoral levels. Salute its dedicated R&D Team on these\n");
      out.write("                           seminal accomplishments, including setting up its own facilities across Eight Major Cites in India,Establishment\n");
      out.write("                           of a dedicated Team of Professionals for Article Publications in various Journals and much more with in such a \n");
      out.write("                           short Span of time.<p></font>\n");
      out.write("           </tr>\n");
      out.write("           <br>\n");
      out.write("            <tr>\n");
      out.write("                      <font size=\"5\" face=\"Comic Sans MS\" color=\"blue\">\n");
      out.write("                        <p>Technically Trained, skilled and highly self Motivated Members are key to our\n");
      out.write("                           Success.Pantech Prepares its students for the future-for a new Career of facilitating\n");
      out.write("                           a career change.<p></font>\n");
      out.write("           </tr>\n");
      out.write("            </table>\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <a href=\"Index.jsp\">Go to Home Page</a>\n");
      out.write("            </div>\n");
      out.write("        </form>        \n");
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
