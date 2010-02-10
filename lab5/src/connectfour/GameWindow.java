package connectfour;

import java.awt.Color;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * The GameWindow is our JFrame extension which will display our game state.
 * 
 * We specify that we extend JFrame using the 'extends JFrame' syntax. 
 * 
 * @author nicp
 */
public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// how tall our title bar is.. we need to account for this when painting
	// and when dealing with mouse clicks
	public static final int TITLE_BAR = 20;
	
	// We set our width and height based on our Board and cell size
	public static final int WINDOW_WIDTH = Board.WIDTH * Board.CELL_SIZE;
	public static final int WINDOW_HEIGHT = Board.HEIGHT * Board.CELL_SIZE + TITLE_BAR;
	
	/**
	 * This is the constructor.  This is called when you construct a new
	 * GameWindow. 
	 */
	public GameWindow(){
		// set our size
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// make the application end when the user closes the window
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// initialize our board
		m_board = new Board();
		
		// LAB5:
		// For Lab5, we want to add a MouseEventListener that tracks where the
		// user clicks.  We want to convert the coordinates of that click to
		// a cell position.  Then add new methods to Board and Cell that let you 
		// set whether a red circle is drawn in a cell at that position.
		// 
		// hint:  look at the addMouseListener() method in JFrame.
		// hint2: look up MouseListener and MouseAdapter
	}
	
	/**
	 * This method is called every time the window is drawn.  The Graphics
	 * object passed in is used to draw into the window.  It has various methods
	 * such as fillRect(), setColor(), drawRect() and many others.  
	 * 
	 * @param g The graphics object to paint with
	 */
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// Translate the graphics object vertically, so that everything 
		// will paint below the title bar
		g.translate(0, TITLE_BAR);
		
		// now have our board paint, passing down our graphics object
		m_board.paint(g);
	}
	
	/** Our board */
	private Board m_board;
}
