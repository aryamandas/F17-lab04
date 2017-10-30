package edu.ucsb.cs56.drawings.labasan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a human that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Kai Labasan 
   @version for CS56, F17, UCSB
   
*/
public class Human extends GeneralPathWrapper implements Shape{
    /**
       Constructor
       
       @param x x coord of center of body
       @param y y coord of upper left corner of body
       @param weight weight of the human
       @param height of the human 
    */
    public Human(double x, double y, double weight, double height)
    {
        double neckLength = height * 0.05;
      	double sizeOfHead = height * 0.20;
      	double legLength = height * 0.25;
      	double bodyLength = height * 0.5;
        double armLength = 0.3 * height;
      	double legsYcoord = 1.732 * legLength + y + bodyLength; //bottom Y coordinate
        double leftLegXcoord = x - 0.5 * legLength - 0.2 * weight; //left X coordinate
        double rightLegXcoord = x + 0.5 * legLength + 0.2 * weight; //right X coordinate
        double armsYcoord = y + bodyLength * 0.25;
        double leftArmXcoord = x - 0.5 * weight; //left X coordinate
        double rightArmXcoord = x + 0.5 * weight; //right X coordinate
        double headYcoord = y - sizeOfHead - neckLength; //top Y coordinate
        double neckYcoord = y - neckLength; //top Y coordinate

        // Make the human's body, arms, head, eyes, mouth, and legs
      	Rectangle2D.Double body =
      	    new Rectangle2D.Double(x - 0.5 * weight, y,
      		weight, bodyLength);
      	Line2D.Double leftArm =
      	    new Line2D.Double(leftArmXcoord, armsYcoord,
          leftArmXcoord - armLength, armsYcoord);
        Line2D.Double rightArm = 
            new Line2D.Double (rightArmXcoord, armsYcoord,
          rightArmXcoord + armLength, armsYcoord);
        Line2D.Double neck = 
            new Line2D.Double(x, y,
          x, y - neckLength);
        Line2D.Double leftLeg =
            new Line2D.Double(x - 0.1 * weight , y + bodyLength,
              leftLegXcoord, legsYcoord);
        Line2D.Double rightLeg =
            new Line2D.Double(x + 0.1 * weight , y + bodyLength,
              rightLegXcoord, legsYcoord);
        Line2D.Double mouth =
            new Line2D.Double(x - 0.2 * sizeOfHead, y - neckLength - 0.3 * sizeOfHead,
              x + 0.2 * sizeOfHead, y - neckLength - 0.3 * sizeOfHead);
        Ellipse2D.Double leftEye =
            new Ellipse2D.Double(x - 0.25 * sizeOfHead, y - neckLength - 0.65 * sizeOfHead,
              0.15 * sizeOfHead, 0.1 * sizeOfHead);
        Ellipse2D.Double rightEye =
            new Ellipse2D.Double(x + 0.1 * sizeOfHead, y - neckLength - 0.65 * sizeOfHead,
              0.15 * sizeOfHead, 0.1 * sizeOfHead);        
        Ellipse2D.Double head =
            new Ellipse2D.Double(x - 0.5* sizeOfHead, y - neckLength - sizeOfHead,
          sizeOfHead, sizeOfHead);

        // put the whole human together
        GeneralPath grownHuman = this.get();
        grownHuman.append(body, false);
        grownHuman.append(head, false);
        grownHuman.append(leftArm, false);
        grownHuman.append(rightArm, false);
        grownHuman.append(neck, false);
        grownHuman.append(leftLeg, false);
        grownHuman.append(rightLeg, false);
        grownHuman.append(rightEye, false);
        grownHuman.append(leftEye, false);
        grownHuman.append(mouth, false);
    }
}
