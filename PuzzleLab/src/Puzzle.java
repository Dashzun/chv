import java.util.Random;

/**
 * This Puzzle is the grid that is displayed to the user.
 * 
 * @author Tyler
 *
 */
public class Puzzle {
	 private String[][] puzzle;
	 
	
	public Puzzle(int n){
		//Create the puzzle
				puzzle = new String[n][n];
				for(int x=0; x < puzzle.length;x++){
					for(int y=0; y < n;y++){
						puzzle[x][y] = randomLetter();
					}
					
				}
		
	}
	/**
	 * Method used to "randomly" determine which letter goes in the current space.
	 * @return
	 */
	public String randomLetter(){
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		Character.toString(c);
		String letter = Character.toString(c);
		return letter;
		
	}
	/**
	 * Method to get the puzzle
	 * @return
	 */
	public String[][] getPuzzle() {
		return puzzle;
	}
	
}
