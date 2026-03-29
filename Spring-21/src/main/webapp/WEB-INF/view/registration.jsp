<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<!-- 	<h1>REGISTRATION PAGE</h1>

	<form action="registration.do" method="post">

		<input type="text" name="id" placeholder="enter id"><br>
		<input type="text" name="name" placeholder="enter name"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<input type="text" name="salary" placeholder="enter salary"><br>
		<button>save</button>
	</form> -->
	
	
	
	<!-- ========================================================================= -->



    ${msg}
	<h1>REGISTRATION PAGE</h1>

	<form action="${pageContext.request.contextPath}/dynamic/admission/registration"  method="post">
		<input type="text" name="id" placeholder="enter id"><br>
		<input type="text" name="name" placeholder="enter name"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<input type="text" name="salary" placeholder="enter salary"><br>
		<button>save</button>
	</form>



</body>
</html>