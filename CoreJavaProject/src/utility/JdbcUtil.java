package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	
static	Connection con=null;
	
	public static Connection createMysqlConnection()
	  {
		 try
		 {
		  Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","root");
		 }
		 catch (Exception e) {
			 e.printStackTrace();
			// TODO: handle exception
		}
		 
		 return con;
	  }
	 
	 
public	 static Connection createOracleconnection()
	 {
		 try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","","");
		 }catch (Exception e) {
			e.printStackTrace();
		}
		 
		return con; 
	 }


public static void close()
{
	try{
		con.close();
	}catch (Exception e) {
		// TODO: handle exception
	}
}

}
