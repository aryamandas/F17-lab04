package edu.ucsb.cs56.drawings.kmahorker.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Pen extends WritingUtensil implements Shape{

	/**
	Constructor

	@param x top left corner x coord of pen
	@param y top left corner y coord of pen
	@param width total width
	@param height total height
	**/ 
	public Pen(double x, double y, double width, double height){
		super(x, y, width, height);
		double gripY = y + height*0.5;
		
		double pointY = y + height * 0.9;
		double pointX1 = x + width*0.33;
		double pointX2 = x + width*0.67;
		
		double gripVertY1 = y + height * 0.55;
		double gripVertY2 = y + height * 0.7;

		Line2D.Double gripHoriz = new Line2D.Double(x, gripY, x+width, gripY);

		Line2D.Double gripVert1 = new Line2D.Double(x + width*0.25, gripVertY1, x + width*0.25, gripVertY2);
		Line2D.Double gripVert2 = new Line2D.Double(x + width *0.5, gripVertY1, x + width*0.5, gripVertY2);
		Line2D.Double gripVert3 = new Line2D.Double(x + width*0.75, gripVertY1, x + width*0.75, gripVertY2);

		Line2D.Double pointHoriz = new Line2D.Double(pointX1, pointY, pointX2, pointY);

		GeneralPath penPath = this.get();

		penPath.append(gripHoriz, false);
		penPath.append(gripVert1, false);
		penPath.append(gripVert2, false);
		penPath.append(gripVert3, false);
		penPath.append(pointHoriz, false);
	}
}