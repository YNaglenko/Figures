package Models;

public abstract class Figure {
	private static int id;
	private int curID;
	
public 	Figure () {
	curID = ++id;
}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Figure.id = id;
}
	
	public String toString() {
		return "Figure [curID=" + curID + "]";
	}
}