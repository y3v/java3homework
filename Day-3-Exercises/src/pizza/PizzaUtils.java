package pizza;

import java.util.List;

public class PizzaUtils implements FoodUtils {

	@Override
	public Pizza createItem(List<String> toppings, String dough, String size, String delivery) {
		Pizza pizza = new Pizza();
		pizza.setToppingsList(toppings);
		pizza.setDoughList(dough);
		pizza.setSizeList(size);
		pizza.setDeliveryList(delivery);
		
		double cost = 7;
		for (String topping : toppings) {
			cost += Double.parseDouble(PizzaOptions.getToppings().get(topping));
			System.out.println(topping);
			System.out.println(cost);
		}
		
		cost += PizzaOptions.getDough().get(dough);
		System.out.println(cost);
		cost += PizzaOptions.getSize().get(size);
		System.out.println(cost);
		cost += PizzaOptions.getDelivery().get(delivery);
		System.out.println(cost);
		
		pizza.setCost(cost);
		
		return pizza;
	}

	@Override
	public double getCost(List<String> toppings, List<String> dough, List<String> size, List<String> delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

}
