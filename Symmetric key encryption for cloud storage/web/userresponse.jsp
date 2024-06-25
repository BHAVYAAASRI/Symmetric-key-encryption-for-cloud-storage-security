<%@page import="com.commondb.Common_DB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>User information</title>
		<meta name="description" content="Sticky Table Headers Revisited: Creating functional and flexible sticky table headers" />
		<meta name="keywords" content="Sticky Table Headers Revisited" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize_3.css" />
		<link rel="stylesheet" type="text/css" href="css/demo_3.css" />
		<link rel="stylesheet" type="text/css" href="css/component_1.css" />
                
		<!--[if IE]>
  		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
	</head>
        <style>
.a{
  background: #e9e9e9;
  color: #666666;
  width: 350px;
  height:2em;
  font-size: 20px;
  font-family: 'RobotoDraft', 'Roboto', Footlight MT;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #000000;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 20px;
  padding: 5px;
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
  content: '\00bb';
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
<style>
            input[type="checkbox"]{
  width: 30px; /*Desired width*/
  height: 30px; /*Desired height*/
}
        </style>
	<body align="center">
	<form name="form4" action="userresponse" method="POST">
		<div class="container">
			<!-- Top Navigation -->
			
			<header>
				<h1>User request Information</h1>	
                                </header>
				<nav class="codrops-demos">
            
				</nav>
			
			<div class="component">
				<table>
					<thead>
               
                <tr>
                    <th>Select Users</th>
                    <th>User Email ID</th>
                    <th>Group Name</th>
                    <th>File Name</th>
                    
                </tr>
            </thead>
            <tbody>
                <%
                String status="unchecked";
                ResultSet rs1=Common_DB.ViewParticularData("publicauditing", "request", "status", status);
                while(rs1.next())
                                       {
                                               
                        %>
              
    <tr>
                          
        <td><input type="checkbox" name="selectedItems" height="40px" width="40px" value=<%=rs1.getString(1)%>/></td>
    <td><%=rs1.getString("useremailid") %></td>
    <td><%=rs1.getString("groupname") %></td>
    <td><%=rs1.getString("filename") %></td>
        
    
</tr>

<%
                    }%>                         
        </tbody>
	</table>
	</div>
	</div><!-- /container -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-throttle-debounce/1.1/jquery.ba-throttle-debounce.min.js"></script>
	<script src="js/jquery.stickyheader.js"></script>

        <button class="button" type="submit" name="search" style="vertical-align:middle" onclick="form.action='userresponse';"><span>Send response </span></button>
        
		</form>
	</body>
</html>