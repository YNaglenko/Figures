package Models;

public class ColorTriangle extends Triangle {
    private String color;

public ColorTriangle(Point apexA, Point apexB, Point apexC, String color) {
	super(apexA, apexB, apexC);
	this.setColor(color);
	
}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorTriangle [color=" + color + ","+ super.toString() + "]";
	}

}
