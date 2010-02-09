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
		// initialize our board cells
		m_cells = new Cell[WIDTH][HEIGHT];
		
		for(int x=0; x<WIDTH; x++){
			for(int y=0; y<HEIGHT; y++){
				m_cells[x][y] = new Cell(x, y);
			}
		}
	}
	
	/**
	 * Selects the cell at the passed in position.
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public void selectCell(int x, int y){
		m_cells[x][y].select();
	}
	
	/**
	 * This method draws our board.  The board first draws the grid, then each 
	 * cell.
	 * @param g The graphics object to draw to
	 */
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
		
		// paint each of our cells
		for(int x=0; x<WIDTH; x++){
			for(int y=0; y<HEIGHT; y++){
				m_cells[x][y].paint(g);
			}
		}
	}
	
	/** The cells for this board */
	private Cell[][] m_cells;
}
