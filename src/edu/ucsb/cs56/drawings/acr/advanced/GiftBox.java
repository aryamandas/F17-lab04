package edu.ucsb.cs56.drawings.acr.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

/**
   A GiftBox
      
   @author Arielle Robles
   @version for CS56, F17, UCSB
   
*/

public class GiftBox extends Box implements Shape
{
    /**
     * Constructor for objects of class GiftBox
     */

    
    public GiftBox(double x, double y, double width, double height)
    {
	//construct basic box
	super(x, y, width, height);

	//get the GeneralPath gp in order to append stuff to it
	GeneralPath gp = this.get();

	//make two circles on top of the box to look like a bow
	//make two lines to look like ribbon
	//
	//      +     +        plus signs indicate center of circle for bows
 	//(x,y)
	//   _____________     located at x+w/4 and x+3w/4, height y - h - 2/5h, r=2/5h
	//   |     |     |
	//   |     |     |     h/2
	//   -------------
	//   |     |     |
	//   | w/2 | w/2 |     h/2
	//   -------------
	//(x,y+h)        (x+w,y+h)

	double bowRadius = width/5;
	
	Line2D.Double horizontalRibbon = 
            new Line2D.Double(x, y + (height * 0.5),
                               x + width, y + (height * 0.5));

	Line2D.Double verticalRibbon =
	    new Line2D.Double(x + (width * 0.5), y,
				x + (width * 0.5), y + height);

	Ellipse2D.Double leftBow =                                                                                                                                                                        
            new Ellipse2D.Double((x+width/2)-2*bowRadius, y - 2*bowRadius,                                                                                                                                 
                                   2 * bowRadius, 2 * bowRadius);
	
	Ellipse2D.Double rightBow =
            new Ellipse2D.Double((x+width/2), y - 2*bowRadius,                                                                                                                                 
                                   2 * bowRadius, 2 * bowRadius);

	
       
	
	//add these pieces to the box

	GeneralPath wholeBox = this.get();
        wholeBox.append(horizontalRibbon, false);
        wholeBox.append(verticalRibbon, false);
	wholeBox.append(rightBow, false);
	wholeBox.append(leftBow, false);
    }    
}
