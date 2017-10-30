package edu.ucsb.cs56.drawings.christina_tao.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Christina Tao 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {

        Tree t1 = new Tree(50,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(t1);

        Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,2,3);
        t2 = ShapeTransforms.translatedCopyOf(t2,350,200);
        g2.setColor(Color.RED);
        g2.draw(t2);

        Shape t3 = ShapeTransforms.scaledCopyOfLL(t1,3,2.5);
        t3 = ShapeTransforms.translatedCopyOf(t3, 20, 220);
        t3 = ShapeTransforms.rotatedCopyOf(t3, -Math.PI/3);
        g2.setColor(Color.GREEN);
        g2.draw(t3);

        g2.setColor(Color.BLACK);
        g2.drawString("A few trees by Christina Tao", 10,20);

    }
    
    public static void drawPicture2(Graphics2D g2) {

	

    }
  
    public static void drawPicture3(Graphics2D g2) {

	

    }       
}
