package edu.ucsb.cs56.drawings.rtaylor.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A Remote

   @author Reed Taylor
   @version for CS56, W16, UCSB

*/
public class Remote extends Rectangle implements Shape
{
    /**
     * Constructor for objects of class Remote
     */
    public Remote(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();


	double x1 = x + 0.20 * width; //left column
  double x2 = x + width - 0.45 * width; //right column
	double y1 = y + height - 0.40 * height; //bottom row
	double y2 = y + 0.20 * height; //top row

	Ellipse2D.Double button1 =
	    new Ellipse2D.Double(x1, y1, .25 * width, .25 * width);
	Ellipse2D.Double button2 =
	    new Ellipse2D.Double(x1, y2, .25 * width, .25 * width);
	Ellipse2D.Double button3 =
	    new Ellipse2D.Double(x2, y1, .25 * width, .25 * width);
  Ellipse2D.Double button4 =
	    new Ellipse2D.Double(x2, y2, .25 * width, .25 * width);

	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath myRemote = this.get();
        myRemote.append(button1, false);
        myRemote.append(button2, false);
        myRemote.append(button3, false);
        myRemote.append(button4, false);
    }
}
