package Helper;

import Models.ColorLine;
import Models.ColorPoint;
import Models.Figure;
import Models.Line;
import Models.Point;

public abstract class AbstractFactoryFigure {
	public abstract Figure randFigure(); 
		
	

	public abstract Figure getFigure(int n);
	}

