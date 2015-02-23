package com.service;

import java.util.ArrayList;

import com.action.StudentAction;
import com.dao.TestDao;
import com.model.StudentForm;

public class StudentService 
{
	TestDao testDao=new TestDao();
	
	
	
	ArrayList<StudentForm> list;
	public ArrayList<StudentForm> insertService(StudentForm studentForm)
	{
		list=new ArrayList<StudentForm>();
		list=testDao.save(studentForm);
		return list;
	}
	public ArrayList<StudentForm> fetchService(StudentForm studentForm)
	{
		list=new ArrayList<StudentForm>();
		list=testDao.fetch(studentForm);
		return list;
	}
	public ArrayList<StudentForm> deleteService(StudentForm studentForm,int id)
	{
		list=new ArrayList<StudentForm>();
		list=testDao.delete(studentForm,id);
		return list;
	}
	public StudentForm editService(int id,StudentForm studentForm) 
	{
		studentForm=new StudentForm();
		studentForm=testDao.edit(id, studentForm);
		return studentForm;
	}
	public ArrayList<StudentForm> updateService(StudentForm studentForm) 
	{
		list=new ArrayList<StudentForm>();
		list	=testDao.update(studentForm);
		return list;
		
	}
	
	
	
	
	
	
}
