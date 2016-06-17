<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
  <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
<link href="styles/styles.css" rel="stylesheet" type="text/css" />
<script>
  $(function() 
{
    
$( "#progressbar" ).progressbar({
      value: 35
    });
  });
  </script>
<style>

#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    width: 100%;
    border-collapse: collapse;
}

#customers td, #customers th {
    font-size: 1em;
    border: 1px solid #98bf21;
    padding: 3px 7px 2px 7px;
}

#customers th {
    font-size: 1.1em;
    text-align: left;
    padding-top: 5px;
    padding-bottom: 4px;
    background-color: #A7C942;
    color: #ffffff;
}

#customers tr.alt td {
    color: #000000;
    background-color: #EAF2D3;
}
</style>

</head>
<body>
<header id="header_wrapper">
  	<div class="container">
    	<div class="header clearfix">
        	<div class="logo"><a href="index.html"><img src="images/logo.png" /><span></span></a></div>
            <nav class="navigation">
            	<ul>
                	<li><a href="notifications.html">Notifications</a></li>
                    <li class="dropdown"><a href="#">My Courses</a>
                     <ul>
                        	<li><a href="coursehomepage.html">Planning And ManAgment</a></li>
                            <li><a href="coursehomepage.html">Advance Operating System</a></li>
                            <li><a href="#">Formal Language </a></li>
                        </ul>
                    <li class="dropdown"><a href="#">Username</a>
                    	<ul>
                        	<li><a href="#">Profile</a></li>
                            <li><a href="#">Account settings</a></li>
                            <li><a href="#">Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            
            
        </div>
    </div>
</header>
<section id="content_wrapper">
	<div class="container">
    	<h1>Planning And Managment</h1>
        <div class="main_content clearfix">
        	<div class="content_left">
            	<ul>
                     <li><a href="gradepage.html">grade class</a></li>
                    <li><a href="First.html">class status</a></li>
                    <li><a href="manageclass.html">manage class</a></li>                         
                </ul>
            </div>
            <div class="content_mid">
<table id="customers">
  <tr>
    <th>Chapters</th>
    <th>status</th>
    <th>Assignments</th>
    <th>link</th>
  </tr>
  <tr>
    <td>Chapter 1</td>
    <td>class taken </td>
    <td>quiz posted and assignment posted </td>
    <td> "url"</td>
  </tr>
  <tr class="alt">
     <td>Chapter 2</td>
    <td>class taken </td>
    <td>quiz posted and assignment posted </td>
    <td> "url"</td>
  </tr>
  <tr>
     <td>Chapter 3</td>
    <td>class taken </td>
    <td> assignment posted </td>
    <td> "url"</td>
  </tr>
  <tr class="alt">
     <td>Chapter 4</td>
    <td>class taken </td>
    <td>quiz posted</td>
    <td> "url"</td>
  </tr>
  <tr>
     <td>Chapter 5</td>
    <td>class not taken </td>
    <td> assignment to be posted </td>
    <td> " "</td>
  </tr>
  <tr class="alt">
    <td>Chapter 6 </td>
    <td>class taken </td>
    <td>assignment to be posted </td>
    <td> "url"</td>
  </tr>
  <tr>
    <td>Chapter 7 </td>
    <td>class taken </td>
    <td>assignment to be posted </td>
    <td> "url"</td>
  </tr>
  <tr class="alt">
     <td>Chapter 8</td>
    <td>class taken </td>
    <td> assignment to be posted </td>
    <td> "url"</td>
  </tr>
  
</table>
</div>

     <div id="progressbar"></div>
        </div>       
           
            </div>
            <div id="progressbar"></div>
        </div>
    </div>
        </div>
    </div>
    
</section>
<hr />
   <div id="footer" style="align: center; margin-left:570px;">
        <b>Copy rights @ GSUTECHBOARD</b>
    </div>

</body>
</html>