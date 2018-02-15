package ex3;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class NameOptions {
	private String[] names = {"Cay", "David", "Marty"};

	public String[] getNames() {
		return names;
	}
}
