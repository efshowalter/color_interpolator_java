package efshowalter.java.color_interpolator;

import java.awt.Color;

/** 
 * The interpolator class is a container for the methods used to generate new colors.
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
	public Color interpolateUnevenly(Color first, Color second, float percentFirst) {
		float r = first.getRed() * percentFirst + second.getRed() * (1 - percentFirst);
		float g = first.getGreen() * percentFirst + second.getGreen() * (1 - percentFirst);
		float b = first.getBlue() * percentFirst + second.getBlue() * (1 - percentFirst);
		float a = first.getAlpha() * percentFirst + second.getAlpha() * (1 - percentFirst);
		
		return new Color(Math.round(r), Math.round(g), Math.round(b), Math.round(a));
	}
}
