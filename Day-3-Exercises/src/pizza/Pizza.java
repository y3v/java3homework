package pizza;

import java.util.List;

public class Pizza {
	private List<String> toppingsList;
	private String doughList;
	private String sizeList;
	private String deliveryList;
	private double cost;
	
	public List<String> getToppingsList() {
		return toppingsList;
	}
	public void setToppingsList(List<String> toppingsList) {
		this.toppingsList = toppingsList;
	}
	public String getDoughList() {
		return doughList;
	}
	public void setDoughList(String doughList) {
		this.doughList = doughList;
	}
	public String getSizeList() {
		return sizeList;
	}
	public void setSizeList(String sizeList) {
		this.sizeList = sizeList;
	}
	public String getDeliveryList() {
		return deliveryList;
	}
	public void setDeliveryList(String deliveryList) {
		this.deliveryList = deliveryList;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
