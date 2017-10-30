package edu.ucsb.cs56.drawings.christina_tao.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Tree extends GeneralPathWrapper implements Shape {

	public Tree(double x, double y, double width, double height) {

		final double ORIG_ULX = x + 0.5 * width;
		final double ORIG_ULY = y;

		GeneralPath leftSide = new GeneralPath();

		leftSide.moveTo(ORIG_ULX, ORIG_ULY);
		leftSide.lineTo(ORIG_ULX - 0.25 * width, ORIG_ULY + 0.31 * height);
		leftSide.lineTo(ORIG_ULX - 0.125 * width, ORIG_ULY + 0.31 * height);
		leftSide.lineTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.62 * height);
		leftSide.lineTo(ORIG_ULX - 0.25 * width, ORIG_ULY + 0.62 * height);
		leftSide.lineTo(ORIG_ULX - 0.5 * width, ORIG_ULY + 0.93 * height);
		leftSide.lineTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.93 * height);

		Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
		rightSide = ShapeTransforms.translatedCopyOf(rightSide, width, 0);

		GeneralPath bottom = new GeneralPath();

		bottom.moveTo(ORIG_ULX - 0.375 * width, ORIG_ULY + 0.93 * height);
		bottom.lineTo(ORIG_ULX + 0.375 * width, ORIG_ULY + 0.93 * height);

		Rectangle2D.Double trunk = 
		new Rectangle2D.Double(ORIG_ULX - 0.05 * width, ORIG_ULY + 0.93 * height,
								0.1 * width, 0.07 * height);

		GeneralPath wholeTree = this.get();
		wholeTree.append(leftSide, false);
		wholeTree.append(rightSide, false);
		wholeTree.append(bottom, false);
		wholeTree.append(trunk, false);

	}

}