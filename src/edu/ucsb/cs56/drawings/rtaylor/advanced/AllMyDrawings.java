package edu.ucsb.cs56.drawings.rtaylor.advanced;

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
 * @author Reed Taylor
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few remotes
     */

    public static void drawPicture1(Graphics2D g2) {

	Remote r1 = new Remote(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(r1);

	// Make a black remote that's half the size,
	// and moved over 2000 pixels in x direction

	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,200,0);
	g2.setColor(Color.BLACK); g2.draw(r2);

	// Here's a remote that's 4x as big (2x the original)
	// and moved over 300 more pixels to the top.
  Shape r3 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r3 = ShapeTransforms.translatedCopyOf(r3,0,-150);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x0722A7));
	g2.draw(r3);


	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(g2.getStroke());
	g2.setColor(Color.BLACK);
	g2.drawString("A few remotes by Reed Taylor", 20,20);
    }


    /** Draw a picture with a few more random remotes
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some remotes.

	Remote large = new Remote(100,50,150,335);
	Remote small = new Remote(20,50,40,60);
	Remote tallSkinny = new Remote(20,150,40,200);
	Remote shortFat = new Remote(300,250,60,40);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
  Shape r1 = ShapeTransforms.scaledCopyOfLL(small,.5,.5);
	r1 = ShapeTransforms.translatedCopyOf(r1,0,-150);

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(r1);

	// Rotate the second house 45 degrees around its center.
	Shape r2 = ShapeTransforms.rotatedCopyOf(small, Math.PI/4.0);
  r2 = ShapeTransforms.translatedCopyOf(r2,300,0);

	g2.draw(r2);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few more random remotes by Reed Taylor", 20,20);
    }

    /** Draw a different picture with a tilted remotes
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("Some Remotes tilted by Reed Taylor", 20,20);


	// Draw some remotes.

  Remote r1 = new Remote(100,50,60,100);
  g2.setColor(Color.RED);     g2.draw(r1);

  Shape r2 = ShapeTransforms.rotatedCopyOf(r1, Math.PI/4.0);
  r2 = ShapeTransforms.translatedCopyOf(r2,100,0);
  g2.draw(r2);

  Shape r3 = ShapeTransforms.rotatedCopyOf(r2, Math.PI/4.0);
  r3 = ShapeTransforms.translatedCopyOf(r3,0,100);
  g2.draw(r3);

  Shape r4 = ShapeTransforms.rotatedCopyOf(r3, -Math.PI/4.0);
  r4 = ShapeTransforms.translatedCopyOf(r4,-150,50);
  g2.draw(r4);

    }
}
