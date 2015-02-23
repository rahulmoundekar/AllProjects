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

import model.Batch;
import model.Course;
import model.Faculty;

public class FacultyDaoImpl 
{
	Connection con;
	PreparedStatement ps;
	
	public void  savefaculty(ArrayList<Faculty> al) 
	{
		try {

			Connection con = JdbcUtil.createMysqlConnection();
			String sql = "insert into faculty values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			String sql1 = "insert into coufact (cid,fid) values(?,?)";
			PreparedStatement ps1 = con.prepareStatement(sql1);

			for (Faculty faculty : al) 
			{
				ps.setInt(1, faculty.getFid());
				ps.setString(2, faculty.getFname());
				
				Course c = faculty.getCourse();
				
				ps1.setInt(1, c.getCid());
				ps1.setInt(2, faculty.getFid());
				
				ps.executeUpdate();
				ps1.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public HashMap<Integer, Faculty> getFaculty() 
	{
		ResultSet rs=null,rs1=null;
		HashMap<Integer, Faculty> hm = new HashMap<Integer, Faculty>();
		try {
			con = JdbcUtil.createMysqlConnection();
			String str = "select fid,fname from faculty ";
			String str1="select cid from coufact,faculty where faculty.fid=coufact.fid ";
			
			Statement smt1 = con.createStatement();
            Statement smt2= con.createStatement();
		
            rs= smt1.executeQuery(str);
			rs1=smt2.executeQuery(str1);
				while (rs.next()) 
				{
					Faculty f = new Faculty();
					
					f.setFid(rs.getInt(1));
					f.setFname(rs.getString(2));
					
					rs1.next();
					//System.out.println(rs1.getInt(1));
					Course c= new Course();
					c.setCid(rs1.getInt(1));
					f.setCourse(c);
					
					hm.put(rs.getInt("fid"), f);
					
				}	
				
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("try again");
		} finally
		{
			con = null;
			JdbcUtil.close();

		}
		return hm;

	}
	
	

	public void displayFaculty()
	{
		HashMap<Integer, Faculty> hm = getFaculty();
		System.out.println("fid\t\t" + "fname\t\t" + "cid");

		Set<Integer> s = hm.keySet();
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) 
		{
			int fid = itr.next();
				
			Faculty faculty = hm.get(fid);
			
			Course c=faculty.getCourse();
			
			System.out.println(fid+"\t\t"+faculty.getFname()+"\t\t"+c.getCid());

		}

		

	}

	
}
