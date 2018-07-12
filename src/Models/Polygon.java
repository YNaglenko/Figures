package Models;

public class Polygon  extends Figure{
		private Point[] apexes;
 
	
	 public Polygon(Point [] apexes) {
		this.apexes = apexes;

	}

	public Point[] getApexes() {
		return apexes;
	}

	public void setApexes(Point[] apexes) {
		this.apexes = apexes;
	}

	public String showPolygonApex(Point[] apexes) {
		StringBuffer sb = new StringBuffer();

		for (Point i : apexes) {
			sb.append(i.toString() + "\n");
		}
		String str = sb.toString();
		return str;

	}

	/*public void SetPoint ((Point point, int i)) {
		if (i>=apexes.length) {
			//Point[] temp = new Point[i];
			temp = Arrays.copyOf(apexes, apexes.length+i);
			//apexes=temp;		
			}
	}*/
	@Override
	public String toString() {
		return "Polygon [QntyApexes=" +apexes.length  + "," + "\n" + "apexes:="+"\n" + this.showPolygonApex(apexes) + ","
				+ super.toString() + "]";
	}

}
