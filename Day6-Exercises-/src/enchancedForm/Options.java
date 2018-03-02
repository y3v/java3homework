package enchancedForm;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped

public class Options {
	private List<String> targetMarket = new ArrayList<String>();
	private List<String> radioList = new ArrayList<String>();
	private List<String> categories = new ArrayList<String>();
	
	public Options() {
		targetMarket.add("Men - 18-35 yo");
		targetMarket.add("Men - 36-45 yo");
		targetMarket.add("Men - 45-55 yo");
		targetMarket.add("Men - 55+");
		targetMarket.add("Women - 18-35 yo");
		targetMarket.add("Women - 36-45 yo");
		targetMarket.add("Women - 45-55 yo");
		targetMarket.add("Women - 55+");
		
		categories.add("Electronics");
		categories.add("Home");
		categories.add("Hardware");
		categories.add("Furniture");
		
		radioList.add("Option 1");
		radioList.add("Option 2");
		radioList.add("Option 3");
		
		
	}

	public List<String> getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(List<String> targetMarket) {
		this.targetMarket = targetMarket;
	}

	public List<String> getRadioList() {
		return radioList;
	}

	public void setRadioList(List<String> radioList) {
		this.radioList = radioList;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	
}
