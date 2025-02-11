package remockhibernate.demo;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class workers {
@Id
@GeneratedValue
	private int WID;
	private String WName;
	private int WAge;
	private byte[]img;
	private LocalDate ObjectcreationTime;
	private LocalDate DOB;
	public int getWID() {
		return WID;
	}
	public String getWName() {
		return WName;
	}
	public void setWName(String wName) {
		WName = wName;
	}
	public int getWAge() {
		return WAge;
	}
	public void setWAge(int wAge) {
		WAge = wAge;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public LocalDate getObjectcreationTime() {
		return ObjectcreationTime;
	}
	public void setObjectcreationTime(LocalDate objectcreationTime) {
		ObjectcreationTime = objectcreationTime;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public void setWID(int wID) {
		WID = wID;
	}
	
	
	
	
}
