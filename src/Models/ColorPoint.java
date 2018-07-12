package Models;

public class ColorPoint extends Point {
    private String color;
	public ColorPoint (int x, int y, String color) {
	 super (x, y);
	 setColor(color);
 }
	@Override 
	public String toString() {
		return "ColorPoint"+"\n"+" [color=" + this.getColor() + "," + super.toString() + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
