package ValidatorsAndConverters.A;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class User {
	private String fname;
	private String lname;
	private Integer age;
	private Date date;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String login() {
		return ("next");
	}
	
}
