package ex1;

public class Colors {
	private String fgColor;
	private String bkColor;
	
	public Colors(String bg, String fg) {
		setFgColor(fg);
		bkColor = bg;
	}
	
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
}
