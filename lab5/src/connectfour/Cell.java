package connectfour;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class represents a single cell on the game board.  We draw cells
 * as red circles. 
 *
 * @author nicp
 *
 */
public class Cell {

	/**
	 * Constructor for a new cell.
	 * 
	 * @param x The x position on the board.
	 * @param y The y position on the board.
	 */
	public Cell(int x, int y){
		m_x = x;
		m_y = y;
	}
	
	/**
	 * Paints our cell.  For now we will just draw a red circle
	 * 
	 * @param g The graphics object to use for painting
	 */
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(m_x * Board.CELL_SIZE, m_y * Board.CELL_SIZE,
				   Board.CELL_SIZE, Board.CELL_SIZE);
	}
	
	/** our x position on the board */
	private int m_x;
	
	/** our y position on the board */
	private int m_y;
}
