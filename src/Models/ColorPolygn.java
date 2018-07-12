package Models;

public class ColorPolygn extends Polygon {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPolygn(Point[] apexes, String color) {
		super(apexes);
		this.setColor(color);

	}

	@Override
	public String toString() {
		return "ColorPolygn [color=" + this.getColor() + "," + super.toString() + "]";
	}
}