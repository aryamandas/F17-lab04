package edu.ucsb.cs56.drawings.rjnares.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Rock (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Roberto J. Nares 
   @version for CS56, F17, UCSB
   
*/
public class Rock extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Rock
     */
    public Rock(double x, double y, double width, double height) {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* rock
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 400.0;
	
	// top and bottom of rock
	GeneralPath topAndBottom = new GeneralPath();
	topAndBottom.moveTo(200,100);
	topAndBottom.lineTo(400,100); // top of rock
	topAndBottom.moveTo(200,400);
	topAndBottom.lineTo(400,400); // bottom of rock
	
	// left bottom side of rock
	GeneralPath leftBottomSide = new GeneralPath();
        leftBottomSide.moveTo(200,400);
        leftBottomSide.lineTo(170,380);
        leftBottomSide.lineTo(145,355);
        leftBottomSide.lineTo(125,325);
	leftBottomSide.lineTo(110,290);
        leftBottomSide.lineTo(100,250);
        
	// left upper side of rock
	Shape leftUpperSide = ShapeTransforms.verticallyFlippedCopyOf(leftBottomSide);
	
	// right bottom side of rock
        Shape rightBottomSide = ShapeTransforms.horizontallyFlippedCopyOf(leftBottomSide);
        rightBottomSide = ShapeTransforms.translatedCopyOf(rightBottomSide, 400.0, 0.0);
	
	// right upper side of rock
	Shape rightUpperSide = ShapeTransforms.verticallyFlippedCopyOf(rightBottomSide);
	
        // now we put the whole thing together ino a single path.
	GeneralPath wholeRock = new GeneralPath ();
	wholeRock.append(topAndBottom, false);
        wholeRock.append(leftBottomSide, false);
        wholeRock.append(rightBottomSide, false);
	wholeRock.append(leftUpperSide, false);
	wholeRock.append(rightUpperSide, false);
	
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
	Shape s = ShapeTransforms.translatedCopyOf(wholeRock, -ORIG_ULX + x, -ORIG_ULY + y);
	
	// scale to correct height and width
	s =  ShapeTransforms.scaledCopyOf(s, width/ORIG_WIDTH, height/ORIG_HEIGHT);
	
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        this.set(new GeneralPath(s));
    }
}
