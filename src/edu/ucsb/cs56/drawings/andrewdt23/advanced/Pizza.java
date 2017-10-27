package edu.ucsb.cs56.drawings.andrewdt23.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pizza that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Andrew Thompson 
   @version for CS56, F17, UCSB
   
*/
public class Pizza extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of pizza
       @param y y coord of upper left corner of pizza
       @param width width of the pizza crust
       @param height of pizza (including crust)
    */
    public Pizza(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double cheeseHeight = .9 * height;
        double crustHeight = height - cheeseHeight;
        
        double cheeseUpperLeftY = y + crustHeight;
        
        // Make the crust
        
        Rectangle2D.Double crust = 
            new Rectangle2D.Double(x, y ,
				   width, crustHeight);
	
        // make the cheese.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftCheese = 
            new Line2D.Double (x, y + crustHeight, x + width/2.0, y + cheeseHeight);
	
        Line2D.Double rightCheese =
            new Line2D.Double (x + width/2.0, y + cheeseHeight, x + width, y + crustHeight);
	
        // put the whole pizza together
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(crust, false);
        wholePizza.append(leftCheese, false);
        wholePizza.append(rightCheese, false);    
    }
}
