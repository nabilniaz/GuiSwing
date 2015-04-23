import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class SwingBorder extends JFrame{
private JFrame frame;
private JPanel panel;
private JTextField fields1,fields2,fields3,fields4,fields5;

	public SwingBorder()  {
	
		fields1 = new JTextField("Hello");
		fields2 = new JTextField("My");
		fields3 = new JTextField("Name");
		fields4 = new JTextField("Is");
		fields5 = new JTextField("Nabil");
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);

		add(fields1,BorderLayout.PAGE_START);
		add(fields2,BorderLayout.CENTER);
		add(fields3,BorderLayout.PAGE_END);
		add(fields4,BorderLayout.LINE_END);
		add(fields5,BorderLayout.LINE_START);

		add(panel);
		setVisible(true);
		setSize(new Dimension(500,500));
		
	
			
		} 
	


	
	
	
public static void main(String[] args) {
	new SwingBorder();

	}

} 
