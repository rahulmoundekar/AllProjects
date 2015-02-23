package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import utility.JdbcUtil;
import utility.Utility;

import model.Batch;
import model.Faculty;
import model.Student;

public class StudentDaoImpl {

	Connection con;
	public void saveStudent(ArrayList<Student> al) 
	{
		try
		{
			Connection con = JdbcUtil.createMysqlConnection();
			String sql = "insert into student values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			String sql1 = "insert into batstu (sid,bid) values(?,?)";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			
			for (Student student : al) 
			{
				ps.setInt(1, student.getRollno());
				ps.setString(2, student.getName());
				
				Batch b = student.getBatch();
				
				ps1.setInt(1, student.getRollno());
				ps1.setInt(2, b.getBid());
				
				ps.executeUpdate();
				ps1.executeUpdate();
			}
			
			
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public HashMap<Integer, Student> getStudent()
	{
		HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
		try
		{
			con = JdbcUtil.createMysqlConnection();
			String str = "select * from student";
			String str1="select bid from batstu,student where student.sid=batstu.sid";
			
			Statement smt = con.createStatement();
			Statement smt1=con.createStatement();
			
			ResultSet rs = smt.executeQuery(str);
			ResultSet rs1=smt1.executeQuery(str1);
			
			while (rs.next()) 
			{
				Student student = new Student();

				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				
				rs1.next();
				
				Batch batch=new Batch();
				batch.setBid(rs1.getInt(1));
				
				student.setBatch(batch);
				
				hm.put(rs.getInt(1), student);
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

	public void displayStudent()
	{	

		System.out.println("sid\t\t"+"sname\t\t"+"bid");
		HashMap<Integer, Student> hm=getStudent();
		
		Set<Integer> s=hm.keySet();
		Iterator<Integer> itr=s.iterator();
		while (itr.hasNext())
		{
			int sid =itr.next();
			Student student=hm.get(sid);
			
			Batch batch=student.getBatch();
			System.out.println(sid+"\t\t"+student.getName()+"\t\t"+batch.getBid());
			
		}
			
	}
	/*public void searchStudentRollno() 
	{
		PreparedStatement ps=null,ps1=null;
		ResultSet rs=null;
		try
		{
			System.out.println("Enter Student Rno. which want to search");
			int sid=Utility.scanner.nextInt();
		
			String sql="select cid from student  left join batstu  on student.sid=batstu.sid left join batch as b on batstu.bid=b.bid where student.sid=?";
			String sql1="slect * student";
			ps=con.prepareStatement(sql);
			ps1=con.prepareStatement();
			ps.setInt(1,sid);
			rs=ps.executeQuery();
			System.out.println("Rno.\tName\tbid");
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			else
				System.out.println("Record not found");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}*/


}
