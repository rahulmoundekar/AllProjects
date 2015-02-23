package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Student 
{

	int studentId;
	String studentName;
	String studentAddr;
	
	private College college;

	@ManyToOne
	@JoinColumn(name="college_Id")
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	
	@Id
	@GeneratedValue
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}
