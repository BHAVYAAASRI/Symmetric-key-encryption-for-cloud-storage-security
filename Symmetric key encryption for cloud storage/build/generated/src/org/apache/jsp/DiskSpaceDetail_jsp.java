package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;

public final class DiskSpaceDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pimp your tables with CSS3</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"description\" content=\"Pimp your tables with CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"table, css3, style, beautiful, fancy, css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleTable.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin:0;\n");
      out.write("            padding:0;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            font-family: Georgia, serif;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-style: italic;\n");
      out.write("            font-weight: normal;\n");
      out.write("            letter-spacing: normal;\n");
      out.write("            background: #f0f0f0;\n");
      out.write("        }\n");
      out.write("        #content{\n");
      out.write("            background-color:#fff;\n");
      out.write("            width:750px;\n");
      out.write("            padding:40px;\n");
      out.write("            margin:0 auto;\n");
      out.write("            border-left:30px solid #1D81B6;\n");
      out.write("            border-right:1px solid #ddd;\n");
      out.write("            -moz-box-shadow:0px 0px 16px #aaa;\n");
      out.write("        }\n");
      out.write("        .head{\n");
      out.write("            font-family:Helvetica,Arial,Verdana;\n");
      out.write("            text-transform:uppercase;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-size:12px;\n");
      out.write("            font-style:normal;\n");
      out.write("            letter-spacing:3px;\n");
      out.write("            color:#888;\n");
      out.write("            border-bottom:3px solid #f0f0f0;\n");
      out.write("            padding-bottom:10px;\n");
      out.write("            margin-bottom:10px;\n");
      out.write("        }\n");
      out.write("        .head a{\n");
      out.write("            color:#1D81B6;\n");
      out.write("            text-decoration:none;\n");
      out.write("            float:right;\n");
      out.write("            text-shadow:1px 1px 1px #888;\n");
      out.write("        }\n");
      out.write("        .head a:hover{\n");
      out.write("            color:#f0f0f0;\n");
      out.write("        }\n");
      out.write("        #content h1{\n");
      out.write("            font-family:\"Trebuchet MS\",sans-serif;\n");
      out.write("            color:#1D81B6;\n");
      out.write("            font-weight:normal;\n");
      out.write("            font-style:normal;\n");
      out.write("            font-size:56px;\n");
      out.write("            text-shadow:1px 1px 1px #aaa;\n");
      out.write("        }\n");
      out.write("        #content h2{\n");
      out.write("            font-family:\"Trebuchet MS\",sans-serif;\n");
      out.write("            font-size:34px;\n");
      out.write("            font-style:normal;\n");
      out.write("            background-color:#f0f0f0;\n");
      out.write("            margin:40px 0px 30px -40px;\n");
      out.write("            padding:0px 40px;\n");
      out.write("            clear:both;\n");
      out.write("            float:left;\n");
      out.write("            width:100%;\n");
      out.write("            color:#aaa;\n");
      out.write("            text-shadow:1px 1px 1px #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <a class=\"back\" href=\"\"></a>\n");
      out.write("            <span class=\"scroll\"></span>\n");
      out.write("            <p class=\"head\">\n");
      out.write("               Public Auditing\n");
      out.write("                <a href=\"Index.jsp\">Back to Codrops</a>\n");
      out.write("            </p>\n");
      out.write("            <h1>Cloud Storage Details</h1>\n");
      out.write("          \n");
      out.write("            ");

                
                
                File diskPartition = new File("C:");

		long totalCapacity = diskPartition.getTotalSpace(); 

		long freePartitionSpace = diskPartition.getFreeSpace(); 
		long usablePatitionSpace = diskPartition.getUsableSpace(); 

		System.out.println("**** Sizes in Mega Bytes ****\n");
                
                long mbtotalCapacity=(totalCapacity / (1024*1024));
                long mbusablePatitionSpace=( usablePatitionSpace / (1024 *1024));
                long mbfreePartitionSpace=(freePartitionSpace / (1024 *1024));
		System.out.println("Total C partition size : " + mbtotalCapacity + " MB");
		System.out.println("Usable Space : " +mbusablePatitionSpace+ " MB");
		System.out.println("Free Space : " + mbfreePartitionSpace + " MB");

		System.out.println("\n**** Sizes in Giga Bytes ****\n");

		System.out.println("Total C partition size : " + totalCapacity / (1024*1024*1024) + " GB");
		System.out.println("Usable Space : " + usablePatitionSpace / (1024 *1024*1024) + " GB");
		System.out.println("Free Space : " + freePartitionSpace / (1024 *1024*1024) + " GB");
                
                
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <h2>Sizes in Mega Bytes And Giga Bytes</h2>\n");
      out.write("            <table class=\"table3\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th></th>\n");
      out.write("                        <th scope=\"col\" abbr=\"Starter\">Total Size</th>\n");
      out.write("                        <th scope=\"col\" abbr=\"Medium\">Usable Space</th>\n");
      out.write("                        <th scope=\"col\" abbr=\"Business\">Free Space </th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">Price per month</th>\n");
      out.write("                        <td>$ 2.90</td>\n");
      out.write("                        <td>$ 5.90</td>\n");
      out.write("                        <td>$ 9.90</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </tfoot>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">Mega Byte</th>\n");
      out.write("                        <td> ");
      out.print(mbtotalCapacity  );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(freePartitionSpace);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(usablePatitionSpace);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">Giga Bytes</th>\n");
      out.write("                        <td>50 GB</td>\n");
      out.write("                        <td>100 GB</td>\n");
      out.write("                        <td>150 GB</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
