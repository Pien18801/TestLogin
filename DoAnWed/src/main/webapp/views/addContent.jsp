<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style/addContent.css">
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
<script language="javascript" src="js/addContent.js"></script>
</head>
<body>
	<div class="formContent">
		<h1>Add Content</h1>
		<hr>
		<form id="form" action="AddContentController" method="post">
			<table id="tableformcontent">
				<tr>
					<td class="content">Content Form Elements</td>
				</tr>
				<tr class="contentinput">
					<td><label>Title</label> <br> 
					<input name="title"  id="title" placeholder="Enter the title" ><br><br>
					<label>Brief</label>
					<br> <textarea name="brief" id="brief" cols="30" rows="10" ></textarea> 
					<br><br>
					<label>Content</label>
					<br> 
					<textarea name="content" id="content" cols="30" rows="10" ></textarea> <br><br>
					<input  class="submit" type="submit" value="Submit Button"> 
					<input onclick="resetButton()" class="submit" type="button" value="Reset Button"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>