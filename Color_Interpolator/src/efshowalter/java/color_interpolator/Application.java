package efshowalter.java.color_interpolator;

import java.awt.Color;

import javax.swing.JFrame;

/** 
 * The Application class controls the window and holds all handlers for dealing with
 * user input and graphical updates.
 * 
 * @author efshowalter
 * 
 * **/

public class Application {
	private JFrame window;
	
	public Application() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setLocation(100, 50);
		window.getContentPane().add(new DrawComponent(Constants.UL_START, 
				Constants.UR_START, Constants.LL_START, Constants.LR_START));
		window.setVisible(true);
	}
	
	private void draw() {
		// TODO implement this
	}
}
