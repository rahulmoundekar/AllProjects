package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FbHoome extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String code="";

	public static Connection con=null;
	
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {		
		code = req.getParameter("code");
		if (code == null || code.equals("")) {
			throw new RuntimeException(
					"ERROR: Didn't get code parameter in callback.");
		}
		FbConnection fbConnection = new FbConnection();
		String accessToken = fbConnection.getAccessToken(code);

		FbGraph fbGraph = new FbGraph(accessToken);
		String graph = fbGraph.getFBGraph();
		Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
		ServletOutputStream out = res.getOutputStream();
		String fname=fbProfileData.get("first_name");
		String email=fbProfileData.get("email");
		String gender=fbProfileData.get("gender");
		
		System.out.println(fname);
		System.out.println(email);
		System.out.println(gender);
		
		out.println("<h1>Facebook Login using Java</h1>");
		out.println("<h2>Application Main Menu</h2>");
		out.println("<div>Welcome "+fbProfileData.get("first_name"));
		out.println("<div>Your Email: "+fbProfileData.get("email"));
		out.println("<div>You are "+fbProfileData.get("gender"));		
		
		
	new FbHoome().addProfile(fname, email, gender);
		
		
		
		
	}

	public  boolean addProfile(String first_name,String email,String gender){
		boolean f =false;
		try{
		con=new MysqlConnection().myJdbcConnection();
		PreparedStatement pst=con.prepareStatement("insert into fb (first_name, email, gender) values(?,?,?) ");
		pst.setString(1, first_name);
		pst.setString(2, email);
		pst.setString(3, gender);
		
		int a=pst.executeUpdate();
		
		if(a==1){
			f=true;
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return f;
	}
	
}
