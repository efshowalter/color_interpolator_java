package efshowalter.java.color_interpolator;

import java.awt.Color;

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