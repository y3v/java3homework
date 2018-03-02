package ex1;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Login {
	private String username;
	private String pword1;
	private String pword2;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPword1() {
		return pword1;
	}
	public void setPword1(String pword1) {
		this.pword1 = pword1;
	}
	public String getPword2() {
		return pword2;
	}
	public void setPword2(String pword2) {
		this.pword2 = pword2;
	}
	
	public String login() {
		String ret;
		if (pword1.equals(pword2)) {
			ret = "confirm";
		}
		else {
			ret = "login";
		}
		return ret;
	}
}
