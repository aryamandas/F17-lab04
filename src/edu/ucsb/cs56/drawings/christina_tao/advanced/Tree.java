package edu.ucsb.cs56.drawings.christina_tao.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A vector drawing of a tree that implements
 * the Shape interface, and so can be drawn, as well as
 * rotated, scaled, etc.
 *
 * @author Christina Tao
 * @version for CS56, F17, UCSB
 */

public class Tree extends GeneralPathWrapper implements Shape {

	/**
	 * Constructor for objects of the class Tree
	 *
	 * @param x x coord of lower left corner of tree
	 * @param y y coord of lower left corner of tree
	 * @param width width of the tree
	 * @param height height of the tree
	 */

	public Tree(double x, double y, double width, double height) {

		final double ORIG_ULX = x + 0.5 * width;
		final double ORIG_ULY = y;

		// make the left side of the tree
		GeneralPath leftSide = new GeneralPath();

		leftSide.moveTo(ORIG_ULX, ORIG_ULY);
		leftSide.lineTo(ORIG_ULX - 0.25 * width, ORIG_ULY + 0.31 * height);
		leftSide.lineTo(ORIG_ULX - 0.125 * width, ORIG_ULY + 0.31 * height);
		leftSide.lineTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.62 * height);
		leftSide.lineTo(ORIG_ULX - 0.25 * width, ORIG_ULY + 0.62 * height);
		leftSide.lineTo(ORIG_ULX - 0.5 * width, ORIG_ULY + 0.93 * height);
		leftSide.lineTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.93 * height);

		// make the right side of the tree by horizontally
		// flipping the left side, and translating accordingly
		Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
		rightSide = ShapeTransforms.translatedCopyOf(rightSide, width, 0);

		// make the bottom of the tree
		GeneralPath bottom = new GeneralPath();

		bottom.moveTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.93 * height);
		bottom.lineTo(ORIG_ULX + 0.375 * width, ORIG_ULY + 0.93 * height);

		// make the tree trunk
		Rectangle2D.Double trunk = 
		new Rectangle2D.Double(ORIG_ULX - 0.05 * width, ORIG_ULY + 0.93 * height,
			0.1 * width, 0.07 * height);

		// put the whole tree together
		GeneralPath wholeTree = this.get();
		wholeTree.append(leftSide, false);
		wholeTree.append(rightSide, false);
		wholeTree.append(bottom, false);
		wholeTree.append(trunk, false);

	}

}