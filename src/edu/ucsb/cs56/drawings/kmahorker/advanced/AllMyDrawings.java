package edu.ucsb.cs56.drawings.kmahorker.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** 
    Draw a picture with a few writing utensils and Pens
     */
    
    public static void drawPicture1(Graphics2D g2) {


	// WritingUtensil utensil1 = new WritingUtensil(25,25, 40, 300);
	// WritingUtensil utensil2 = new WritingUtensil(120, 25, 10, 100);
	
	// g2.setColor(Color.RED);
	// g2.draw(utensil1);
	// g2.setColor(Color.GREEN);
	// g2.draw(utensil2);



    	
	
	WritingUtensil wu1 = new WritingUtensil(100,250,30,100);
	g2.setColor(Color.CYAN); g2.draw(wu1);
	
	// Make a black Writing Utensil that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape wu2 = ShapeTransforms.scaledCopyOfLL(wu1,0.5,0.5);
	wu2 = ShapeTransforms.translatedCopyOf(wu2,150,0);
	g2.setColor(Color.BLACK); g2.draw(wu2);
	
	// Here's a Writing Utensil that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	wu2 = ShapeTransforms.scaledCopyOfLL(wu2,4,4);
	wu2 = ShapeTransforms.translatedCopyOf(wu2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(wu2); 
	
	// Draw two Pens
	
	Pen pen1 = new Pen(50,350,40,150);
	Pen pen2 = new Pen(200,350,100,350);
	
	g2.draw(pen1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pen2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Writing Utensils by Kaushik Mahorker", 20,20);
    }
    
    
    /** 
    Draw a picture with a few Writing Utensils and Pens
     */
    public static void drawPicture2(Graphics2D g2) {


	
	// Draw some coffee cups.
	
	// Pen large = new Pen(100,50,225,150);
	// Pen smallCC = new Pen(20,50,40,30);
	// Pen tallSkinny = new CoffeeCup(20,150,20,40);
	// Pen shortFat = new CoffeeCup(20,250,40,20);
	
	// g2.setColor(Color.RED);     g2.draw(large);
	// g2.setColor(Color.GREEN);   g2.draw(smallCC);
	// g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	// g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	WritingUtensil h1 = new WritingUtensil(100,250,30,100);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black Writing Utensil that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a Writing Utensil that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	Pen pen1 = new Pen(50,350,40,150);
	Pen pen2 = new Pen(200,350,100,350);
	
	g2.draw(pen1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape pen3 = ShapeTransforms.rotatedCopyOf(pen2, Math.PI/4.0);
	
	g2.draw(pen3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of WritingUtensils and Pens by Kaushik Mahorker", 20,20);
    }
    
    /** 
    Draw a different picture with a few Pens and Writing Utensils
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Pens by Kaushik Mahorker", 20,20);
	
	
	// Draw some Pens.

	WritingUtensil utensil1 = new WritingUtensil(100,300, 40, 300);
	WritingUtensil utensil2 = new WritingUtensil(200, 300, 10, 100);
	
	g2.setColor(Color.RED);
	g2.draw(utensil1);
	g2.setColor(Color.GREEN);
	g2.draw(utensil2);

	Pen large = new Pen(100,50,225,150);
	Pen smallCC = new Pen(20,50,40,30);
	Pen tallSkinny = new Pen(20,150,20,40);
	Pen shortFat = new Pen(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	// CoffeeCup large = new CoffeeCup(100,50,225,150);
	// CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	// g2.setColor(Color.RED);     g2.draw(large);
	// g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }
}
