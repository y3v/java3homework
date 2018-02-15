package pizza;

import java.util.List;

public class Pizza {
	private List<String> toppingsList;
	private List<String> doughList;
	private List<String> sizeList;
	private List<String> deliveryList;
	private double cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
