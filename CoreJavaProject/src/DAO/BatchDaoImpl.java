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
import model.Student;

public class BatchDaoImpl {
	
	Connection con;

	public void saveBatch(ArrayList<Batch> al)
	{
		try
		{
			Connection con = JdbcUtil.createMysqlConnection();
			String sql = "insert into batch values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			
			for (Batch batch : al) 
			{
				ps.setInt(1, batch.getBid());
				ps.setString(2, batch.getBname());
				
				
				/*Faculty f=batch.getFaculty();*/
				
				ps.executeUpdate();
				
			}
			
			
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
public HashMap<Integer, Batch> getBatch()
{
	HashMap<Integer, Batch> hm=new HashMap<Integer, Batch>();
	try
	{
		con = JdbcUtil.createMysqlConnection();
		String str = "select * from batch";
		String str1="select fname from faculty";
		
		Statement smt = con.createStatement();
		Statement smt1=con.createStatement();
		
		ResultSet rs = smt.executeQuery(str);
		ResultSet rs1=smt1.executeQuery(str1);
		while (rs.next()) 
		{
			Batch b = new Batch();
			b.setBid(rs.getInt(1));
			b.setBname(rs.getString(2));
			
			rs1.next();
			
			Faculty f=new Faculty();
			f.setFname(rs1.getString("fname"));
			b.setFaculty(f);
			
			hm.put(rs.getInt(1), b);
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
		// TODO: handle exception
	}finally
	{
		con = null;
		JdbcUtil.close();

	}
	return hm;
}

	
	public void displayBatch()
	{
		System.out.println("Bid\t\t"+"Bname\t\t"+"fname");
		HashMap<Integer, Batch> hm=getBatch();
		
		Set<Integer> s=hm.keySet();
		Iterator<Integer> itr=s.iterator();
		while (itr.hasNext())
		{
			int bid =itr.next();
			Batch batch=hm.get(bid);
			
			Faculty f=batch.getFaculty();
			System.out.println(bid+"\t\t"+batch.getBname()+"\t\t"+f.getFname());
			
		}
		
		
	}
	
}
