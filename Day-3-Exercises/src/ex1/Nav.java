package ex1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Nav {

	private String fgColor;
	private String bkColor;
	Colors colors;
	
	public String getBkColor() {
		return bkColor;
	}
	public void setBkColor(String bkColor) {
		this.bkColor = bkColor;
	}
	public String getFgColor() {
		return fgColor;
	}
	public void setFgColor(String fgColor) {
		this.fgColor = fgColor;
	}
	
	public String doGame() {
		String ret;
		if (fgColor.isEmpty() || bkColor.isEmpty()) {
			ret = "error";
		}
		else {
			colors = new Colors(bkColor,fgColor);
			if (colors.getBkColor().equals(colors.getFgColor())) {
				ret = "error";
			}else {
				ret = "a";
			}
		}
		return ret;
	}
	
	public Colors getColors() {
		return colors;
	}
	
}
