package edu.ucsb.cs56.drawings.rtaylor.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Rectangle that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Reed Taylor
   @version for CS56, W16, UCSB

*/
public class Rectangle extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of Rectangle
       @param y y coord of lower left corner of Rectangle
       @param width width of the Rectangle
       @param height of Rectangle
    */
    public Rectangle(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.



        // Rectangle

        Rectangle2D.Double outline =
            new Rectangle2D.Double(x, y,
				   width, height);


        GeneralPath wholeRect = this.get();
        wholeRect.append(outline, false);

    }
}
