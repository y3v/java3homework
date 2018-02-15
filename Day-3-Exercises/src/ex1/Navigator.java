package ex1;

import java.util.Random;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped 

public class Navigator {

	
	public String choosePage(String currentPage) {
		Random rand = new Random();
		String ret;
		int num = rand.nextInt(2);
		if (num == 0) {
			ret = "defeat";
		}
		else {
			if (currentPage.equals("a")) {
				ret = "b";
			}
			else if (currentPage.equals("b")) {
				ret = "c";
			}
			else {
				ret = "victory";
			}
		}
		return ret;
	}

}
