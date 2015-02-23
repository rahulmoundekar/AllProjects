package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="CollegeD")
public class College 
{

	private	int collegeId;
	private	String collegeName;
	
	
	private  List<Student> studentList;

	@Id
	@GeneratedValue
	public int getCollegeId() {
		return collegeId;
	}

	
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@OneToMany(targetEntity=Student.class, mappedBy="college", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	} 
	
	
}
