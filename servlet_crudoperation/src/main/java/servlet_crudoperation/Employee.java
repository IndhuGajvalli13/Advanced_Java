package servlet_crudoperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int Empid;
	@Column(nullable=false)
	private String Empname;
	private String Empemail;
	private Long Empmobile;
	private Long Empsalary;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpemail() {
		return Empemail;
	}
	public void setEmpemail(String empemail) {
		Empemail = empemail;
	}
	public Long getEmpmobile() {
		return Empmobile;
	}
	public void setEmpmobile(Long empmobile) {
		Empmobile = empmobile;
	}
	public Long getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(Long empsalary) {
		Empsalary = empsalary;
	}
	
}