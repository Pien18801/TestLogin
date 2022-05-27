<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="style/login.css">
</head>
<body>
    <form class="form-container" method="post" action="login" >
        <p id="error"></p>
        <div class="form-title">
            Please Sign In
        </div>
        <div class="form-grp">
            <input type="email" name="email" placeholder="E-mail" id = "user">
            <i class="fa fa-times u_times"></i>
            <i class="fa fa-check u_check"></i>
        </div>
        <div class="form-grp">
            <input type="password" name="password" placeholder="Password" id = "pass">
            <i class="fa fa-times p_times"></i>
            <i class="fa fa-check p_check"></i>
        </div>
        <div class="form-grp">
            <label><input type="checkbox" checked="checked" name="remember"> Remember me</label></br>
        </div>
        <div class="form-grp">
            <input type="submit" name="login-btn" value="Login">
        </div>
        <div class="form-register">
            <a href="register.jsp" >Click here to Register</a>
        </div>
    </form>
    <script type="text/javascript" src= "js/login.js"></script>
</body>
</html>