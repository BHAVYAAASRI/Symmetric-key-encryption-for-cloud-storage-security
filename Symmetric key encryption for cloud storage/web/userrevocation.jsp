<%-- 
    Document   : Aboutus
    Created on : nov 1, 2015, 5:57:29 PM
    Author     : Devaa
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page import="com.commondb.Common_DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="images/images18.jpg">   
        <center>
            <form name="form1" method="post" action="UserRevocationServlet">
         <br>
           </br>
           <table width="" border="0">
                <tr>
                    <td>
                        <div align="center">
                            <font size="10" face="Colonna MT">User Revocation Page</font></div>
                    </td>
                </tr>
            </table>
           <p>
           </p>
        </center>
         <br>               
                <%
                String Username=session.getAttribute("username").toString();
                %>
                <div align="left">
                <font size="4" face="Andalus">
               <h1>welcome, <%=Username%></h1></font>
               </div>
        <center>
        <table width="250" border="0">
            <tr>
                <td>
                    <div align="center"><font size="5" face="Comic Sans Ms">UserName List:</font></div>
                    <label for="username"></label>
                </td>
                <td>
                   
                </td>
            </tr>
        </table>
        <table width="250" border="0">
            <tr>
                <td>
                    <div align="center">
                    <input type="submit" name="submit" id="submit" value="Delete">
                    </div>
                </td>
            </tr>
        </table>
        </form>
        </center>
    </body>
</html>
