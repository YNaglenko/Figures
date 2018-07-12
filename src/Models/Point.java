package Models;

public class Point extends Figure {

	private int x;
	private int y;
	private static int id;
	private int curID;

	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Point.id = id;
	}
	public Point () {
		this (0,0); // telescope method
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		curID = ++id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + super.toString()+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
  public void print () {
	  System.out.println(this);
  }
}
