package Chapter_04;

import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	// draw an X from the corners of the panel 
	public void paintCpmponent( Graphics g)
	{
		// call paintComponent to ensure the panel display correctly
		super.paintComponent( g ); 
		
		int width = getWidth(); // total width
		int height = getHeight(); // total height
		
		// draw a line from the upper-left to the lower-right
		g.drawLine(0, 0, width, height);
		
		// draw a line from the lower-left to the upper-right
		g.drawLine(0,  height, width, 0);
	}// end method paintComponent  
}// end class DrawPanel 
