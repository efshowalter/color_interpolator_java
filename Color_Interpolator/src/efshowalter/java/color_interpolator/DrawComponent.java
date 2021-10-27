package efshowalter.java.color_interpolator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawComponent extends Component {
	private Interpolator ip;
	private ColorPixel upperLeft, upperRight, lowerLeft, lowerRight;
	
	public DrawComponent(ColorPixel upperLeft, ColorPixel upperRight, 
			ColorPixel lowerLeft, ColorPixel lowerRight) {
		ip = new Interpolator();
		
		this.upperLeft = upperLeft;
		this.upperRight = upperRight;
		this.lowerLeft = lowerLeft;
		this.lowerRight = lowerRight;
	}

	public void paint(Graphics g) { 
		setCorners(g);
		
		for (int x = 0; x < Constants.WINDOW_WIDTH; x++) {
			for (int y = 0; y < Constants.WINDOW_HEIGHT; y++) {
				Color colorTop = ip.interpolateUnevenly(upperLeft.getColor(), upperRight.getColor(), 
						x, Constants.WINDOW_WIDTH);
				Color colorBot = ip.interpolateUnevenly(lowerLeft.getColor(), lowerRight.getColor(), 
						x, Constants.WINDOW_WIDTH);
				
				Color toPaint = ip.interpolateUnevenly(colorTop, colorBot, y, Constants.WINDOW_HEIGHT);
				
				g.setColor(toPaint);
				g.drawLine(x, y, x, y);
			}
		}
	}
	
	private void setCorners(Graphics g) {
		// set upper left
		g.setColor(upperLeft.getColor());
		g.drawLine(upperLeft.getX(), upperLeft.getY(), 
				upperLeft.getX(), upperLeft.getY());
				
		// set upper right
		g.setColor(upperRight.getColor());
		g.drawLine(upperRight.getX(), upperRight.getY(), 
				upperRight.getX(), upperRight.getY());
				
		// set lower left
		g.setColor(lowerLeft.getColor());
		g.drawLine(lowerLeft.getX(), lowerLeft.getY(), 
				lowerLeft.getX(), lowerLeft.getY());
				
		// set lower right
		g.setColor(lowerRight.getColor());
		g.drawLine(lowerRight.getX(), lowerRight.getY(),
				lowerRight.getX(), lowerRight.getY());
	}
}
