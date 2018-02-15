package ex5;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class HealthplanList {
	private String[] plans = {"Desjardins", "Blue Cross", "Cowens", "Assure","ScamInc", "Haxkz"};

	public String[] getPlans() {
		return plans;
	}
}
