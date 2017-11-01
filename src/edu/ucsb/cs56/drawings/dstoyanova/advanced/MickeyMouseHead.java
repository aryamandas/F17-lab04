package edu.ucsb.cs56.drawings.dstoyanova.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Mickey Mouse Head that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Deni Stoyanova
   @version for CS56, F17, UCSB
   
*/
public class MickeyMouseHead extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the upper left corner of head
       @param y y coord of upper left corner of head
       @param radius radius of head
    */
    public MickeyMouseHead(double x, double y, double radius)
    {
        //figure out the location of the ears and radius so that they touch the head well enough
        double earRadius = radius / 2;
        double ear1X = x + earRadius + radius; //right ear
        double ear2X = x - earRadius; //left ear
        double ear1Y = y - earRadius;
        radius = radius * 2; //width and height
        earRadius *= 2; //width and heights

        
        Ellipse2D.Double head = 
          new Ellipse2D.Double(x, y, radius, radius);
        Ellipse2D.Double earL = 
          new Ellipse2D.Double(ear2X, ear1Y, earRadius, earRadius);
        Ellipse2D.Double earR = 
          new Ellipse2D.Double(ear1X, ear1Y, earRadius, earRadius);

	
        // put the whole head together
	
        GeneralPath wholeHead = this.get();
        wholeHead.append(head, false);
        wholeHead.append(earL, false);
        wholeHead.append(earR, false);    
    }
}
