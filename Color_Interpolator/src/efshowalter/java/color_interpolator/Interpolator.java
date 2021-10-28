package efshowalter.java.color_interpolator;

import java.awt.Color;

/** 
 * A container for the methods used to generate new colors.
 * It has no attributes of its own, only methods that take in two color objects and 
 * return the appropriate interpolated value. It supports even interpolation (50/50
 * of each color) and uneven interpolation, which takes in a third value indicating the
 * percentage of the first color to be used. 
 * 
 * @author efshowalter 
 * 
 * **/

public class Interpolator {
	Interpolator() {
		return;
	}
	
	// Interpolate the midpoint between two colors.
	public Color interpolateEvenly(Color first, Color second) {
		int r = Math.floorDiv(first.getRed() + second.getRed(), 2);
		int g = Math.floorDiv(first.getGreen() + second.getGreen(), 2);
		int b = Math.floorDiv(first.getBlue() + second.getBlue(), 2);
		int a = Math.floorDiv(first.getAlpha() + second.getAlpha(), 2);
		
		return new Color(r, g, b, a);
	}
	
	// Interpolate given two colors and the percentage of the first color
	public Color interpolateUnevenly(Color first, Color second, int amtFirst, int max) {
		int r1 = first.getRed() * (max - amtFirst);
		int r2 = second.getRed() * (amtFirst);
		int r = Math.round(Math.floorDiv(r1 + r2, max));
		
		int g1 = first.getGreen() * (max - amtFirst);
		int g2 = second.getGreen() * (amtFirst);
		int g = Math.round(Math.floorDiv(g1 + g2, max));
		
		int b1 = first.getBlue() * (max - amtFirst);
		int b2 = second.getBlue() * (amtFirst);
		int b = Math.round(Math.floorDiv(b1 + b2, max));
		
		int a1 = first.getAlpha() * (max - amtFirst);
		int a2 = second.getAlpha() * (amtFirst);
		int a = Math.round(Math.floorDiv(a1 + a2, max));
		
		return new Color(r, g, b, a);
	}
}
