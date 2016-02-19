import java.util.ArrayList;
import java.util.Stack;

/**
 * PathFinder uses an algorithm to create a list of all possible words in our 
 * puzzle.
 * @author DaShzun
 *
 */
public class PathFinder {
	private String[][] puzzleArray;
	private int rowLength;
	private int colLength;

	/**
	 * Construct the PathFinder
	 * @param puzzArray, 2D array representing our puzzle
	 */
	public PathFinder(String[][] puzzArray) {
		this.puzzleArray = puzzArray;
		rowLength = puzzleArray[0].length;
		colLength = puzzleArray.length;
		
	}

	
	/**
	 * The findWord starter, this takes care of the empty base used Set
	 * @param m
	 * @return
	 */
	public ArrayList<String> findWordsStarter(int m){
		//for the first call we want an empty stack for the parameter
		Stack<String> usedSet = new Stack<String>();
		ArrayList<String> returnList = new ArrayList<String>();//the list we'll return
		for(int i=0;i<rowLength; i++){//for each index get the list of all possible words and add them to our returnList
			for(int j=0; j<colLength; j++){
				ArrayList<String> indexList = this.findWords(m, i, j, usedSet);
				returnList.addAll(indexList);
			}
		}
		
		return returnList;
	}
	
	/**
	 * Recursively creates all possible words from starting point (r,c)
	 * without repeating locations and going to length m.
	 * @param m
	 * @param row
	 * @param col
	 * @param usedSet
	 * @return list of all possible words
	 */
	public ArrayList<String> findWords(int m, int row, int col, Stack<String> usedSet) {
		ArrayList<String> returnList = new ArrayList<String>();
		//***Make sure we are in bounds and not considering an m that is 0***///
		if (m <= 0) {// no words to construct
			return returnList;
		}
		//if the row/column index is too big to fit in our puzzle, or a negative value
		if (row >= rowLength || col >= colLength || row < 0 || col < 0 ) {// ignoring words out of bounds
			return returnList;
		}
		//***Make sure we are not visiting a (r,c) we've already been to***///
		String key = Integer.toString(row) + Integer.toString(col);//create a key for our (r,c) 
		if(usedSet.contains(key)){//make sure we haven't visited here yet
			return returnList;
		}
		//***consider words starting/rooted at r***//
		String letter = puzzleArray[row][col];
		if (m == 1) {// recursive base case
			returnList.add(letter);// one letter words rooted at r,c
			return returnList;
		}
		
		ArrayList<Tuple> neighbors = this.generateNeighbors(row, col);//generate all the neighbors
		usedSet.push(key);//add the key, which is the current location, to the usedSet
		
		//for each neighbor, create a sub-word
		for(Tuple n: neighbors){
			//get the neighbor row & col values
			int nr = n.getR();
			int nc = n.getC();
		
			ArrayList<String> subWords 	= this.findWords(m-1, nr, nc, usedSet);
			//we have to prepend the letter to each "word"
			for(String word: subWords){
				String newWord = letter+word;
				returnList.add(newWord);
			}
		}
		usedSet.pop();//as we go back up, we need to be able to use those letter again, so pop the off
		return returnList;
	}



	/**
	 * Generate all the neighbors at a point. This is a helper function
	 * for the find path functin
	 * @param row, column values
	 */
	public ArrayList<Tuple> generateNeighbors(int row, int col){
		ArrayList<Tuple> neighbors = new ArrayList<Tuple>();

		//the 8 neighbors, we have code above that will weed out bad locations so we consider them all
		Tuple neighbor0 = new Tuple(row-1, col+1);
		Tuple neighbor1 = new Tuple(row-1, col-1);
		Tuple neighbor2 = new Tuple(row-1, col);
		Tuple neighbor3 = new Tuple(row, col-1);
		Tuple neighbor4 = new Tuple(row, col+1);
		Tuple neighbor5 = new Tuple(row+1, col);
		Tuple neighbor6 = new Tuple(row+1, col+1);
		Tuple neighbor7 = new Tuple(row+1, col-1);
		//keep our neighbors in a list for convince
		neighbors.add(neighbor0);
		neighbors.add(neighbor1);
		neighbors.add(neighbor2);
		neighbors.add(neighbor3);
		neighbors.add(neighbor4);
		neighbors.add(neighbor5);
		neighbors.add(neighbor6);
		neighbors.add(neighbor7);

		return neighbors;
	}
}
