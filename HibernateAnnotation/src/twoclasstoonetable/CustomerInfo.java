package twoclasstoonetable;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerInfo 
{

	String custAddr;
	long salary;
	boolean isPermanant;
	
	
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public boolean isPermanant() {
		return isPermanant;
	}
	public void setPermanant(boolean isPermanant) {
		this.isPermanant = isPermanant;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
}
