package edu.ucsb.cs56.drawings.acr.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a box that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Arielle Robles 
   @version for CS56, F17, UCSB
   
*/


public class Box extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of box
       @param y y coord of lower left corner of box
       @param width width of the box
       @param height height of the box
    */

    public Box(double x, double y, double width, double height)
    {
	Rectangle2D.Double mainBox = 
            new Rectangle2D.Double(x, y ,
				   width, height);


	Line2D.Double topSlit = 
            new Line2D.Double (x, y + 0.1*height,
			       x + width, y + 0.1*height);

	GeneralPath theBox = this.get();
	theBox.append(mainBox, false);
	theBox.append(topSlit, false);
    }

    
   
}
