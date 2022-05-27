<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel ="stylesheet" href="style/main.css">

</head>
<body>
	<div>
		<tiles:insertAttribute name="navigation" />
	</div>
	
	<div class="row">
		<aside>
			<tiles:insertAttribute name="menu"/>
		</aside>
		<section>
			<tiles:insertAttribute name="body" />
		</section>
	</div>

	
</body>
</html>