package ex3;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class NameSelect {
	private String name;
	
	public String showResults() {
		String ret;
		if (name.isEmpty()) {
			ret = "error";
		}
		else {
			ret = "nameResult";
		}
		return ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
