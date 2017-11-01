package edu.ucsb.cs56.drawings.dstoyanova.advanced;

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
 * @author Deni Stoyanova
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw lots of Mickey Heads
     *	@param g2 Graphics2D object 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	//simple head
	MickeyMouseHead h1 = new MickeyMouseHead(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);

	Shape h3 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h3 = ShapeTransforms.translatedCopyOf(h3,300,-10);
	g2.setColor(Color.RED); g2.draw(h3);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h3); 
	
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few heads by Deni", 20,20);
    }
    
    
    /** Draw a mickey heads with a face, some rotated/scaled/moved
     *  @param g2 Graphics2D object
     */
    public static void drawPicture2(Graphics2D g2) {
		
		MickeyMouseHeadWithFace h1 = new MickeyMouseHeadWithFace(100,250,50);
		g2.setColor(Color.CYAN); g2.draw(h1);
		
		Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
		g2.setColor(Color.BLACK); g2.draw(h2);

		Shape h3 = ShapeTransforms.scaledCopyOfLL(h1,0.2,0.5);
		h3 = ShapeTransforms.translatedCopyOf(h3,300,-10);
		g2.setColor(Color.RED); g2.draw(h3);


		Shape h4 = ShapeTransforms.rotatedCopyOf(h3, Math.PI/4.0);
		h4 = ShapeTransforms.translatedCopyOf(h4,300,-10);
		g2.draw(h4); 

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		Stroke orig=g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7)); 
		g2.draw(h3); 
		
		g2.setColor(Color.BLACK); 
		g2.drawString("A few heads with a face by Deni", 20,20);
    }
    
    /** Draw large and small heads
     *  @param g2 Graphics2D object
     */
    
    public static void drawPicture3(Graphics2D g2) {
		
		// label the drawing
		
		g2.drawString("A bunch of HEADS by Deni", 20,20);
		
		MickeyMouseHeadWithFace large = new MickeyMouseHeadWithFace(100,50,225);
		MickeyMouseHead small = new MickeyMouseHead(20,50,40);
		
		g2.setColor(Color.RED);     g2.draw(large);
		g2.setColor(Color.GREEN);   g2.draw(small);
		
    }       

}
