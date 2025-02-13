package hibernateproject01.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Student {
	@Id
	@GeneratedValue
private int sId;
	@Column(nullable=false)
private String sName;
	@Column(unique=true)
private long sPhno;
private LocalDate dob;
@Lob
private byte[]image;
@CreationTimestamp
private LocalDateTime objectCreationaltime;
@UpdateTimestamp
private LocalDateTime updatedTime;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public long getsPhno() {
	return sPhno;
}
public void setsPhno(long sPhno) {
	this.sPhno = sPhno;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public LocalDateTime getObjectCreationaltime() {
	return objectCreationaltime;
}
public void setObjectCreationaltime(LocalDateTime objectCreationaltime) {
	this.objectCreationaltime = objectCreationaltime;
}
public LocalDateTime getUpdatedTime() {
	return updatedTime;
}
public void setUpdatedTime(LocalDateTime updatedTime) {
	this.updatedTime = updatedTime;
}
}
