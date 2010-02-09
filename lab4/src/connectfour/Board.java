package connectfour;

import java.awt.Color;
import java.awt.Graphics;

/**
 * The Board class is responsible for keeping the state of the game board
 * as well as drawing the board as a whole.
 * 
 * @author nicp
 */
public class Board {

	// our board width, in cells
	public static final int WIDTH = 7;
	
	// our board height in cells
	public static final int HEIGHT = 6;
	
	// the size of our cells
	public static final int CELL_SIZE = 100;
	
	/**
	 * Our constructor, called when a new Board is created.
	 */
	public Board(){
	}
	
	public void paint(Graphics g){
		// we will draw our grid in white
		g.setColor(Color.WHITE);
		
		// draw the vertical grid lines
		for(int x=0; x<WIDTH; x++){
			g.drawLine(x * CELL_SIZE, 0, x * CELL_SIZE, GameWindow.WINDOW_HEIGHT);
		}
		// draw our horizontal grid lines
		for(int y=0; y<HEIGHT; y++){
			g.drawLine(0, y * CELL_SIZE, GameWindow.WINDOW_WIDTH, y * CELL_SIZE);
		}
		
		// LAB4: 
		// For LAB4 you will create a Cell class which represents a position on the
		// game board.  Create a 2 dimensional array of these cells that
		// is owned by Board in the Board constructor, then paint those cells here
		// For this lab, make the cell be drawn with a red circle so that the entire
		// board is filled with red circles
	}
}
