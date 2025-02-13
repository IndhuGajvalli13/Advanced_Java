package hibernateproject01.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
private int PId;
	@Column(nullable=false)
private String pName;
	@Column(unique=true)
private long PhNo;
	
	@OneToOne
private PanCard pc;

	public int getPId() {
		return PId;
	}

	public void setPId(int pId) {
		PId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getPhNo() {
		return PhNo;
	}

	public void setPhNo(long phNo) {
		PhNo = phNo;
	}

	public PanCard getPc() {
		return pc;
	}

	public void setPc(PanCard pc) {
		this.pc = pc;
	}
	
}
