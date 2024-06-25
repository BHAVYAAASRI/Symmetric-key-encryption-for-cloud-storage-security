package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;
import com.commondb.Common_DB;

public final class userrevocation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/images18.jpg\">   \n");
      out.write("        <center>\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"UserRevocationServlet\">\n");
      out.write("         <br>\n");
      out.write("           </br>\n");
      out.write("           <table width=\"\" border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\">\n");
      out.write("                            <font size=\"10\" face=\"Colonna MT\">User Revocation Page</font></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("           <p>\n");
      out.write("           </p>\n");
      out.write("        </center>\n");
      out.write("         <br>               \n");
      out.write("                ");

                String Username=session.getAttribute("username").toString();
                
      out.write("\n");
      out.write("                <div align=\"left\">\n");
      out.write("                <font size=\"4\" face=\"Andalus\">\n");
      out.write("               <h1>welcome, ");
      out.print(Username);
      out.write("</h1></font>\n");
      out.write("               </div>\n");
      out.write("        <center>\n");
      out.write("        <table width=\"250\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div align=\"center\"><font size=\"5\" face=\"Comic Sans Ms\">UserName List:</font></div>\n");
      out.write("                    <label for=\"username\"></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"username\" >    \n");
      out.write("           ");
 
          
               
        
           //String groupkey=session.getAttribute("groupkey").toString();
           ArrayList li=new ArrayList();
           Connection con=null;
           Statement st=null;
           ResultSet rs=null;
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/publicauditing","root","password");
           st=con.createStatement();
           String qry="select username from registration where groupname='"+Username+"'";
           rs=st.executeQuery(qry);
            //ResultSet rr=Common_DB.ViewParticularData("mona","login","groupname",group1);
           
           
          
         while(rs.next())            
         {
          String n=rs.getString(1);   
           
             li.add(n);             
         }
            if(!(li.isEmpty()))        
         for(int ij=0; ij<li.size(); ij++)                   
              {
           
      out.write("\n");
      out.write("           <option value=\"");
      out.print(li.get(ij));
      out.write("\"> ");
      out.print(li.get(ij));
      out.write("</option>\n");
      out.write("           ");

               }
             
                else {               
          
      out.write("\n");
      out.write("            <option value=\"\"> </option>\n");
      out.write("          ");
                                                     
         }

      out.write("\n");
      out.write("          \n");
      out.write("       </select> \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"250\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Delete\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
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
