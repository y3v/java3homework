package enchancedForm;

import java.util.ArrayList;
import java.util.List;

public class Options {
	private List<String> targetMarket = new ArrayList<String>();
	
	public Options() {
		targetMarket.add("Men - 18-35 yo");
		targetMarket.add("Men - 36-45 yo");
		targetMarket.add("Men - 45-55 yo");
		targetMarket.add("Men - 55+");
		targetMarket.add("Women - 18-35 yo");
		targetMarket.add("Women - 36-45 yo");
		targetMarket.add("Women - 45-55 yo");
		targetMarket.add("Women - 55+");
	}

	public List<String> getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(List<String> targetMarket) {
		this.targetMarket = targetMarket;
	}
	
	
}
