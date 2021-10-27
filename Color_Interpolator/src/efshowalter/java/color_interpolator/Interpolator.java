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
		// TODO implement this
		return new Color(0, 0, 0, 0);
	}
	
	// Interpolate given two colors and the percentage of the first color
	public Color interpolateUnevenly(Color first, Color second, float percentFirst) {
		// TODO implement this
		return new Color(0, 0, 0, 0);
	}
}
