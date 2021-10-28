package efshowalter.java.color_interpolator;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JOptionPaneColorChange {
	private JTextField red, green, blue, alpha;
	private Color color;
	
//	private Object[] message = {
//			"Red:", red,
//			"Green:", green,
//			"Blue:", blue,
//			"Alpha:", alpha,
//	};
//	
	public JOptionPaneColorChange(Component parent) {
		red = new JTextField();
		green = new JTextField();
		blue = new JTextField();
		alpha = new JTextField();
		
		GridLayout spacing = new GridLayout(4, 2, 1, 1);
		
		JPanel panel = new JPanel();
		panel.setLayout(spacing);
		panel.add(new JLabel("Red:"));
		panel.add(red);
		panel.add(new JLabel("Green:"));
		panel.add(green);
		panel.add(new JLabel("Blue:"));
		panel.add(blue);
		panel.add(new JLabel("Alpha:"));
		panel.add(alpha);
		
		int choice = JOptionPane.showConfirmDialog(parent, panel, 
				"Enter new RGB values for this corner.", JOptionPane.OK_CANCEL_OPTION);
		if (choice == JOptionPane.OK_OPTION) {
			try {
				color = new Color(
						Integer.parseInt(red.getText()),
						Integer.parseInt(green.getText()),
						Integer.parseInt(blue.getText()),
						Integer.parseInt(alpha.getText()));
			} catch (Exception e) {
				color = Color.WHITE;
			}
			
		}
		
		
	}
	
	public Color getColor() {
		return color;
	}
}
