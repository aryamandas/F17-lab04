package edu.ucsb.cs56.drawings.andrewdt23.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A vector drawing of a pepperoni pizza that implements the Shape interface, and so can be drawn, as well as rotated, scaled, etc.
      
   @author Andrew Thompson 
   @version for CS56, F17, UCSB
   
*/
public class PepperoniPizza extends Pizza implements Shape
{
    /**
     * Constructor for objects of class PepperoniPizza
     */
    public PepperoniPizza(double x, double y, double width, double height)
    {
	// construct the basic pizza shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	
	Circle c1 = new Circle(x + .3*width, y + .3*height, 0.1*width);
	Circle c2 = new Circle(x + .5*width, y + .6*height, 0.075*width);
	Circle c3 = new Circle(x + 0.6*width, y + 0.3*height, 0.065*width);

	
	
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(c1, false);
        wholePizza.append(c2, false);
	wholePizza.append(c3, false);
    }    
}
