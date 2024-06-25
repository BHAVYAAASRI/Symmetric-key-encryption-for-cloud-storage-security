<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<title>Request page</title>
		<meta name="description" content="Creative styles and ideas for custom select elements" />
		<meta name="keywords" content="custom select, select style, javascript, inspiration, select element" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,500,700' rel='stylesheet' type='text/css'>
		
		<link rel="stylesheet"  href="css/normalize_2.css" />
		<link rel="stylesheet"  href="butt.css">
		<link rel="stylesheet"  href="css/demo_2.css" />
		<link rel="stylesheet"  href="css/cs-select.css" />
		<link rel="stylesheet"  href="css/cs-skin-slide.css" />
		 
	</head>
        <style>
.button {
  border-radius: 4px;
  background-color: #000000;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 300px;
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
	<style>
input {
    width: 24%;
	height: 50px;
		}
</style>

	<body class="color-4">
		<div class="container">
			<!-- Top Navigation -->
			
			<header class="codrops-header">
				<h1>Send File request to Auditor</h1>	
				
			</header>
                        <form name="f1" action="userrequest" method="post">
			<section>
				<label class="select-label">Select file here</label>
				<select name="filename" class="cs-select cs-skin-slide" >
					<%
                                         String group=session.getAttribute("group").toString(); 
                                         ArrayList filename=(ArrayList)session.getAttribute("filename");
                                         String email=session.getAttribute("emailid").toString();
                                         System.out.println("user emailid: "+email);
                                         session.setAttribute("email", email);
                                          for(int i=0;i<filename.size();i++) {			 
                                        %>
                                            <option> <%=filename.get(i)%> </option>
                                        <% }
                                        %>
				</select>
				
				
			</section>
			<section>
			 <div align="center">
                                 <button class="button"><span>Send Request</span></button><br>
                                 
                          </div>
		</section>
		</form>	
		</div><!-- /container -->
		<script src="js/classie.js"></script>
		<script src="js/selectFx.js"></script>
		<script>
			(function() {
				[].slice.call( document.querySelectorAll( 'select.cs-select' ) ).forEach( function(el) {	
					new SelectFx(el);
				} );
			})();
		</script>
	</body>
</html>