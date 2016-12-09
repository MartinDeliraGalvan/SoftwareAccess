<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link rel='stylesheet' href='<c:url value="//fonts.googleapis.com/css?family=Michroma" />' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/styles.css" />' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/login.css" />' type='text/css' media='all' /> 


<script type="text/javascript" src="js/jquery.plugin.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>


<body id="body">

	<div id="loginWrapper" class="centered">

		<div id="LoginBox">
		
		
			<form action="auth.htm">
			<img id="uteplogo" src="<c:url value='/resources/images/uteplogo.png'/>" height="250px"	width="300px">
			<p id="loginTitle">Welcome to the<br>Accelerating, Connecting and Evaluating Student Success<br>Application</p>
			<input id="userInputTextBox" type="text" placeholder="Username or Email" name="userName" size="25" class="loginInput"><br>
			<input id="passwordInputTextBox" type="password" placeholder="Password" name="password" class="loginInput"><br>
			<button id="loginButton" onclick="location.href='auth.htm'">Login</button>
			</form>
			<footer>
				<p><br><br><br><br><br><br><br><br>
					&copyACCESS Developed by JJCOM Team 3 <br> Created as a
					capstone project for CS4310 and CS 4311<br> &copyACCESS
					Software is property of The University of Texas At El Paso
				</p>
			</footer>
			
		</div>
	</div>
</body>
</html>

