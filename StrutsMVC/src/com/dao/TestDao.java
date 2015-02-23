package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.model.StudentForm;
import com.util.MySqlConnection;

public class TestDao 
{
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static Connection con=null;
	StudentForm studentForm;
	
				
	public ArrayList<StudentForm> fetch(StudentForm studentForm)
	{
		ArrayList<StudentForm> list= new ArrayList<StudentForm>();
		
		try
		{
			
			con=MySqlConnection.getConnection();
			ps=con.prepareStatement("select * from student");  
			rs=ps.executeQuery();  
				
			while(rs.next())
			{  		
					studentForm=new StudentForm();
					studentForm.setId(rs.getInt(1));  
					studentForm.setName(rs.getString(2));  
					studentForm.setPassword(rs.getString(3));  
					studentForm.setEmail(rs.getString(4)); 
					studentForm.setAddr(rs.getString(5));
					list.add(studentForm);
			}		
		}
		catch(Exception e)	
		{
				e.printStackTrace();
		}  
		return list;
}
		
	public ArrayList<StudentForm> save(StudentForm studentForm) 
	{
		ArrayList<StudentForm> list= new ArrayList<StudentForm>();
		try
		{
			con=MySqlConnection.getConnection();
			ps=con.prepareStatement("insert into student values(?,?,?,?,?)");

		
			ps.setInt(1,studentForm.getId());
			
			ps.setString(2,studentForm.getName());
			ps.setString(3,studentForm.getPassword());
			ps.setString(4,studentForm.getEmail());
			ps.setString(5,studentForm.getAddr());
			ps.executeUpdate();
			
				ps=con.prepareStatement("select * from student");  
				rs=ps.executeQuery();  
					
				while(rs.next())
				{  		
					studentForm=new StudentForm();
					studentForm.setId(rs.getInt(1));  
					studentForm.setName(rs.getString(2));  
					studentForm.setPassword(rs.getString(3));  
					studentForm.setEmail(rs.getString(4)); 
					studentForm.setAddr(rs.getString(5));
					list.add(studentForm);
				}				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
				
	}
	public ArrayList<StudentForm> delete(StudentForm studentForm,int id) 
	{
		ArrayList<StudentForm> list= new ArrayList<StudentForm>();
		try
		{
			con=MySqlConnection.getConnection();
			
			ps=con.prepareStatement("delete from student where  id="+id+"");
			ps.executeUpdate();	
			ps=con.prepareStatement("select * from student");  
			ResultSet rs=ps.executeQuery();  
  	
			while(rs.next())
			{ 
				studentForm=new StudentForm();
				studentForm.setId(rs.getInt(1));  
				studentForm.setName(rs.getString(2));  
				studentForm.setPassword(rs.getString(3));  
				studentForm.setEmail(rs.getString(4)); 
				studentForm.setAddr(rs.getString(5));
				list.add(studentForm);  
			} 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			return list;
	}
	public StudentForm edit(int idd,StudentForm studentForm)
	{
		StudentForm s=new StudentForm();
		ArrayList<StudentForm> list= new ArrayList<StudentForm>();
		try
		{
			con=MySqlConnection.getConnection();
			ps=con.prepareStatement("select * from student where id=?");
			ps.setInt(1,idd);
			rs = ps.executeQuery();
			while(rs.next())
			{  		
				 studentForm =new StudentForm();
				studentForm.setId(rs.getInt(1));
				studentForm.setName(rs.getString(2));
				studentForm.setPassword(rs.getString(3));
				studentForm.setEmail(rs.getString(4));
				studentForm.setAddr(rs.getString(5));
			s=studentForm;	
			}		
					
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return s;
		
	}
	public ArrayList<StudentForm> update(StudentForm studentForm) 
	{
		ArrayList<StudentForm> list= new ArrayList<StudentForm>();
		try
		{	
			//System.out.println(studentForm.getId());
			int id=studentForm.getId();
			System.out.println(id);
			con=MySqlConnection.getConnection();
			System.out.println(studentForm.getAddr());
			PreparedStatement ps=con.prepareStatement("update student set name=?, password=?,email=?,addr=? where id=?"); 

			
			ps.setString(1,studentForm.getName());
			ps.setString(2,studentForm.getPassword());
			ps.setString(3,studentForm.getEmail());
			ps.setString(4,studentForm.getAddr());
			ps.setInt(5,studentForm.getId());
			
			ps.executeUpdate();
				
					
			ps=con.prepareStatement("select * from student");  
			rs=ps.executeQuery();  
				
			while(rs.next())
			{  		
				studentForm=new StudentForm();
					studentForm.setId(rs.getInt(1));  
					studentForm.setName(rs.getString(2));  
					studentForm.setPassword(rs.getString(3));  
					studentForm.setEmail(rs.getString(4)); 
					studentForm.setAddr(rs.getString(5));
					list.add(studentForm);
			}		
		}
		catch(Exception e)	
		{
				e.printStackTrace();
		}  
		return list;
	}
	
}
