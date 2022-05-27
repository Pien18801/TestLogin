<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel ="stylesheet" href="style/navigation.css">
</head>
<body>
<div class ="navigation">
	<p class = "cms">CMS</p>
	<div class="dropdown">
		<div class = "dropdown-select">
	 	 	<i class="fa fa-user"  style="color: #23527c"></i> 
	 	 	&nbsp; 
	 	 	<i class="fa fa-caret-down" style="color: #23527c"></i>
	 	</div>
	  	<div class="dropdown-content">
	  		<div class ="dropdown-item">	
				<p><i class="fa fa-user"> &nbsp; </i><a href="GetInforController">User Profile</a></p>
		 	</div>
		 	<div class ="dropdown-item">
		 		<p><i class="fa fa-sign-in "> &nbsp;</i><a href="login.jsp">Logout</a></p>
		 	</div>
	  	</div>
	</div>
</div>
</body>
</html>