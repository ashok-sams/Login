<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<pre>


<h2>Sign In</h2>


<form action="${contextPath}/UserRegtiser" method="post"> 

Name:<input type="text" name="name"/><br/><br/>
 
Email:<input type="text" name="email"/><br/><br/> 
 
Password:<input type="password" name="password"/><br/><br/> 

Mobile:<input type="text" name="mobile"/><br/><br/>
 
<input type="submit" value="Register"/>
 
</form>  

</pre>


<a href="${contextPath}/login.jsp">Sign UP</a>


</div>
</body>
</html> 