package Helper;

import Models.ColorLine;
import Models.ColorPoint;
import Models.Figure;
import Models.Line;
import Models.Point;

public class FactoryFigure extends AbstractFactoryFigure {
	private final static int COUNT_OF_FIGURE_TYPE = 4;

	public static Figure randFigure() {
		return getFigure((int) (Math.random() * COUNT_OF_FIGURE_TYPE));
	}

	public static Figure getFigure(int n) {
		switch (n) {
		case 0:
			return new Point(1, 1);
		case 1:
			return new ColorPoint(1, 1, "red");
		case 2:
			return new Line(new Point(2, 3), new Point(3, 5));
		case 3:
			return new ColorLine(new Point(2, 3), new Point(3, 5), "green");
		default:
			return null;
		}
	}
}
