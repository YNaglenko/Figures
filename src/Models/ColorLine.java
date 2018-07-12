package Models;

public class ColorLine extends Line {
	private String colour;
@Override
	public String toString() {
		return "ColorLine [colour=" + colour + ", toString()=" + super.toString() + "]";
	}



	public ColorLine(int x1, int y1, int x2, int y2, String color) {
		super(x1, y1, x2, y2);
		this.colour = color;
		
	}

	public ColorLine(Point start, Point end, String color) {
		super(start, end);
		this.colour = color;
		
	}
  
}
