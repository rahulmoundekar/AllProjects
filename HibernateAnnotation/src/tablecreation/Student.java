package tablecreation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="studentInfo")
public class Student 
{

	
	private int rolln;
	private String studentName;
	private String studentAddr;
	private long studentmob;
	private boolean pass;
	
	private java.util.Date dbo;
	private  java.util.Date joindate;
	
	
	
	
	
	
	public boolean isPass() {
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	@Id
	@GeneratedValue
	@Column(name="studentId")
	public int getRolln() {
		return rolln;
	}
	public void setRolln(int rolln) {
		this.rolln = rolln;
	}
	
	public String getStudentAddr() {
		return studentAddr;
	}
	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}
	public long getStudentmob() {
		return studentmob;
	}
	public void setStudentmob(long studentmob) {
		this.studentmob = studentmob;
	}
	
	@Column(nullable=true)
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	@Temporal(TemporalType.TIMESTAMP)
	public java.util.Date getJoindate() {
		return joindate;
	}
	public void setJoindate(java.util.Date joindate) {
		this.joindate = joindate;
	}
	@Temporal(TemporalType.DATE)
	public java.util.Date getDbo() {
		return dbo;
	}
	public void setDbo(java.util.Date dbo) {
		this.dbo = dbo;
	}
	
	
	
	
	
	
	
}
