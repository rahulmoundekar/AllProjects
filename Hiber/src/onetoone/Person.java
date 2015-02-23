
package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Person")
public class Person
{
	
		int personId;
		String personName;
		
		PersonDetails personDetails;
		
		
		
		@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="pDetail_FK")
		public PersonDetails getPersonDetails() 
		{
			return personDetails;
		}
		public void setPersonDetails(PersonDetails personDetails) 
		{
			this.personDetails = personDetails;
		}
		
		
		
		@Id
		@GeneratedValue
		public int getPersonId() {
			return personId;
		}
		public void setPersonId(int personId) {
			this.personId = personId;
		}
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
	

}
