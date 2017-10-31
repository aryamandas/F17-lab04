package edu.ucsb.cs56.drawings.christina_tao.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

public class ChristmasTree extends Tree implements Shape
{
    /**
     * Constructor for objects of class ChristmasTree
     *
     * @param x x coord of the upper left corner of the Christmas tree
     * @param y y coord of the upper left corner of the Christmas tree
     * @param width width of the Christmas tree
     * @param height height of the Christmas tree
     */

    public ChristmasTree(double x, double y, double width, double height)
    {
		
		// construct a basic tree
    	super(x,y,width,height);

    	final double ORIG_ULX = x + 0.5 * width;
    	final double ORIG_ULY = y;
    	final double STAR_LENGTH = 0.05 * width;
    	final double PENT_LENGTH = 2 * STAR_LENGTH * Math.cos(Math.toRadians(72));

    	// make the left side of the star at the top of the tree
    	GeneralPath starLeft = new GeneralPath();
    	starLeft.moveTo(ORIG_ULX, ORIG_ULY);
    	starLeft.lineTo(ORIG_ULX - (STAR_LENGTH * Math.sin(Math.toRadians(54))), 
    		ORIG_ULY + (STAR_LENGTH * Math.cos(Math.toRadians(54))));
    	starLeft.lineTo(ORIG_ULX - (PENT_LENGTH * Math.cos(Math.toRadians(36))),
    		ORIG_ULY - (PENT_LENGTH * Math.sin(Math.toRadians(36))));
    	starLeft.lineTo(ORIG_ULX - ((STAR_LENGTH + PENT_LENGTH) * Math.cos(Math.toRadians(36))),
    		ORIG_ULY - ((STAR_LENGTH + PENT_LENGTH) * Math.sin(Math.toRadians(36))));
    	starLeft.lineTo(ORIG_ULX - (PENT_LENGTH * (Math.cos(Math.toRadians(36)) - Math.sin(Math.toRadians(18)))),
    		ORIG_ULY - ((STAR_LENGTH + PENT_LENGTH) * Math.sin(Math.toRadians(36))));
    	starLeft.lineTo(ORIG_ULX, ORIG_ULY + (STAR_LENGTH * Math.cos(Math.toRadians(54)))
    		- (((2 * STAR_LENGTH) + PENT_LENGTH) * Math.cos(Math.toRadians(18))));
    	
    	// make the right side of the star at the top of the tree by
    	// horizontally flipping the left side, and translating accordingly
    	Shape starRight = ShapeTransforms.horizontallyFlippedCopyOf(starLeft);
    	starRight = ShapeTransforms.translatedCopyOf(starRight, (2 * STAR_LENGTH) + PENT_LENGTH, 0);

    	// put the whole star together
    	GeneralPath wholeStar = new GeneralPath();
    	wholeStar.append(starLeft, false);
    	wholeStar.append(starRight, false);

    	// make the stand for the Christmas tree
    	GeneralPath stand = new GeneralPath();
    	stand.moveTo(ORIG_ULX - (0.2 * width), ORIG_ULY + height);
    	stand.lineTo(ORIG_ULX + (0.2 * width), ORIG_ULY + height);
    	stand.lineTo(ORIG_ULX + (0.1 * width), ORIG_ULY + (1.1 * height));
		stand.lineTo(ORIG_ULX - (0.1 * width), ORIG_ULY + (1.1 * height));
		stand.lineTo(ORIG_ULX - (0.2 * width), ORIG_ULY + height);

		// make the Christmas tree ornaments
		Ellipse2D.Double ornament1 = 
			new Ellipse2D.Double(ORIG_ULX - (0.025 * width),
				ORIG_ULY + (height / 2), 0.05 * width, 0.05 * height);
		Shape ornament2 = ShapeTransforms.translatedCopyOf(ornament1, 
			0.25 * width, 0.2 * height);
		Shape ornament3 = ShapeTransforms.translatedCopyOf(ornament1,
			-0.3 * width, 0.3 * height);
		Shape ornament4 = ShapeTransforms.translatedCopyOf(ornament1,
			-0.09 * width, 0.16 * height);
		Shape ornament5 = ShapeTransforms.translatedCopyOf(ornament1,
			0.04 * width, 0.33 * height);
		Shape ornament6 = ShapeTransforms.translatedCopyOf(ornament1,
			-0.2 * width, 0.03 * height);
		Shape ornament7 = ShapeTransforms.translatedCopyOf(ornament1,
			0.23 * width, 0.05 * height);
		Shape ornament8 = ShapeTransforms.translatedCopyOf(ornament1,
			-0.11 * width, -0.16 * height);
		Shape ornament9 = ShapeTransforms.translatedCopyOf(ornament1,
			0.15 * width, -0.13 * height);
		Shape ornament10 = ShapeTransforms.translatedCopyOf(ornament1,
			-0.07 * width, -0.3 * height);
		Shape ornament11 = ShapeTransforms.translatedCopyOf(ornament1,
			0.09 * width, -0.34 * height);
		Shape ornament12 = ShapeTransforms.translatedCopyOf(ornament1,
			0.36 * width, 0.36 * height);

		GeneralPath ornaments = new GeneralPath();
		ornaments.append(ornament1, false);
		ornaments.append(ornament2, false);
		ornaments.append(ornament3, false);
		ornaments.append(ornament4, false);
		ornaments.append(ornament5, false);
		ornaments.append(ornament6, false);
		ornaments.append(ornament7, false);
		ornaments.append(ornament8, false);
		ornaments.append(ornament9, false);
		ornaments.append(ornament10, false);
		ornaments.append(ornament11, false);
		ornaments.append(ornament12, false);

		// make the presents
		Rectangle2D.Double box = new Rectangle2D.Double(ORIG_ULX + (0.25 * width),
			ORIG_ULY + height, 0.2 * width, 0.2 * height);

		Rectangle2D.Double ribbonQ1 = new Rectangle2D.Double(ORIG_ULX + (0.25 * width),
			ORIG_ULY + height, 0.08 * width, 0.08 * height);
		Rectangle2D.Double ribbonQ2 = new Rectangle2D.Double(ORIG_ULX + (0.37 * width),
			ORIG_ULY + height, 0.08 * width, 0.08 * height);
		Rectangle2D.Double ribbonQ3 = new Rectangle2D.Double(ORIG_ULX + (0.25 * width),
			ORIG_ULY + (1.12 * height), 0.08 * width, 0.08 * height);
		Rectangle2D.Double ribbonQ4 = new Rectangle2D.Double(ORIG_ULX + (0.37 * width),
			ORIG_ULY + (1.12 * height), 0.08 * width, 0.08 * height);
		Ellipse2D.Double bow1 = new Ellipse2D.Double(ORIG_ULX + (0.30 * width),
			ORIG_ULY + (0.99 * height), 0.1 * width, 0.01 * height);
		Shape bow2 = ShapeTransforms.rotatedCopyOf(bow1, Math.toRadians(45));
		Shape bow3 = ShapeTransforms.rotatedCopyOf(bow2, Math.toRadians(45));
		Shape bow4 = ShapeTransforms.rotatedCopyOf(bow3, Math.toRadians(45));

		GeneralPath ribbon = new GeneralPath();
		ribbon.append(ribbonQ1, false);
		ribbon.append(ribbonQ2, false);
		ribbon.append(ribbonQ3, false);
		ribbon.append(ribbonQ4, false);
		ribbon.append(bow1, false);
		ribbon.append(bow2, false);
		ribbon.append(bow3, false);
		ribbon.append(bow4, false);

		GeneralPath present1 = new GeneralPath();
		present1.append(box, false);
		present1.append(ribbon, false);
		Shape present2 = ShapeTransforms.scaledCopyOfLL(present1,1.1,1.5);
		present2 = ShapeTransforms.translatedCopyOf(present2, 0.3 * width, 0.1 * height);
		Shape present3 = ShapeTransforms.scaledCopyOfLL(present1,2,1.2);
		present3 = ShapeTransforms.translatedCopyOf(present3, -0.9 * width, 0.07 * height);

		GeneralPath presents = new GeneralPath();
		presents.append(present1, false);
		presents.append(present2, false);
		presents.append(present3, false);


    	// add the star, stand, ornaments, and presents to the tree
    	GeneralPath wholeChristmasTree = this.get();
    	wholeChristmasTree.append(wholeStar, false);
    	wholeChristmasTree.append(stand, false);
    	wholeChristmasTree.append(ornaments, false);
    	wholeChristmasTree.append(presents, false);
		
    }    
}
