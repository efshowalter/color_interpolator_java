package efshowalter.java.color_interpolator;

/**
 * Color Interpolator Application by Evelyn Showalter
 * 
 * Application that generates a rectangle where each corner holds a different color and all other pixel colors
 * are determined by interpolating these four values. The colors are changeable by clicking near the corners
 * and entering valid RGBA values - bogus values will result in a default to white.
 * 
 * @author efshowalter
 *
 */

public class Main {
	static Application colorApp;
	
	public static void main(String[] args) {
		colorApp = new Application();
	}
}
