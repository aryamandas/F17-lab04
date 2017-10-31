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

        Shape t2 = ShapeTransforms.scaledCopyOf(t1,2,3);
        t2 = ShapeTransforms.translatedCopyOf(t2,330,25);
        g2.setColor(Color.RED);
        g2.draw(t2);

        Shape t3 = ShapeTransforms.scaledCopyOf(t1,3,2.5);
        t3 = ShapeTransforms.translatedCopyOf(t3, 20, 100);
        t3 = ShapeTransforms.rotatedCopyOf(t3, -Math.PI/3);
        g2.setColor(Color.GREEN);
        g2.draw(t3);

        g2.setColor(Color.BLACK);
        g2.drawString("A few trees by Christina Tao", 10,20);

    }
    
    public static void drawPicture2(Graphics2D g2) {

	   ChristmasTree c1 = new ChristmasTree(50,50,150,150);
       g2.setColor(Color.BLACK);
       g2.draw(c1);

       Shape c2 = ShapeTransforms.scaledCopyOf(c1,0.6,0.75);
       c2 = ShapeTransforms.translatedCopyOf(c2,75, 220);
       g2.setColor(Color.RED);
       g2.draw(c2);

       Shape c3 = ShapeTransforms.scaledCopyOf(c1,1.7,1.4);
       c3 = ShapeTransforms.translatedCopyOf(c3, 275,-10);
       c3 = ShapeTransforms.rotatedCopyOf(c3, Math.PI / 3);
       g2.setColor(Color.GREEN);
       g2.draw(c3);

       g2.setColor(Color.BLACK);
       g2.drawString("A few Christmas trees by Christina Tao", 10,20);

    }
  
    public static void drawPicture3(Graphics2D g2) {

	   Tree t1 = new Tree(50,50,50,50);
       g2.setColor(Color.BLACK);
       g2.draw(t1);

       Shape t2 = ShapeTransforms.scaledCopyOf(t1,2.2,2.7);
       t2 = ShapeTransforms.translatedCopyOf(t2,350,20);
       t2 = ShapeTransforms.rotatedCopyOf(t2, Math.PI);
       g2.setColor(Color.RED);
       g2.draw(t2);

       Shape t3 = ShapeTransforms.scaledCopyOf(t1,3.2,1.8);
       t3 = ShapeTransforms.translatedCopyOf(t3,100,-10);
       t3 = ShapeTransforms.rotatedCopyOf(t3, Math.toRadians(290));
       g2.setColor(Color.GREEN);
       g2.draw(t3);

       ChristmasTree c1 = new ChristmasTree(300,150,140,180);
       g2.setColor(Color.BLACK);
       g2.draw(c1);

       Shape c2 = ShapeTransforms.scaledCopyOf(c1,1.9,1.3);
       c2 = ShapeTransforms.translatedCopyOf(c2,-300,-20);
       c2 = ShapeTransforms.rotatedCopyOf(c2, Math.toRadians(210));
       g2.setColor(Color.RED);
       g2.draw(c2);

       Shape c3 = ShapeTransforms.scaledCopyOf(c1,0.7,0.9);
       c3 = ShapeTransforms.translatedCopyOf(c3,150,70);
       c3 = ShapeTransforms.rotatedCopyOf(c3, Math.PI / 7);
       g2.setColor(Color.GREEN);
       g2.draw(c3);

       g2.setColor(Color.BLACK);
       g2.drawString("A few regular trees and a few Christmas trees by Christina Tao", 10,20);

    }       
}
