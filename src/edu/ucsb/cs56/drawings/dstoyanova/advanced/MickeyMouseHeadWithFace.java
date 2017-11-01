package edu.ucsb.cs56.drawings.dstoyanova.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   A Mickey Mouse Head With a Face
      
   @author Deni Stoyanova
   @version for CS56, F17, UCSB
   
*/
public class MickeyMouseHeadWithFace extends MickeyMouseHead implements Shape
{
    /**
     * Constructor for objects of class MickeyMouseHeadWithFace
     */
    public MickeyMouseHeadWithFace(double x, double y, double radius)
    {
    		// construct the MickeyMouseHead
    		super(x,y,radius);
    		
    		//find eye coordinates and width
    		double rightEyeX = x + radius * 3/2 - radius/10;
    		double leftEyeX = x + radius/2 - radius/10;
    		double rightEyeY = y + radius - radius/10;
    		double eyeWidth = radius/5;

        //find mouth coordanites
    		double x1Mouth = x + radius/2;
    		double x2Mouth = x1Mouth + radius/2;
    		double y1Mouth = y + 6*radius/4;
    		double y2Mouth = y + 13*radius/8;

    		Ellipse2D.Double leftEye = 
	          new Ellipse2D.Double(leftEyeX, rightEyeY, eyeWidth, eyeWidth);
        Ellipse2D.Double rightEye = 
          new Ellipse2D.Double(rightEyeX, rightEyeY, eyeWidth, eyeWidth);
        Line2D.Double mouth1 = 
          new Line2D.Double(x1Mouth, y1Mouth, x2Mouth, y2Mouth); 
        Line2D.Double mouth2 = 
          new Line2D.Double(x2Mouth, y2Mouth, x1Mouth + radius, y1Mouth); 

        GeneralPath wholeHead = this.get();
        wholeHead.append(leftEye, false);
        wholeHead.append(rightEye, false);
        wholeHead.append(mouth1, false);
        wholeHead.append(mouth2, false);
    }    
}
