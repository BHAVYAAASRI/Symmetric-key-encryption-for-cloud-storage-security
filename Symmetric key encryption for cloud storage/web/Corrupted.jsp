<%-- 
    Document   : Corrupted
    Created on : Jun 28, 2016, 5:18:25 PM
    Author     : System32
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
.button {
  border-radius: 4px;
  background-color: #000000;
  border: none;
  color: #ffffff;
  text-align: center;
  font-size: 15px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
    </head>
    <body Background="images/img2.jpg">
        <form name="f1" action="CorruptServlet" method="POST"><br><br>
            <a align="left"><font face="Chiller" size="7" ><h1>This File is Corrupted..</h1></font></a>
        <button class="button"><span>Regenerate File </span></button>
        </form>
         <div align="right">
                        <a href="Index.jsp"><font size="5" face="Comic Sans Ms">Exit</font></a>
                    </div>
    </body>
</html>
