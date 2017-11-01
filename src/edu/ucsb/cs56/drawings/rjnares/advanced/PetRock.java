package edu.ucsb.cs56.drawings.rjnares.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A PetRock
      
   @author Roberto J. Nares
   @version for CS56, F17, UCSB
   
*/
public class PetRock extends Rock implements Shape
{
    /**
     * Constructor for objects of class PetRock
     */
    public PetRock(double x, double y, double width, double height)
    {
	// construct the basic rock shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// eyes of pet rock
	double eyeRadius = width*0.1;
	double eyeDiameter = 2*eyeRadius;
	double eyeOneX = x+(width/4.0);
	double eyeOneY = y+(height/4.0);
	double eyeTwoX = (x+width)-(width/4.0)-eyeDiameter;
	double eyeTwoY = eyeOneY;
	
	Ellipse2D.Double eye1 = new Ellipse2D.Double(eyeOneX,eyeOneY,eyeDiameter,eyeDiameter);
	Ellipse2D.Double eye2 = new Ellipse2D.Double(eyeTwoX,eyeTwoY,eyeDiameter,eyeDiameter);
	
	Ellipse2D.Double pupil1 = new Ellipse2D.Double(eyeOneX+(eyeRadius/2.0),eyeOneY+(eyeRadius/2.0),eyeRadius/2.0,eyeRadius/2.0);
	Ellipse2D.Double pupil2 = new Ellipse2D.Double(eyeTwoX+(eyeRadius/2.0),eyeTwoY+(eyeRadius/2.0),eyeRadius/2.0,eyeRadius/2.0);

	// mouth of pet rock
	double mouthLength = width/2.0;
	double mouthX = x+(mouthLength/2.0);
	double mouthY = y+(height*0.75);
	GeneralPath drawMouth = new GeneralPath();
	drawMouth.moveTo(mouthX,mouthY);
	drawMouth.lineTo(mouthX+mouthLength,mouthY);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholePetRock = this.get();
        wholePetRock.append(eye1, false);
        wholePetRock.append(eye2, false);
        wholePetRock.append(pupil1, false);
	wholePetRock.append(pupil2, false);
	wholePetRock.append(drawMouth, false);
    }    
}
