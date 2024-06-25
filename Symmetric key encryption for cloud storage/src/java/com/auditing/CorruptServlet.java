/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auditing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
/**
 *
 * @author System32
 */
@WebServlet(name = "CorruptServlet", urlPatterns = {"/CorruptServlet"})
public class CorruptServlet extends HttpServlet {
   
    
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
            out.println("<title>Servlet CorruptServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CorruptServlet at " + request.getContextPath() + "</h1>");
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
        
       HttpSession session1 = request.getSession(true);
        String group = session1.getAttribute("group").toString();
        System.out.println("+group+" +group);

        String filename = session1.getAttribute("filename").toString();
    File source = new File("C:/Backup/"+group+"/"+filename);  
        System.out.println(source);
        File dest = new File("C:/"+group+"/"+filename);
        System.out.println(dest);
        //final String DELETE_DIRECTORY = "D:/"+ group+filename;
        
        
        try{
    		 File file = new File("C:/"+group+"/"+filename);
                 System.out.println(group);
                 
                 System.out.println(filename);
 
       boolean status = file.delete();
       // if (status){

//            Files.copy(source, dest);
//            System.out.println("File copied successfully!!");
        if (!source.exists()) {
            System.out.println("1");
		return;
	}
	if (!dest.exists()) {
                        System.out.println("2");

		dest.createNewFile();
	}
	FileChannel source1 = null;
	FileChannel destination = null;
	source1 = new FileInputStream(source).getChannel();
	destination = new FileOutputStream(dest).getChannel();
	if (destination != null && source1 != null) {
                        System.out.println("3");

		destination.transferFrom(source1, 0, source1.size());
	}
	if (source1 != null) {
                        System.out.println("4");

		source1.close();
	}
	if (destination != null) {
		destination.close();
        response.sendRedirect("Regenerated.jsp");        
	}

   //    }
            
      //  else{
//            System.out.println("Failed");
//            response.sendRedirect("Failed.jsp");
//        }
//            
    	   
    	}
        catch(Exception e){
    		
    		e.printStackTrace();
    		
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
