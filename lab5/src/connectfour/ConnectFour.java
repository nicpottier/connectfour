package connectfour;

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

		// create our game window and show it
		GameWindow window = new GameWindow();
		window.setVisible(true);
	}
}
