package edu.ucsb.cs56.drawings.labasan.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
/**
   A human with a bow tie
      
   @author Kai Labasan
   @version for CS56, F17, UCSB
   
*/
public class HumanWithBow extends Human implements Shape
{
	// constructor for the object class HumanWithBow
    public HumanWithBow(double x, double y, double weight, double height)
    {
	// construct the basic house shell
	super(x,y,weight,height);

	// get the GeneralPath that we are going to append stuff to	
	GeneralPath gp = this.get();
	
	double lengthOfKnot = 0.15 * height * 0.20;
	double heightOfKnot = 0.9 * lengthOfKnot;
	double lengthOfBow = 0.25 * height * 0.20;
	double YcoordOfKnot = y - 0.7 * height * 0.05; //top Y coordinate
	double XcoordOfKnot = x - 0.5 * lengthOfKnot; //left X coordinate
	double YcoordOfBow = YcoordOfKnot + 0.5 * heightOfKnot; //top Y coordinate
	double TYcoordOfBow = YcoordOfKnot - 0.5 * heightOfKnot; //top Y coordinate
	double BYcoordOfBow = YcoordOfKnot + 1.5 * heightOfKnot; //bottom left Y coordinate
	double LXcoordOfBow = XcoordOfKnot - lengthOfBow; //left X coordinate
	double RXcoordOfBow = XcoordOfKnot + lengthOfKnot + lengthOfBow; //right X coordinate

	// Make the knot of the bow tie
	Rectangle2D.Double bowKnot = new Rectangle2D.Double (XcoordOfKnot, YcoordOfKnot,
		lengthOfKnot, heightOfKnot);

	// Make the left half of the bow
	Line2D.Double leftKnotpt1 = new Line2D.Double (XcoordOfKnot, YcoordOfBow,
		LXcoordOfBow, TYcoordOfBow);
	Line2D.Double leftKnotpt2 = new Line2D.Double (LXcoordOfBow, TYcoordOfBow,
		LXcoordOfBow, BYcoordOfBow);
	Line2D.Double leftKnotpt3 = new Line2D.Double(LXcoordOfBow, BYcoordOfBow,
		XcoordOfKnot, YcoordOfBow);

	// Make the right half of the bow
	Line2D.Double rightKnotpt1 = new Line2D.Double (XcoordOfKnot + lengthOfKnot, YcoordOfBow,
		RXcoordOfBow, TYcoordOfBow);
	Line2D.Double rightKnotpt2 = new Line2D.Double (RXcoordOfBow, TYcoordOfBow,
		RXcoordOfBow, BYcoordOfBow);
	Line2D.Double rightKnotpt3 = new Line2D.Double (RXcoordOfBow, BYcoordOfBow,
		XcoordOfKnot + lengthOfKnot, YcoordOfBow);	

	// Add the bow tie to the human
	GeneralPath FittedHuman = this.get();
	FittedHuman.append(bowKnot, false);
	FittedHuman.append(leftKnotpt1, false);
	FittedHuman.append(leftKnotpt2, false);
	FittedHuman.append(leftKnotpt3, false);
	FittedHuman.append(rightKnotpt1, false);
	FittedHuman.append(rightKnotpt2, false);
	FittedHuman.append(rightKnotpt3, false);
    }    
}
