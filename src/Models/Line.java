package Models;

public class Line  extends Figure{
 private Point Start;
 public Point getStart() {
	return Start;
}
public void setStart(Point start) {
	Start = start;
}
private Point End;
@Override
public String toString() {
	return "Line [start=" + Start + ", end=" + End + ", "+ "]";
}
public Point getEnd() {
	return End;
}
public void setEnd(Point end) {
	this.End = end;
}



public Line (int x1, int y1, int x2, int y2) {
	Start = new Point(x1, y2);
	End = new Point (x2, y2);
}
public Line(Point start, Point end) {
	super();
	this.Start = start;
	this.End = end;
}
 
 
}
