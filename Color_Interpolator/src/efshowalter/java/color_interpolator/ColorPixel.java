package efshowalter.java.color_interpolator;

import java.awt.Color;

/**
 * A simple class that serves as a container for a color and a pixel coordinate.
 * 
 * @author efshowalter
 */

public class ColorPixel {
	private Color color;
	private int x, y;
	
	public ColorPixel(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSameLocationAs(ColorPixel color) {
		if (this.x == color.getX() && this.y == color.getY()) return true;
		return false;
	}
}
