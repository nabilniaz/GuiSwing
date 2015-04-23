import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class SwingLayout extends JFrame{
private JTextField[] fields = new JTextField[4];
private JFrame frame;
private JPanel panel;
public SwingLayout() {
	frame = new JFrame();
	frame = new JFrame("Test");
	frame.setVisible(true);
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new FlowLayout());
	
	panel = new JPanel();
	panel.setBackground(Color.MAGENTA);
	
	fields[0] = new JTextField("Hello");
	fields[1] = new JTextField("Nabil");
	fields[2] = new JTextField("Niaz");
	fields[3] = new JTextField("!");


	
	frame.add(panel);
	
	for (int i=0;  i<=fields.length; i++){
		panel.add(fields[i]);}
	
	
	
}
public static void main(String[] args) {
new SwingLayout();

}

}
