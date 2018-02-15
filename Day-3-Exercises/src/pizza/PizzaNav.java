package pizza;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class PizzaNav {
	Pizza pizza;
	FoodUtils pizzaService = new PizzaUtils();
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public String placeOrder() {
		String ret = null;
		pizza = pizzaService.createItem();
		
		
		return ret;
	}
	
}
