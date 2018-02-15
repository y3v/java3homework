package pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped

public class PizzaOptions {
	private Map<String,String> toppings = new HashMap<String,String>();
	private Map<String,Double> dough = new HashMap<String,Double>();
	private Map<String,Double> size = new HashMap<String,Double>();
	private Map<String,Double> delivery = new HashMap<String,Double>();
	private List<String> toppingsList;
	private List<String> doughList;
	private List<String> sizeList;
	private List<String> deliveryList;
	
	public PizzaOptions() {
		populateToppings();
		populateDough();
		populateSize();
		populateDelivery();
	}
	
	
	
	public void populateToppings() {
		toppings.put("Tomatoes", "1.0");
		toppings.put("Pineapple", "1.50");
		toppings.put("Grilled Chicken", "1.2");
		toppings.put("Green Olives", ".50");
		toppings.put("Sundried Tomatoes", "2.0");
		toppings.put("Triple Cheese", "1.8");
		toppingsList = new ArrayList<String>(toppings.keySet());
	}
	
	public void populateDough() {
		dough.put("Thin Crust", 2.0);
		dough.put("Thick Crust", 1.50);
		dough.put("Deep Dish", 3.0);
		doughList = new ArrayList<String>(dough.keySet());
	}
	
	public void populateSize() {
		size.put("Small", 8.0);
		size.put("Medium", 10.50);
		size.put("Large", 13.0);
		sizeList = new ArrayList<String>(size.keySet());
	}
	
	public void populateDelivery() {
		delivery.put("Take-out", 0.0);
		delivery.put("Delivery", 5.0);
		deliveryList = new ArrayList<String>(delivery.keySet());
	}

	public Map<String, Double> getDelivery() {
		return delivery;
	}



	public void setDelivery(Map<String, Double> delivery) {
		this.delivery = delivery;
	}



	public List<String> getToppingsList() {
		return toppingsList;
	}



	public void setToppingsList(List<String> toppingsList) {
		this.toppingsList = toppingsList;
	}



	public List<String> getDoughList() {
		return doughList;
	}



	public void setDoughList(List<String> doughList) {
		this.doughList = doughList;
	}



	public List<String> getSizeList() {
		return sizeList;
	}



	public void setSizeList(List<String> sizeList) {
		this.sizeList = sizeList;
	}



	public List<String> getDeliveryList() {
		return deliveryList;
	}



	public void setDeliveryList(List<String> deliveryList) {
		this.deliveryList = deliveryList;
	}



	public Map<String, String> getToppings() {
		return toppings;
	}

	public void setToppings(Map<String, String> toppings) {
		this.toppings = toppings;
	}

	public Map<String, Double> getDough() {
		return dough;
	}

	public void setDough(Map<String, Double> dough) {
		this.dough = dough;
	}

	public Map<String, Double> getSize() {
		return size;
	}

	public void setSize(Map<String, Double> size) {
		this.size = size;
	}
	
}
