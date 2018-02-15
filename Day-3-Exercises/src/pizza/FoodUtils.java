package pizza;

import java.util.List;

public interface FoodUtils {
	public Pizza createItem(List<String> toppings, String dough, String size, String delivery);
	public double getCost(List<String> toppings, List<String> dough, List<String> size, List<String> delivery);
}
