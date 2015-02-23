package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import utility.JdbcUtil;

import model.Course;

public class CourseDaoImpl {
	
	Connection con;
	PreparedStatement ps;
	
public void saveCourse(ArrayList<Course> al)
 {
	con = JdbcUtil.createMysqlConnection();
		try 
		{
			ps = con.prepareStatement("insert into course values(?,?)");

			for (Course course : al)
			{
				ps.setInt(1, course.getCid());
				ps.setString(2, course.getCname());
				ps.executeUpdate();
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			JdbcUtil.close();

		}
}

 public HashMap<Integer, Course> getCourse() 
 {
		HashMap<Integer, Course> hm = new HashMap<Integer, Course>();
		try 
		{
			con = JdbcUtil.createMysqlConnection();
			Statement smt = con.createStatement();
			String sql = "select * from course";
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) 
			{
				Course c = new Course();
				c.setCid(rs.getInt("cid"));
				c.setCname(rs.getString("cname"));

				hm.put(rs.getInt("cid"), c);

			}

		} catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		} finally 
		{
			con = null;
			JdbcUtil.close();
		}
		return hm;

	}


 public void displayCourse()
 {
		HashMap<Integer, Course> hm = getCourse();

		System.out.println("Cid\t" + "cname\t");

		Set<Integer> s = hm.keySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) 
		{

			int cid = (Integer) itr.next();
			System.out.print(cid + "\t");
			
			Course c = hm.get(cid);
			System.out.println(c.getCname());

		}

	}
    
    
    
    

}
