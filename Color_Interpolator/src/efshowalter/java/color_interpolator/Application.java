package efshowalter.java.color_interpolator;

import javax.swing.JFrame;

public class Application {
	JFrame window;
	
	Application() {
		prepareGUI();
	}
	
	void prepareGUI() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setLocation(100, 50);
		window.setVisible(true);
	}
}
