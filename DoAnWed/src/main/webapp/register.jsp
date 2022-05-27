<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<title>Register</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style/register.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/register.js"></script>

</head>
<body>
	<div class="center">
		<div class="header">Register</div>
		<form action="RegisterController" class="Menu" id="Menu" method="post">
			<p style="color: red; text-align: center">${err}</p>
			<p>
				<input type="text" placeholder="User name" size="50"  id="username" class="username" name="username">
			</p>
			<p>
				<input type="email" placeholder="E-mail" size="50" 
					id="email" class="email" name="email">
			</p>
			<p>
				<input type="password" placeholder="Password" size="50" id="password" class="password"
					name="password">
			</p>
			<p>
				<input type="password" placeholder="Re Password" id="repassword" class="repassword" name="repassword">
			</p>
			<p>
				<button type="submit" value="Register" id="btnRegister">Register</button>
			</p>
			<p>
				<a href="login.jsp">Click here to Login</a>
			</p>
		</form>
	</div>
</body>
</html>