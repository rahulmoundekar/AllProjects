package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;



@Entity
public class PersonDetails 
{

		int	detailid;
		String detailAddr;
		String haveJob;
		
		
		
		
		@Id
		@GeneratedValue
		@Column(name="detailId_PK")
		public int getDetailid() {
			return detailid;
		}
		public void setDetailid(int detailid) {
			this.detailid = detailid;
		}
		
		public String getDetailAddr() {
			return detailAddr;
		}
		public void setDetailAddr(String detailAddr) {
			this.detailAddr = detailAddr;
		}
		
		public String getHaveJob() {
			return haveJob;
		}
		public void setHaveJob(String haveJob) {
			this.haveJob = haveJob;
		}
		
		
		
			
}
