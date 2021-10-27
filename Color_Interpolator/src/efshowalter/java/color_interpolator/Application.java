package efshowalter.java.color_interpolator;

import javax.swing.JFrame;

/** 
 * The Application class controls the window and holds all handlers for dealing with
 * user input and graphical updates.
 * 
 * @author efshowalter
 * 
 * **/

public class Application {
	JFrame window;
	Interpolator ip;
	
	Application() {
		prepareGUI();
	}
	
	void prepareGUI() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setLocation(100, 50);
		window.setVisible(true);
	}
	
	void draw() {
		// TODO implement this
	}
}
