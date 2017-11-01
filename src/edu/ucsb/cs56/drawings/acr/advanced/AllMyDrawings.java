package edu.ucsb.cs56.drawings.acr.advanced;

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
 * @author Arielle Robles 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few boxes 
     */
    
    public static void drawPicture1(Graphics2D g2) {

	//working
	Box b1 = new Box(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black box that's half the size, 
	// and moved over 150 pixels in x direction
	//working
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	//works
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two Boxes with Bows i.e. GiftBoxes
	
	GiftBox gb1 = new GiftBox(50,350,40,75);
	GiftBox gb2 = new GiftBox(200,350,200,100);

	//works without bows
	g2.draw(gb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(gb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Gift Boxes by Arielle Robles", 20,20);
    }
    
	
    /** Draw a picture with a few Gift Boxes
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	GiftBox large = new GiftBox(100,50,225,150);
	GiftBox smallGB = new GiftBox(20,50,40,30);
	GiftBox tallGB = new GiftBox(20,150,20,40);
	GiftBox shortGB = new GiftBox(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallGB);
	g2.setColor(Color.BLUE);    g2.draw(tallGB);
	g2.setColor(Color.MAGENTA); g2.draw(shortGB);
	
	Box b1 = new Box(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black box that's half the size, 
	// and moved over 150 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a box that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two Gift Boxes
	
	GiftBox gb1 = new GiftBox(50,350,40,75);
	GiftBox gb2 = new GiftBox(200,350,200,100);
	
	g2.draw(gb1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape gb3 = ShapeTransforms.rotatedCopyOf(gb2, Math.PI/4.0);
	
	g2.draw(gb3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Gift Boxes by Arielle Robles", 20,20);
    }
    
    /** Draw a different picture with a few gift boxes
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Gift Boxes by Arielle Robles", 20,20);
	
	
	// Draw some coffee cups.
	
	GiftBox largeGB = new GiftBox(100,50,225,150);
	GiftBox smallGB = new GiftBox(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(largeGB);
	g2.setColor(Color.GREEN);   g2.draw(smallGB);
	
    }       
}
