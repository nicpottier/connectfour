package connectfour;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * The GameWindow is our JFrame extension which will display our game state.
 * 
 * We specify that we extend JFrame using the 'extends JFrame' syntax. 
 * 
 * @author nicp
 */
public class GameWindow extends JFrame {

	// Our window size, we declare a constants so that we can change it
	// in just one place if we ever change our mind about how big to 
	// make it
	
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
	
	/**
	 * This method is called everytime the window is drawn.  The Graphics
	 * object passed in is used to draw into the window.  It has various methods
	 * such as fillRect(), setColor(), drawRect() and many others.  
	 * 
	 * @param g The graphics object to paint with
	 */
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// LAB3:
		// For Lab3, you want to create a new class, called Board which will
		// take care of drawing the grid for the game pieces.  Have it implement
		// a paint() method to draw the grid pieces.  Then create the Board
		// class in the constructor for GameWindow and call it's paint method here.
	}
}
