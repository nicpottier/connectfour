package connectfour;

import javax.swing.JFrame;

/**
 * The GameWindow is our JFrame extension which will display our game state.
 * 
 * We specify that we extend JFrame using the 'extends JFrame' syntax. 
 * 
 * @author nicp
 */
public class GameWindow extends JFrame {

	// our window size, we declare a constants so that we can change it
	// in just one place later on
	
	// Java constants are declared using the syntax: 'public static final'
	public static final int WIDTH = 700;
	public static final int HEIGHT = 600;	
	
	/**
	 * This is the constructor.  This is called when you construct a new
	 * GameWindow. 
	 */
	public GameWindow(){
		// set our size
		setSize(WIDTH, HEIGHT);
	}
}
