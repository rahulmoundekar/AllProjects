package com.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.ApplicationAware;

import com.dao.TestDao;
import com.model.StudentForm;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;

public class StudentAction extends ActionSupport implements ApplicationAware
{
	StudentForm studentForm;
	Map m;
	TestDao testDao=new TestDao();
	ArrayList<StudentForm> list=new ArrayList<StudentForm>();
	int fid;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	
	public void setApplication(Map map) 
	{	
		this.m=map;
	}
	public StudentForm getStudentForm() {
		return studentForm;
	}
	public void setStudentForm(StudentForm studentForm) {
		this.studentForm = studentForm;
	}
	
	
	public ArrayList<StudentForm> getList() {
		return list;
	}
	public void setList(ArrayList<StudentForm> list) {
		this.list = list;
	}
	
	
	StudentService studentService;
	
	
	public String insert()
	{
			studentService=new StudentService();
		
		list=studentService.insertService(studentForm);
			return "success";
		
	}
	
	public String fetch()
	{
		studentService=new StudentService();
		list=studentService.fetchService(studentForm);
				return "success";
		
	}
	
	public String delete()
	{
		studentService=new StudentService();
		list=studentService.deleteService(studentForm,getFid());
		return "success";
	}
	
	public  String edit()
	{
		/*System.out.println("-----------");
		studentForm=testDao.edit(getFid(), studentForm) ;
			return "success";*/
		
		studentService=new StudentService();
		studentForm=studentService.editService(getFid(), studentForm);
		return "success";
		
	}
	public String update()
	{
		/*System.out.println("!---------------!");
		list=testDao.update(studentForm);
		return "success";*/
		
		studentService=new StudentService();
		list=studentService.updateService(studentForm);
		return "success";
		
		
	}
	public String execute()
	{
			return "success";
	}
	
	
	
	
}
