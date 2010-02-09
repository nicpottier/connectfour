package connectfour;

import javax.swing.JFrame;

/**
 * This is our main class.. when we run the game, we will do so using:
 *   java connectfour.ConnectFour
 *   
 * The Java virtual machine will look for the main() method below and run it.
 * 
 * You can run this program from within Eclipse:
 *   1) right click
 *   2) select "Run As"
 *   3) select "Java Application"
 *   
 * The output will appear in the console below
 * 
 * @author nicp
 */
public class ConnectFour {

	/**
	 * The main method is the entry point for a Java program.
	 * 
	 * @param argv An array of arguments passed from the command line
	 */
	public static void main(String argv[]){
		// any code you put here will be run
		System.out.println("Hello ConnectFour");
		
		// create a new JFrame
		JFrame window = new JFrame();
		
		// set our size to 700x600
		window.setSize(700, 600);
		
		// make it visible
		window.setVisible(true);
	}
}
