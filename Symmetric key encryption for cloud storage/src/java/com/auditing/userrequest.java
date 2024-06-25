/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auditing;

import com.commondb.Common_DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sunny
 */
@WebServlet(name = "userrequest", urlPatterns = {"/userrequest"})
public class userrequest extends HttpServlet {

    static Properties properties = new Properties();
   static
   {
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
   }
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userrequest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userrequest at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         HttpSession session1=request.getSession(true);
        String group=session1.getAttribute("group").toString();
        System.out.println(group);
        String filename=request.getParameter("filename");
        System.out.println(filename);
        String useremail=session1.getAttribute("email").toString();
        System.out.println(useremail);
        String status="unchecked";
        try
        {
            ResultSet rrs=Common_DB.ViewTable("publicauditing", "auditorreg");
            if(rrs.next())
            {
                String email=rrs.getString("email");
                System.out.println(email);
                final String  from="shiva.jan061996@gmail.com";
                final String password="pwgespwxqoickyvf";
                final String to="java";
                Session session = Session.getInstance(properties, new javax.mail.Authenticator() 
                {
                        protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                        }});

                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
                    message.setSubject("Important Message from user");
                    message.setText("Check this file" +"\n"+ "Group name is: "+group +"\n"+ "Filename is: "+filename );
                    Multipart multipart = new MimeMultipart();
                    Transport.send(message);
                    System.out.println("Email sent successfully");
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/publicauditing","root","password");
                        PreparedStatement ps=con.prepareStatement("insert into request(useremailid,groupname,filename,status) values('"+useremail+"','"+group+"','"+filename+"','"+status+"')");
                        ps.executeUpdate();
                        response.sendRedirect("Requestsuccess.jsp");
                      }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    
                    
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
