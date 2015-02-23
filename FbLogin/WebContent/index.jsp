<%@ page import="com.FbConnection" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%FbConnection fb = new FbConnection(); %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		style="margin: 0 auto; background-image: url(img/fbloginbckgrnd.jpg); height: 360px; width: 610px;">
		<a href="<%=fb.getFBAuthUrl()%>"> <img
			style="margin-top: 138px;" src="./img/facebookloginbutton.png" />
		</a>
	</div>

</body>
</html>