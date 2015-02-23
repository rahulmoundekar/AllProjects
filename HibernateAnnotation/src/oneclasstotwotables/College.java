package oneclasstotwotables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="College")
@SecondaryTable(name="CollegeInfo")
public class College 
{
	private int collegeId;
	private String collegeName;
	
	
	private String collegeAddr;
	private String collegeUniversity;
	private int collegeCode;
	
	
	
	
	@Id
	public int getCollegeId() 
	{
		return collegeId;
	}
	public void setCollegeId(int collegeId) 
	{
		this.collegeId = collegeId;
	}
	public String getCollegeName() 
	{
		return collegeName;
	}
	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	@Column(table="CollegeInfo")
	public String getCollegeUniversity() 
	{
		return collegeUniversity;
	}
	public void setCollegeUniversity(String collegeUniversity) 
	{
		this.collegeUniversity = collegeUniversity;
	}
	@Column(table="CollegeInfo")
	public String getCollegeAddr() 
	{
		return collegeAddr;
	}
	public void setCollegeAddr(String collegeAddr) 
	{
		this.collegeAddr = collegeAddr;
	}
	@Column(table="CollegeInfo")
	public int getCollegeCode()
	{
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) 
	{
		this.collegeCode = collegeCode;
	}
	
	
	
	
	
}
