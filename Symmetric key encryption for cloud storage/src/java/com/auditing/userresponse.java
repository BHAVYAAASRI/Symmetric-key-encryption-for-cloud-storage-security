/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auditing;

import com.commondb.Common_DB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "userresponse", urlPatterns = {"/userresponse"})
public class userresponse extends HttpServlet {

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
            out.println("<title>Servlet userresponse</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userresponse at " + request.getContextPath() + "</h1>");
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
        String uemail=null;
        String status="checked";
            HttpSession ss1=request.getSession(true);
            String selectitem=request.getParameter("selectedItems");
            System.out.println(selectitem);
        try {
            ResultSet rrs=Common_DB.ViewParticularData("publicauditing", "request", "sl_no", selectitem);
            if(rrs.next())
            {
                uemail=rrs.getString("useremailid");
                String fname=rrs.getString("filename");
                System.out.println(uemail);
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
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(uemail));
                    message.setSubject("Important Message from Auditor");
                    message.setText("Your file is regenerated Successfully");
                    Multipart multipart = new MimeMultipart();
                    Transport.send(message);
                    System.out.println("Email sent successfully");
                    try
                    {
                       int rr1= Common_DB.UpdateTable("publicauditing", "update request set status='"+status+"' where useremailid='"+uemail+"'");
                       if(rr1>0)
                       {
                           response.sendRedirect("Audithere.jsp");
                       }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
            }
        } catch (Exception ex) {
            System.out.println(ex);
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
