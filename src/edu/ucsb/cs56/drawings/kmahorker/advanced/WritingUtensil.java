package edu.ucsb.cs56.drawings.kmahorker.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class WritingUtensil extends GeneralPathWrapper implements Shape{

	/**
	Constructor

	@param x top left corner x coord of writing utensil
	@param y top left corner y coord of writing utensil
	@param width total width
	@param height total height
	**/ 
	public WritingUtensil(double x, double y, double width, double height){

		double middleHeight = 0.75 * height; 

		double centerHoriz = x+(width/2);

		Rectangle2D.Double middleRectangle = new Rectangle2D.Double(x,y, width, middleHeight);

		Line2D.Double  leftLine = new Line2D.Double(x, y+middleHeight, centerHoriz, y+ height );

		Line2D.Double rightLine = new Line2D.Double(x+width, y+middleHeight, centerHoriz, y+height);

		GeneralPath writing = this.get();

		writing.append(middleRectangle, false);
		writing.append(leftLine, false);
		writing.append(rightLine, false);
	}
}