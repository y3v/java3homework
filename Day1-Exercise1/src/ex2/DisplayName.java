package ex2;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped 

public class DisplayName {
	private String firstname;
	private String lastname;
	
	public String namePage() {
		String ret;
		if (isMissing(firstname) || isMissing(lastname)) {
			ret = "error";
		}
		else {
			ret= "results";
		}
		return ret;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private boolean isMissing(String value) {
	    return((value == null) || (value.trim().isEmpty()));
	  }
	
}
