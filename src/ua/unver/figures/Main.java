package ua.unver.figures;

import java.util.Arrays;

import Helper.AbstractFactoryFigure;
import Helper.FactoryFigure;
import Models.ColorLine;
import Models.ColorPoint;
import Models.ColorPolygn;
import Models.ColorTriangle;
import Models.Figure;
import Models.Line;
import Models.Point;
import Models.Polygon;
import Models.Triangle;

public class Main {
    
    }
	public static void main(String[] args) {
		Point.setId(0);
		// создание точек
		Point p1 = new Point(3, 5);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(3, 8);
		// вывод инфо о точках
		System.out.println(p1);
		System.out.println(p2);
		/* System.out.println(p1.equals(p2)); */
		/*
		 * System.out.println(new Object().toString()); System.out.println(new
		 * Object().toString()); System.out.println("vasya".hashCode());
		 */

		// создание цветной точки и вывод инфо на экран
		ColorPoint cp1 = new ColorPoint(2, 2, "red");
		System.out.println(cp1);
		// создание линий вывод инфо
		Line line1 = new Line(p1, p2);
		Line line2 = new Line(3, 3, 4, 4);
		Line line3 = new Line(new Point(5, 5), new Point(6, 5));
		System.out.println(line1.toString());
		System.out.println(line2.toString());
		System.out.println(line3.toString());

		/*
		 * Point p31 = line2.getStart(); Point p32 = line2.getEnd();
		 */

		// создание треугольника
		Triangle tri1 = new Triangle(p1, p2, p3);
		System.out.println(tri1.toString());

		// создание цветного треугольника
		ColorTriangle ct = new ColorTriangle(p1, p2, p3, "blue");
		System.out.println(ct.toString());

		// создание массива точек для многоуольника
		Point[] pmass = new Point[5];
		pmass[0] = new Point(0, 0);
		pmass[1] = new Point(5, 5);
		pmass[2] = new Point(3, 3);
		pmass[3] = new Point(2, 2);
		pmass[4] = new Point(8, 8);

		// создание многоугольника
		Polygon pol = new Polygon(pmass);
		System.out.println(pol.toString());
		// создание цветного многоугольника
		ColorPolygn cpol = new ColorPolygn(pmass, "red");
		System.out.println(cpol.toString());
		
		Point[] points = new Point [] {new Point (3,1), new Point(1,2), new Point (1,2)};
		System.out.println(points.length);
		System.out.println("*************");
		points =Arrays.copyOf(points, points.length+2);
		System.out.println(points.length);
		
		
		for (Point point : points) {
			System.out.println(point);
		}
		AbstractFactoryFigure figures = new FactoryFigure();
		Figure [] massFig  = new Figure[10];
		
		for (int i=0; i<massFig; i++) {
			massFig[i]= FactoryFigure.randFigure();
		}
		int qPoints = 0;
		int qLines = 0;
		int qTriangles = 0;
		/*massFig[0] = new Point (3,2);
		massFig[1] = new Line (p1,p2);
		massFig[2]= new Triangle(p1, p2, p3);
		massFig[3] = new Point (4,5);
		massFig[4] = new Line (p2,p3);*/
		
		
		 for (int i=0; i<massFig.length; i++) {
			 
			 if (massFig[i] instanceof Point) {
			qPoints++;
		} else  if (massFig[i] instanceof Line) {
			qLines++;
		} else  if (massFig[i] instanceof Triangle) {
			qTriangles++;}
		 } 
			 System.out.println("q of Point="+qPoints);
			 System.out.println("q of Lines="+qLines);
			 System.out.println("q of Triangle="+qTriangles);
			//if (massFig[i]) instanceOf Point (bool) 	//проверка класса все объекты этого типа и его потомков 
	}      //massFig[i].getClass.getName -- имя класса который использовался в конструкторе при создании класса

}

