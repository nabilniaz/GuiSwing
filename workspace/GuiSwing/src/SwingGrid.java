import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingGrid {
	private JTextField[] fields = new JTextField[4];
	private JFrame frame;
	private JPanel panel;
	public SwingGrid() {

		frame = new JFrame("Test2");

		
		
		
		
		fields[0] = new JTextField("Hello");
		fields[1] = new JTextField("Nabil");
		fields[2] = new JTextField("Niaz");
		fields[3] = new JTextField("!");


		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setLayout(new GridLayout(2,2));
		
	
		frame.add(panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
		//setSize(new Dimension(200,200));
		for (int i=0; i<=fields.length; i++){
			panel.add(fields[i]);
		} 
	
	}
	public static void main(String[] args) {
	new SwingGrid();
	
	}

}
