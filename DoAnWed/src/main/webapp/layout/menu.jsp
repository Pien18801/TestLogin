<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="style/menu.css">
</head>
<body>
<div class ="menu">
 	<div class="search-container">
    	<form action="<%=request.getContextPath()%>/search" method="post">
      		<input type="text" placeholder="Seach..." class ="txtSearch" name="search">
      		<button type="submit"><i class="fa fa-search" style="color: #696665"></i></button>
    	</form>
  	</div>
		<div class = "list">
			<ul>
				<li><a href ="ViewController"><i class="fa fa-table" style="color: #528FC7"></i> &nbsp;View contents</a>
				<li><a href ="formContent.tiles"><i class="fa fa-edit" style="color: #528FC7"></i>&nbsp;Form contents</a></li>
			</ul>
		</div>
</div>
</body>
</html>