package Chapter_03;

import javax.swing.JOptionPane;

public class Dialog1 {

	public static void main(String[] args) {
		
		// display a dialog with a message
		JOptionPane.showMessageDialog(null, "Welcome\nto\nJava");
		
		// prompt user to enter name 
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// create the message 
		String message = String.format("Welcome, %s, to Jave Programming!", name); 
		
		// display the message to welcome the user by name
		JOptionPane.showMessageDialog( null, message); 
		
	} // end main
}	// end class Dialog1
