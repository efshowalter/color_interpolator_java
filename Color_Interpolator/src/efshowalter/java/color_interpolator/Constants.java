package efshowalter.java.color_interpolator;

import java.awt.Color;

public final class Constants {
	
	private Constants() {}
	
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	
	public static final ColorPixel UL_START = new ColorPixel(Color.RED, 0, 0);
	public static final ColorPixel UR_START = new ColorPixel(Color.BLUE, 
			WINDOW_WIDTH - 1, 0);
	public static final ColorPixel LL_START = new ColorPixel(Color.YELLOW, 0, 
			WINDOW_HEIGHT - 1);
	public static final ColorPixel LR_START = new ColorPixel(Color.GREEN,
			WINDOW_WIDTH - 1, WINDOW_HEIGHT - 1);
}
