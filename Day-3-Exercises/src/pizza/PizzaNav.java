package pizza;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class PizzaNav {
	Pizza pizza;
	List<String> toppings;
	String dough;
	String size;
	String delivery;
	FoodUtils pizzaService = new PizzaUtils();
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public String placeOrder() {
		String ret;
		if (toppings.isEmpty() || dough.isEmpty() || size.isEmpty() || delivery.isEmpty()) {
			ret = "error";
		}
		else {
			pizza = pizzaService.createItem(toppings,dough,size,delivery);
			ret="showOrder";
		}
		
		
		return ret;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public FoodUtils getPizzaService() {
		return pizzaService;
	}
	
}
