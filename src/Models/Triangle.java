package Models;

public class Triangle extends Figure {
 Point apexA;
 Point apexB;
 Point apexC;
 Line sideAB;
 Line sideBC; 
 Line sideAC;
public Triangle(Point apexA, Point apexB, Point apexC) {
	super();
	this.apexA = apexA;
	this.apexB = apexB;
	this.apexC = apexC;
}

public Line getSideAB() {
	 if (sideAB==null) { 
	 sideAB = new Line (apexA, apexB);} 
	 return sideAB;

}

public Line getSideBC() {
	 if (sideBC==null) { 
	 sideBC = new Line (apexB, apexC);} 
	 return sideBC;

}

public Line getSideAC() {
	 if (sideAC==null) { 
	 sideAC = new Line (apexA, apexC);} 
	 return sideAC;

}

@Override
public String toString() {
	return "Triangle"+"\n"+"[apexA=" + this.getApexA() + "," +"\n"
							+ " apexB=" + this.getApexB() + ","+"\n"
							+" apexC=" + this.getApexC() + ","+"\n"
							+" sideAB=" + this.getSideAB()+"," +"\n" 
							+" sideBC="+ this.getSideBC()+"," + "\n"
							+" sideAC=" + this.getSideAC() + "]";
}

public Point getApexA() {
	return apexA;
}

public void setApexA(Point apexA) {
	this.apexA = apexA;
}

public Point getApexB() {
	return apexB;
}

public void setApexB(Point apexB) {
	this.apexB = apexB;
}

public Point getApexC() {
	return apexC;
}

public void setApexC(Point apexC) {
	this.apexC = apexC;
}


}
