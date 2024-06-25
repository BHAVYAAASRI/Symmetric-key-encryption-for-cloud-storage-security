<%-- 
    Document   : DiskSpaceDetail
    Created on : 28 Mar, 2016, 12:44:07 AM
    Author     : Java
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html>
    <head>
        <title>Pimp your tables with CSS3</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Pimp your tables with CSS3" />
        <meta name="keywords" content="table, css3, style, beautiful, fancy, css"/>
        <link rel="stylesheet" href="css/styleTable.css" type="text/css" media="screen"/>
    </head>
    <style>
        *{
            margin:0;
            padding:0;
        }
        body{
            font-family: Georgia, serif;
            font-size: 20px;
            font-style: italic;
            font-weight: normal;
            letter-spacing: normal;
            background: #f0f0f0;
        }
        #content{
            background-color:#fff;
            width:750px;
            padding:40px;
            margin:0 auto;
            border-left:30px solid #1D81B6;
            border-right:1px solid #ddd;
            -moz-box-shadow:0px 0px 16px #aaa;
        }
        .head{
            font-family:Helvetica,Arial,Verdana;
            text-transform:uppercase;
            font-weight:bold;
            font-size:12px;
            font-style:normal;
            letter-spacing:3px;
            color:#888;
            border-bottom:3px solid #f0f0f0;
            padding-bottom:10px;
            margin-bottom:10px;
        }
        .head a{
            color:#1D81B6;
            text-decoration:none;
            float:right;
            text-shadow:1px 1px 1px #888;
        }
        .head a:hover{
            color:#f0f0f0;
        }
        #content h1{
            font-family:"Trebuchet MS",sans-serif;
            color:#1D81B6;
            font-weight:normal;
            font-style:normal;
            font-size:56px;
            text-shadow:1px 1px 1px #aaa;
        }
        #content h2{
            font-family:"Trebuchet MS",sans-serif;
            font-size:34px;
            font-style:normal;
            background-color:#f0f0f0;
            margin:40px 0px 30px -40px;
            padding:0px 40px;
            clear:both;
            float:left;
            width:100%;
            color:#aaa;
            text-shadow:1px 1px 1px #fff;
        }

    </style>
    <body>
        <div id="content">
            <a class="back" href=""></a>
            <span class="scroll"></span>
            <p class="head">
               Public Auditing
                <a href="Index.jsp">Back to Codrops</a>
            </p>
            <h1>Cloud Storage Details</h1>
          
            <%
                
                
                File diskPartition = new File("D:");

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
                
                %>
            

           

            <h2>Sizes in Mega Bytes And Giga Bytes</h2>
            <table class="table3">
                <thead>
                    <tr>
                        <th></th>
                        <th scope="col" abbr="Starter">Total Size</th>
                        <th scope="col" abbr="Medium">Usable Space</th>
                        <th scope="col" abbr="Business">Free Space </th>
                        
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th scope="row">Price per month</th>
                        <td>$ 2.90</td>
                        <td>$ 5.90</td>
                        <td>$ 9.90</td>
                        
                    </tr>
                </tfoot>
                <tbody>
                    <tr>
                        <th scope="row">Mega Byte</th>
                        <td> <%=mbtotalCapacity  %></td>
                        <td><%=mbfreePartitionSpace%></td>
                        <td><%=mbfreePartitionSpace%></td>
                        
                    </tr>
                    <tr>
                        <th scope="row">Giga Bytes</th>
                        <td><%=totalCapacity / (1024*1024*1024)%></td>
                        <td><%=usablePatitionSpace / (1024 *1024*1024)%></td>
                        <td><%=freePartitionSpace / (1024 *1024*1024)%></td>
                        
                    </tr>
                    
                    
                  
                </tbody>
            </table>

        </div>

    </body>
</html>
