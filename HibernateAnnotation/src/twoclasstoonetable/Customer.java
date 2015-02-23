package twoclasstoonetable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer 
{

	private int custId;
	private String custName;
	
	
	CustomerInfo coInfo=new CustomerInfo();
	
	@Embedded
	public CustomerInfo getCoInfo() {
		return coInfo;
	}
	public void setCoInfo(CustomerInfo coInfo) {
		this.coInfo = coInfo;
	}
	
	@Id
	@GeneratedValue
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	
	
	
	
}
