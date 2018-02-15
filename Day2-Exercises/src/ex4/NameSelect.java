package ex4;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="getName")

public class NameSelect {
	private String name;
	
	private Person person;
	
	public String showResults() {
		String ret;
		if (name.isEmpty()) {
			ret = "error";
		}
		else {
			person = PersonUtil.getPerson(name);
			ret = "nameResult2";
		}
		return ret;
	}

	public Person getPerson() {
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
