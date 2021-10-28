package efshowalter.java.color_interpolator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawComponent extends Component implements MouseListener {
	private Interpolator ip;
	private ColorPixel upperLeft, upperRight, lowerLeft, lowerRight;
	
	public DrawComponent(ColorPixel upperLeft, ColorPixel upperRight, 
			ColorPixel lowerLeft, ColorPixel lowerRight) {
		ip = new Interpolator();
		
		this.upperLeft = upperLeft;
		this.upperRight = upperRight;
		this.lowerLeft = lowerLeft;
		this.lowerRight = lowerRight;
		
		this.addMouseListener(this);
	}

	public void paint(Graphics g) { 	
		for (int x = 0; x < Constants.WINDOW_WIDTH - 1; x++) {
			for (int y = 0; y < Constants.WINDOW_HEIGHT - 1; y++) {
				Color colorTop = ip.interpolateUnevenly(upperLeft.getColor(), upperRight.getColor(), 
						x, Constants.WINDOW_WIDTH - 1);
				Color colorBot = ip.interpolateUnevenly(lowerLeft.getColor(), lowerRight.getColor(), 
						x, Constants.WINDOW_WIDTH - 1);
				
				Color toPaint = ip.interpolateUnevenly(colorTop, colorBot, y, Constants.WINDOW_HEIGHT - 1);
				
				g.setColor(toPaint);
				g.drawLine(x, y, x, y);
			}
		}
	}
	
	private void changeColor(ColorPixel color) {
		JOptionPaneColorChange popup = new JOptionPaneColorChange(this);
		color.setColor(popup.getColor());
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getX() < Math.round(Constants.WINDOW_WIDTH / 4) && 
				e.getY() < Math.round(Constants.WINDOW_HEIGHT / 4)) {
			changeColor(upperLeft);
		}
		else if (e.getX() > Math.round(Constants.WINDOW_WIDTH - (Constants.WINDOW_WIDTH / 4)) && 
				e.getY() < Math.round(Constants.WINDOW_HEIGHT / 4)) {
			changeColor(upperRight);
		}
		else if (e.getX() < Math.round(Constants.WINDOW_WIDTH / 4) && 
				e.getY() > Math.round(Constants.WINDOW_HEIGHT - (Constants.WINDOW_HEIGHT / 4))) {
			changeColor(lowerLeft);
		}
		else if (e.getX() > Math.round(Constants.WINDOW_WIDTH - (Constants.WINDOW_WIDTH / 4)) && 
				e.getY() > Math.round(Constants.WINDOW_HEIGHT - (Constants.WINDOW_HEIGHT / 4))) {
			changeColor(lowerRight);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
