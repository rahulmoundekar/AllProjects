<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 
<%
 
response.setContentType("text/xml");
String sn=request.getParameter("ok");
int i=Integer.parseInt(sn);
 
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/country","root","root");
Statement st=con.createStatement();
ResultSet rs = st.executeQuery("select * from emp where empno="+i);
if(rs.next())
{
out.println(rs.getInt(1));
out.println(rs.getString(2));

}
 
rs.close();
st.close();
con.close();
 
%>